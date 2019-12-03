package com.yi.easyfind.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yi.easyfind.entity.SysUser;

public interface SysUserService extends IService<SysUser> {
    SysUser getUserByUserName(String username);
    SysUser getSysUserById(String id);
}
