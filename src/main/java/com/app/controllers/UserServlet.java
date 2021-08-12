package com.app.controllers;

import com.app.dao.interfaces.UserDAO;
import com.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/users")
public class UserServlet {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping(value = "/add")
    public String getAddUser(){
        return "addUser.jsp";
    }

    @PostMapping(value = "/add")
    public String addNewUser(@ModelAttribute("user") User user){

    userDAO.addUser(user);
    return "redirect:/users/all";
    }

    @GetMapping(value = "/all")
    public ModelAndView getAllUsers(ModelAndView modelAndView){

        modelAndView.addObject("list", userDAO.getAllUsers());
        modelAndView.setViewName("allUsers.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/findUserById")
    public String getUserById(){
        return "findUserById.jsp";
    }

    @PostMapping(value = "/findUserById")
    public ModelAndView findUserById(@RequestParam("id") long id, ModelAndView modelAndView){

        modelAndView.addObject("user", userDAO.getUserById(id));
        modelAndView.setViewName("userById.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/findUserByEmail")
    public String getUserByEmail(){
        return "findUserByEmail.jsp";
    }

    @PostMapping(value = "/findUserByEmail")
    public ModelAndView findUserByEmail(@RequestParam ("email") String email, ModelAndView modelAndView){

        modelAndView.addObject("user", userDAO.getUserByEmail(email));
        modelAndView.setViewName("userByEmail.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/findUsersByLogin")
    private String getUsersByLogin(){
        return "findUsersByLogin.jsp";
    }

    @PostMapping(value = "/findUsersByLogin")
    public ModelAndView findUsersByLogin(@RequestParam ("login") String login, ModelAndView modelAndView){

        modelAndView.addObject("list", userDAO.getUsersByLogin(login));
        modelAndView.setViewName("usersByLogin.jsp");
        return modelAndView;
    }


}
