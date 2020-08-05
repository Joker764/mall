package com.hachi.mall.service;

import com.hachi.mall.mbg.model.UmsAdmin;
import com.hachi.mall.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author yang
 * @version 1.0.0
 * @date 2020/8/5 20:01
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
