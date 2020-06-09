package cn.itcast.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @RabbitListener(queues = "heima118_queue")
    public void receiveMsg(String msg){
        System.out.println("=============="+msg);
    }
}
