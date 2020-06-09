package cn.itcast.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {


    @Bean
    public User user(){
        return new User();
    }


    @Bean
    public Role role(){
        return new Role();
    }
}
