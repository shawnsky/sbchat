package com.xt.web;

import com.xt.entity.Body;
import com.xt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2017/7/31.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * Login submit.
     * 0 成功
     * 1 用户不存在
     * 2 密码错误
     * 3
     */

    @ResponseBody
    @RequestMapping(value = "loginSubmit", method = RequestMethod.POST)
    public Body loginSubmit(String id, String password, HttpSession session){
        Body body = new Body();
        String status = userService.login(Long.parseLong(id), password);
        body.setStatus(status);

        if (status.equals("0")){
            session.setAttribute("userId", id);
            body.setMsg("登陆成功");

        } else if (status.equals("1")){
            body.setMsg("用户不存在");
        } else {
            body.setMsg("密码错误");
        }
        return body;
    }


    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute("userId");
        return "redirect:/";
    }
}
