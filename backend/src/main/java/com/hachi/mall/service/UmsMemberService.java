package com.hachi.mall.service;

import com.hachi.mall.common.api.CommonResult;

/**
 * 会员管理 Service
 *
 * @author yang
 * @version 1.0.0
 * @date 2020/8/4 20:31
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
