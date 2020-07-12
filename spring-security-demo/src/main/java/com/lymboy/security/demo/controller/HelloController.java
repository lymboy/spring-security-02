package com.lymboy.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-12
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "HELLO WORLD!";
    }
}
