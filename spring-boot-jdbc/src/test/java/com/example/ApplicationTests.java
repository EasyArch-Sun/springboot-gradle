package com.example;

import com.example.service.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() {

        userService.deleteAllUsers();
    }

    @Test
    public void test() throws Exception{
        userService.create("a",1);
        userService.create("vv",3);
        userService.create("sss",5);
        userService.create("rrr",1);
        userService.create("er",1);

//        Assert.assertEquals(5,userService.getAllUsers().intValue());

        userService.deleteByName("sss");
        userService.deleteByName("rrr");

//        Assert.assertEquals(3,userService.getAllUsers().intValue());
    }
}
