package com.test;

import com.tiantian.pojo.User;
import com.tiantian.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppStart.class)
public class ProjectTest {
    @Autowired
    private UserService userService;
    private static final Logger log = LoggerFactory.getLogger(ProjectTest.class);

    @Test
    public void show(){
        User user = userService.findAllUser().get(0);
        log.info("+++++++++++++++++++++" + user.getuName());
        log.info("hello");
    }

    @Test
    public void show2(){
        User user = userService.findAll().get(0);
        log.info("+++++++++++++++++++++" + user.getuName());
    }

}