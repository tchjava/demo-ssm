package com.gaby.ssm.controller;

import com.gaby.web.plugin.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gaby.ssm.model.teacher.query.Request;
import com.gaby.ssm.model.teacher.query.Response;
import com.gaby.ssm.facade.TeacherFacade;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends BaseController {

    @Autowired
    private TeacherFacade teacherFacade;

    @RequestMapping("query")
    public Response query(@RequestBody Request request){
        return teacherFacade.query(request);
    }


}