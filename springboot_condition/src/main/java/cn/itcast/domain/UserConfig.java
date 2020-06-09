package cn.itcast.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    //@Conditional(MyCondition.class)
    //需求：引入Jedis，可以加载user这个Bean
    //@MyConditional("redis.clients.jedis.Jedis")
    @ConditionalOnProperty(name = "itheima", havingValue = "heima118")
    public User user(){
        return new User();
    }
}
