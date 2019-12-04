package com.yi.easyfind.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yi.easyfind.entity.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 通过用户名查询
     * @param username
     * @return
     */
    SysUser getUserByPhone(@Param(value = "phone") String username);

    /**
     *
     * @param id
     * @return
     */
    SysUser getUserById(@Param(value = "id") String id);
}
