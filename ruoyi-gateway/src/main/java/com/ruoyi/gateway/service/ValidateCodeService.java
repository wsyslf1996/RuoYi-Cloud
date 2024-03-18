package com.ruoyi.gateway.service;

import java.io.IOException;
import com.ruoyi.common.core.exception.CaptchaException;
import com.ruoyi.common.core.web.domain.R;

/**
 * 验证码处理
 *
 * @author ruoyi
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public R createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
