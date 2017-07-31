package com.xt.controller;

import com.xt.entity.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/7/31.
 */

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/help")
    public Message help(){
        Message message = new Message();
        message.setContent("123");
        return message;
    }
}
