package com.test;

import com.tiantian.pojo.User;
import org.junit.Test;

/**
 * 用户互相关注实体类
 *
 * @author Mr.Li
 * tell:18900709087
 * create in 11:02 2018/5/12
 */
public class Test2 {
    @Test
    public void test(){
        User user = new User();
        user.setuId(1L);
        user.setuName("a503647515");
        user.setuPassword("503647515");
        System.out.print(user.toString());
    }
}
