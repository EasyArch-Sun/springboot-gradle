package com.example;

import com.example.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Resource
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws NullPointerException {

        User user = new User(1, "xxx");
        redisTemplate.opsForValue().set(user.getName(), user);
        User user1 = new User(2, "yyy");
        redisTemplate.opsForValue().set(user1.getName(), user1);

        Assert.assertEquals(1, redisTemplate.opsForValue().get("xxx").getAge().intValue());
        Assert.assertEquals(2, redisTemplate.opsForValue().get("yyy").getAge().intValue());


        System.out.println("完成redis。。。。");


    }
}
