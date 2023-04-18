package com.danest.portfoliobackend.service;

import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    private final List<UserDetails> users;

    CustomUserDetailsService() {
        UserDetails firstUser = User.withUsername("dani").password("123").authorities("read").build();
        UserDetails secondUser = User.withUsername("abel").password("321").authorities("read").build();
        this.users = List.of(firstUser, secondUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
