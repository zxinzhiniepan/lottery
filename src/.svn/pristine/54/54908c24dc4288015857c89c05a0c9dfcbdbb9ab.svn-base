package com.test;

import com.tiantian.pojo.Manager;
import com.tiantian.pojo.User;
import com.tiantian.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class ProjectTest {
    @Autowired
    private UserService userService;
    private static final Logger log = LoggerFactory.getLogger(ProjectTest.class);

    @Test
    public void show(){
        User user = userService.findAllUser().get(0);
        log.info(user.toString());
    }

    @Test
    public void show2(){
        User user = userService.findUserById(1L);
        log.info(user.toString());
    }

    @Test
    public void show3(){
        User currentUser = new User();
        currentUser.setuId(2L);
        currentUser.setManager(new Manager());
        currentUser.getManager().setmId(2L);
        try {
            List<User> userList = userService.findUserSomeInfoList(currentUser);
            log.info(userList.toString());
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }

    @Test
    public void show4(){
        User currentUser = new User();
        User findUser = new User();
        findUser.setuName("leader");
        currentUser.setuId(1L);
        currentUser.setManager(new Manager());
        currentUser.getManager().setmId(2L);
        try {
            User user = userService.findUserSomeInfo(currentUser,findUser);
            log.info(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void show5(){
        User user1 = new User();
        user1.setuName("leader");
        user1.setuPassword("503647515");
        User user = userService.login(user1);
        if(user.getManager() != null){
            log.info("manager不为空");
        }
        log.info(user.toString());
    }
    @Test
    public void show6(){
        User user1 = new User();
        user1.setuName("administrator");
        user1.setuPassword("123");
        User user = userService.managerLogin(user1);
        log.info(user.toString());
    }

    @Test
    public void show7(){
        User user = new User();
        user.setuName("a123_45_6");
        user.setuPassword("_123456__7");
        log.info("是否注册成功" + userService.register(user));

    }

}
