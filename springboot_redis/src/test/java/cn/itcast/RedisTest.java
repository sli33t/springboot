package cn.itcast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisApplication.class)
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void redisTest(){

        //----------------------------------存入
        Map map = new HashMap();
        map.put("heima118_1", 1);
        map.put("heima118_2", 2);
        map.put("heima118_3", 3);
        map.put("heima118_4", 4);

        String value = JSON.toJSONString(map);
        stringRedisTemplate.opsForValue().set("heima118", value);
        //----------------------------------存入

        //----------------------------------读取
        String heima118 = stringRedisTemplate.opsForValue().get("heima118");
        System.out.println("===========读取出的String："+heima118);

        Map result = new HashMap();
        result = JSONObject.parseObject(heima118, Map.class);
        System.out.println("===========读出的String转化为Map："+result);
    }
}
