package com.lymboy.security.browser.support;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>返回给前台的简单包装类</p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-14
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimpleResponse<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

    public SimpleResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static SimpleResponse<String> UNAUTHORIZED() {
        return new SimpleResponse(401, "访问的服务未授权");
    }
}
