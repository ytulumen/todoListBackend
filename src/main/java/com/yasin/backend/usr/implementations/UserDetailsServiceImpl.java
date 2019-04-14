package com.yasin.backend.usr.implementations;

import com.yasin.backend.usr.UserManager;
import com.yasin.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserManager userManager;

    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userManager.findByName(s);
        GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN"); // TODO: 9.04.2019 must check there

        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), Collections.singletonList(authority));
    }
}
