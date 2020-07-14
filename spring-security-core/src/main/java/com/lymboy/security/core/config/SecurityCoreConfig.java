package com.lymboy.security.core.config;

import com.lymboy.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Security核心配置类</p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-14
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
