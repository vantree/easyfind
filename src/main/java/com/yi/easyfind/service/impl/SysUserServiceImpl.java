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
    public SysUser getUserByPhone(String phone) {
        return baseMapper.getUserByPhone(phone);
    }

    @Override
    public SysUser getUserById(String id) {
        return baseMapper.getUserById(id);
    }
}
