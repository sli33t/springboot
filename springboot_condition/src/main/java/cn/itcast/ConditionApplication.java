package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionApplication {

    public static void main(String[] args) {
        //ConfigurableApplicationContext是spring的IOC容器，可以获取环境变量，还可以获取所有的Bean
        ConfigurableApplicationContext context = SpringApplication.run(ConditionApplication.class, args);

        /*Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);*/

        Object user = context.getBean("user");
        System.out.println(user);
    }
}
