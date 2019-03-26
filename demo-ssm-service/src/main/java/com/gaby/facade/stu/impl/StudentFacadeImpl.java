package com.gaby.facade.stu.impl;

import com.gaby.facade.stu.StudentFacade;
import com.gaby.service.stu.CustomStudentService;
import com.gaby.stu.model.RedisKey;
import com.gaby.stu.model.student.list.Item;
import com.gaby.stu.model.student.query.Request;
import com.gaby.stu.model.student.query.Response;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentFacadeImpl implements StudentFacade {

    @Autowired
    private CustomStudentService customStudentService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Response query(Request request) {
        Map map = new HashMap();
        map.put("item", request);
        return customStudentService.query(map);
    }

    @Override
    public com.gaby.stu.model.student.list.Response list() {
        com.gaby.stu.model.student.list.Response response=new com.gaby.stu.model.student.list.Response();
        List<Item> list = (List<Item>) redisTemplate.boundHashOps(RedisKey.STUDENT_LIST).get("list");
        if(null==list){
            System.out.println("走了数据库");
            list=customStudentService.list();
            if(CollectionUtils.isNotEmpty(list)){
                redisTemplate.boundHashOps(RedisKey.STUDENT_LIST).put("list",list);
            }
        }
        response.setItems(list);
        return response;
    }

}
