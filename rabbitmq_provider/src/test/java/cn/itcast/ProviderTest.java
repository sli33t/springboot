package cn.itcast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class ProviderTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void sendMsg(){
        amqpTemplate.convertAndSend("", "heima118_queue", "这是黑马118最后一天");
    }

}
