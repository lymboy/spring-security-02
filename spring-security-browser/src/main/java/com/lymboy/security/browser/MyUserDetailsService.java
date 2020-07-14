package com.lymboy.security.browser;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * <p>自定义用户登录逻辑</p>
 *
 * @author sairo
 * @version 1.0
 * @since 2020-07-12
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(username, "$2a$10$.YFK7WelgaAnt3fkSrudvuKab1ydmeiRYqJSwbdb89NqslcVe67Ua",
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
