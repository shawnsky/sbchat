package com.xt.web;

import com.xt.entity.User;
import com.xt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by admin on 2017/7/31.
 */

@Controller
public class HomeController {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String index(){
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home(Model model, HttpSession session){
        Long id = Long.parseLong((String) session.getAttribute("userId"));
        // 当前用户
        User user = userService.findById(id);
        model.addAttribute("user", user);
        // 当前用户所有好友
        List<User> friends = userService.findAllFriends(id);
        model.addAttribute("friends", friends);
        return "home";
    }



}
