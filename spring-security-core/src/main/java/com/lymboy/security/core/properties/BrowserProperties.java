package com.lymboy.security.core.properties;

import lombok.Data;

/**
 * <p>关于浏览器的安全配置类</p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-14
 */
@Data
public class BrowserProperties {

    private String loginPage = "/sign-in.html";
}
