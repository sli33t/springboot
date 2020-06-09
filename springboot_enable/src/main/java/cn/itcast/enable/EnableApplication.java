package cn.itcast.enable;

import cn.itcast.domain.EnableUser;
import cn.itcast.domain.Role;
import cn.itcast.domain.User;
import cn.itcast.domain.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

import java.util.Map;



//需求：在这里通过一个Enable注解，加载User这个Bean
/**
 * 4种方法：
 * 1.扩大扫描包的范围
 *     cn.itcast.enable
 *     cn.itcast.domain
 * 2.导入User类
 * 3.导入配置类
 * 4.Enable注解
 */

//@ComponentScan("cn.itcast.domain")
//@Import(User.class)
//@Import(UserConfig.class)
//@EnableUser

/**
 * 通过@Import加载User这个Bean
 *  4种方法：
 *  1.导入Bean，通过@Import(User.class)
 *  2.导入配置类，通过@Import(UserConfig.class)
 *  3.导入ImportSelector实现类
 *  4.导入ImportBeanDefinitionRegistrar实现类
 */



@SpringBootApplication
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
public class EnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableApplication.class, args);

        /*Object user = context.getBean("user");
        System.out.println(user);

        Object role = context.getBean("role");
        System.out.println(role);*/

        /*Object user = context.getBean("user");
        System.out.println(user);

        Object role = context.getBean("role");
        System.out.println(role);*/

        /*Map<String, User> map = context.getBeansOfType(User.class);
        System.out.println(map);

        Object bean = context.getBean("cn.itcast.domain.User");
        System.out.println(bean);*/


        Jedis jedis = (Jedis) context.getBean("jedis");
        System.out.println(jedis);

        jedis.set("heima118", "11:28");

        String heima118 = jedis.get("heima118");
        System.out.println(heima118);
    }
}
