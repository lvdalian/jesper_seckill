package edu.nyist.seckill.vo;

import edu.nyist.seckill.validator.IsMobile;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author rogers
 *
 */
@Data
public class LoginVo {
    /**
     * 手机号码
     */
    @NotNull
    @IsMobile  //因为框架没有校验手机格式注解，所以自己定义
    private String mobile;
    /**
     * 密码
     */
    @NotNull
    private String password;
}
