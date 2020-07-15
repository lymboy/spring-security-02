package com.lymboy.security.browser.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lymboy.security.core.properties.LoginType;
import com.lymboy.security.core.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.ExceptionMappingAuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>登陆错误处理器</p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-14
 */
@Component
@Slf4j
public class MyAuthenticationFailHandler extends ExceptionMappingAuthenticationFailureHandler {

    @Resource
    private ObjectMapper objectMapper;

    @Resource
    private SecurityProperties securityProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        log.info("登录失败");

        if (ObjectUtils.nullSafeEquals(securityProperties.getBrowser().getLoginType(), LoginType.REDIRECT)) {
            super.onAuthenticationFailure(request, response, exception);
        } else {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(objectMapper.writeValueAsString(exception));
        }

    }
}
