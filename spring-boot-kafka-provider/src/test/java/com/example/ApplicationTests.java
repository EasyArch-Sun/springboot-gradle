package com.example;


import com.example.domain.User;
import com.example.domain.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void testUserMapper() throws Exception{

        //insert
        userMapper.insert("xxx",12);
        User user;
        user = userMapper.findByName("xxx");
        //Assert.assertEquals(12,user.getAge());

        //update
        user.setAge(30);
        userMapper.update(user);
        user = userMapper.findByName("AAA");
        //Assert.assertEquals(30,user.getAge());

        //delete
        userMapper.delete(user.getId());
        user = userMapper.findByName("AAA");
        Assert.assertEquals(null, user);

    }

}
