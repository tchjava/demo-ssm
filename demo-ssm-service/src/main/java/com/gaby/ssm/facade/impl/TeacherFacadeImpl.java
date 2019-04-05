package com.gaby.ssm.facade.impl;

import com.gaby.ssm.facade.TeacherFacade;
import com.gaby.ssm.model.teacher.query.Item;
import com.gaby.ssm.model.teacher.query.Request;
import com.gaby.ssm.model.teacher.query.Response;
import com.gaby.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherFacadeImpl implements TeacherFacade {

    @Autowired
    private TeacherService teacherService;
    @Override
    public Response query(Request request) {
        Response response = new Response();
        Map map = new HashMap<>();
        map.put("request", request);
        List<Item> items =teacherService.query(map);
        response.setItems(items);
        return response;
    }

}
