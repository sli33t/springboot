package cn.itcast.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MQConfig {

    @Bean
    public Queue queue(){
        return new Queue("heima118_queue", false);
    }
}
