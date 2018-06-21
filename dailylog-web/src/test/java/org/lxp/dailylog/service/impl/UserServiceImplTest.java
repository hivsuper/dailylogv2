package org.lxp.dailylog.service.impl;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.lxp.dailylog.util.CiphertextUtil.encode;

import java.util.Calendar;

import javax.annotation.Resource;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lxp.dailylog.config.MemoryDBTest;
import org.lxp.dailylog.model.UserBase;
import org.lxp.dailylog.service.UserService;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@MemoryDBTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    public void testAdd() {
        UserBase user = new UserBase();
        user.setUsername("super@2.com");
        user.setPassword(encode("727dfbdc1a4ee249f3f08c247a5669d5"));
        user.setLastlogintime(Calendar.getInstance().getTime());
        user = userService.add(user);
        assertTrue(user.getSeqid() > 0);
    }

    @Test
    public void testQueryOneUserByUsername() {
        UserBase user = userService.queryOneUserByUsername("super@1.com");
        assertThat(user.getSeqid(), Matchers.is(1L));
    }

}