package com.app.controllers;

import com.app.authorize.Authorization;
import com.app.services.interfaces.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthorizationController {
    private ApplicationContext applicationContext;
    private BookDAO bookDAO;

    @GetMapping(value = "authorize/all")
    public ModelAndView listAllBooks(ModelAndView modelAndView) {

        modelAndView.addObject("list", bookDAO.findAll());
        modelAndView.setViewName("../books/allBooks.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/authorize-me")
    public ModelAndView authorize(ModelAndView modelAndView) {
        Authorization authorization = applicationContext.getBean("userAuthorized", Authorization.class);
        authorization.setAuthorized(Boolean.TRUE);
        modelAndView.setViewName("authorise.jsp");

        return modelAndView;
    }

    @GetMapping(value = "/un_authorize-me")
    public ModelAndView unAuthorize(ModelAndView modelAndView) {
        Authorization authorization = applicationContext.getBean("userAuthorized", Authorization.class);
        authorization.setAuthorized(Boolean.FALSE);
        modelAndView.setViewName("index.jsp");

        return modelAndView;
    }

    @GetMapping(value = "/name/{userName}")
    public ModelAndView greeting(@PathVariable String userName, ModelAndView modelAndView) {
        modelAndView.setViewName("forward:/greeting.jsp");
        modelAndView.addObject("userName", userName);
        return modelAndView;
    }

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
