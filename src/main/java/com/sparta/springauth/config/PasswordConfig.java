package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    /**
     *  PasswordEncoder: 인터페이스
     *      -> return 타입: BCryptPasswordEncoder (PasswordEncoder의 구현 클래스)
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        // 비밀번호를 암호화하는 해시 함수
        return new BCryptPasswordEncoder();
    }
}