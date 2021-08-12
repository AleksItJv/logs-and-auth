package com.app;

import com.app.entities.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/app-tests-ctx.xml"})
public class UnitTester {

    @Autowired
    List<User> usersList;

    @Autowired
    @Qualifier(value = "user1")
    User user;

    @Test
    public void testBook() {
        Assert.assertEquals("SameUser1", user.getName());
    }

    @Test
    public void testBook5() {
        Assert.assertFalse(usersList.isEmpty());
        Assert.assertTrue(usersList.contains(user));
        System.out.println(usersList);
    }

}
