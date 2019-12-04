package com.yi.easyfind.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yi.easyfind.entity.SysUser;

public interface SysUserService extends IService<SysUser> {
    SysUser getUserByPhone(String phone);
    SysUser getUserById(String id);
}
