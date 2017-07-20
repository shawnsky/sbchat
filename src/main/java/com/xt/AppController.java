package com.xt;/**
 * Created by Administrator on 2017/7/20.
 */

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 07-20 15:34
 *
 * @author xt
 **/
@Controller
public class AppController {
    @MessageMapping("/hello")
    @SendTo("/topic/messages")
    public Message greeting(Message message) throws Exception{
        System.out.println(message.getContent());
        return message;
    }

    @ResponseBody
    @RequestMapping("/help")
    public String help(){
        return "asdasdasd";
    }
}

