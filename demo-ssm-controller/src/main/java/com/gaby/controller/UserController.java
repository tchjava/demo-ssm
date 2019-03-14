package com.gaby.controller;

import com.gaby.model.user.Response;
import com.gaby.web.plugin.controller.BaseController;
import org.springframework.stereotype.Controller;
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
}
