package com.yi.easyfind.service.impl;

import com.yi.easyfind.entity.SysUser;
import com.yi.easyfind.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.getUserByUserName(username);
        if(sysUser == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        if("A".equals(sysUser.getIdentity())) {
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }else{
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
        sysUser.setAuthorities(grantedAuthorityList);
        return sysUser;
    }
}
