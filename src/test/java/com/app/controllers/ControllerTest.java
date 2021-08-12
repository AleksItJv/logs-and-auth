package com.app.controllers;

import com.app.entities.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/app-tests-ctx.xml"})
@WebAppConfiguration(value = "/WEB-INF/web.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    User newUser = new User();

    @Before
    public void init() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();

        newUser.setLogin("Al");
        newUser.setEmail("a@gmail.com");
        newUser.setPassword("123");
        newUser.setName("Al");
    }

    @Test
    public void checkServletContext() {
        ServletContext servletContext = webApplicationContext.getServletContext();

        assertNotNull(servletContext);
        assertTrue(servletContext instanceof MockServletContext);
        assertNotNull(webApplicationContext.getBean("userServlet"));
    }

    @Test
    public void addUser() throws Exception {
        this.mockMvc.perform(get("/users/add")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("addUser.jsp"));
    }

    @Test
    public void addUserPost() throws Exception {
        this.mockMvc.perform(post("/users/add")
                .flashAttr("user", newUser))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/users/all"))
                .andExpect(view().name("redirect:/users/all"))
                .andDo(print());
    }

    @Test
    public void findUserById() throws Exception {
        this.mockMvc.perform(post("/users/findUserById")
            .param("id", "1"))
            .andDo(print())
            .andExpect(status().isOk())
            .andReturn().getModelAndView().getModel().get("user");
    }

    @Test
    public void findUserByEmailTestGet() throws Exception {
        mockMvc.perform(get("/users/findUserByEmail"))
                .andExpect(view().name("findUserByEmail.jsp"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void findUserByEmailTestPost() throws Exception {
        this.mockMvc.perform(post("/users/findUserByEmail")
            .param("email", "a@gmail.com")).andDo(print()).andExpect(status().isOk())
            .andReturn().getModelAndView().getModel().get("user");
    }



}
