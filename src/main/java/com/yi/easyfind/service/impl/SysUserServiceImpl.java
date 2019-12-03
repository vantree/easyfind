package com.yi.easyfind.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yi.easyfind.entity.SysUser;
import com.yi.easyfind.mapper.SysUserMapper;
import com.yi.easyfind.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser getUserByUserName(String username) {
        System.out.println("暂时无数据库，");
        return null;
    }

    @Override
    public SysUser getSysUserById(String id) {
        System.out.println("暂时无数据库");
        return null;
    }
}
