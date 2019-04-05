package com.gaby.ssm.service;

import com.gaby.mybatis.auto.stu.entity.TeacherInfo;
import com.gaby.mybatis.base.service.BaseService;
import com.gaby.ssm.model.teacher.query.Item;

import java.util.List;
import java.util.Map;

public interface TeacherService extends BaseService<TeacherInfo> {

    List<Item> query(Map map);
}
