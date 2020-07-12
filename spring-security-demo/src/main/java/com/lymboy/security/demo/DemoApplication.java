package com.lymboy.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p></p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-12
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lymboy.security"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
