package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class MyRedisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyRedisApplication.class, args);

        Jedis jedis = (Jedis) context.getBean("jedis");

        jedis.set("heima118", "11:47");
        String heima118 = jedis.get("heima118");
        System.out.println(heima118);
    }
}
