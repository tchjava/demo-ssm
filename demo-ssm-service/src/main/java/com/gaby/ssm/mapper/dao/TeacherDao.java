package com.gaby.ssm.mapper.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gaby.mybatis.auto.stu.entity.TeacherInfo;
import com.gaby.ssm.model.teacher.query.Item;

import java.util.List;
import java.util.Map;

public interface TeacherDao extends BaseMapper<TeacherInfo> {

    List<Item> query(Map map);
}
