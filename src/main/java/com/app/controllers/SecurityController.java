package com.app.controllers;

import com.app.services.interfaces.UserDAO;
import com.app.entities.Role;
import com.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class SecurityController {

    UserDAO userDAO;

    @GetMapping(value = "/registration")
    public String getRegistrationForm(){
        return "registration.jsp";
    }

    @PostMapping(value = "/registration")
    public String passData(@ModelAttribute("user") User user){
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(Role.ROLE_USER);
        if(user.getRole().equals("ADMIN")){
            roleList.add(Role.ROLE_ADMIN);
        }
        roleList.trimToSize();
        user.setRoles(roleList);

        userDAO.addUser(user);

        return "redirect:/login.jsp";
    }

    @GetMapping(value = "/login")
    public String getLoginForm(){
        return "login.jsp";
    }

    @GetMapping(value = "/info/pageForAdmins")
    public String getPageForAdmins(){
        return "pageForAdmins.jsp";
    }
    @GetMapping(value = "/info/pageForUsers")
    public String getPageForUsers(){
        return "pageForUsers.jsp";
    }



    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
