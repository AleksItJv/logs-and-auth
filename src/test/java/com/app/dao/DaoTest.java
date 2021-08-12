package com.app.dao;

import com.app.dao.repositories.UserRepository;
import com.app.dao.services.UserService;
import com.app.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

public class DaoTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("log1", "Alex", "123", "alex@ukr.net"));
        userList.add(new User("log2", "Alice", "123", "alice@ukr.net"));
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAllUsers() throws InterruptedException {
        when(userRepository.findAll()).thenReturn(userList);
        Assert.assertEquals(userList, userService.getAllUsers());

        System.out.println(userService.getAllUsers());
    }

    @Test
    public void getUserByLoginTest() {
        when(userRepository.getUserByLogin("log1")).
                thenReturn(userList.stream().filter(elem -> elem.getLogin().equals("log1"))
                        .collect(Collectors.toList()));

        System.out.println(userService.getUsersByLogin("log1"));
    }

}
