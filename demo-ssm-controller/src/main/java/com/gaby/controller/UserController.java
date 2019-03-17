package com.gaby.controller;

import com.gaby.exception.BssException;
import com.gaby.model.DefaultResponse;
import com.gaby.model.user.Request;
import com.gaby.model.user.Response;
import com.gaby.web.plugin.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @RequestMapping("hello")
    @ResponseBody
    public Response hello(){
        Response response=new Response();
        response.setUsername("zhangsan");
        response.setAge("1");
        return response;
    }

    @RequestMapping("default")
    @ResponseBody
    public DefaultResponse defaultMethod(){
        return null;
    }
    @RequestMapping("exception")
    @ResponseBody
    public Response exception(){
        throw new BssException("异常例子");
    }

    @RequestMapping("form")
    @ResponseBody
    public Response form(@RequestBody Request request){
        Response response=new Response();
        response.setUsername(request.getUsername());
        response.setAge(request.getAge());
        return response;
    }
    @RequestMapping("form1")
    @ResponseBody
    public Response form1(Request request){
        Response response=new Response();
        response.setUsername(request.getUsername());
        response.setAge(request.getAge());
        return response;
    }
}
