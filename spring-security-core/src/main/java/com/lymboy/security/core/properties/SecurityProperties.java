package com.lymboy.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>系统配置类，直接与外部交互</p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-14
 */
@Data
@ConfigurationProperties(prefix = "lymboy.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private OAuth2Properties auth2 = new OAuth2Properties();

    private SocialProperties social = new SocialProperties();

    private ValidateProperties validate = new ValidateProperties();
}
