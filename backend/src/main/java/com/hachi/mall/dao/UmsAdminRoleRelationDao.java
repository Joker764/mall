package com.hachi.mall.dao;

import com.hachi.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yang
 * @version 1.0.0
 * @date 2020/8/5 20:04
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括 +- 权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
