package com.gaby.stu.model.student.list;

import com.gaby.annotation.Field;
import lombok.Data;

import java.io.Serializable;
@Data
public class Item implements Serializable {
    @Field(comment = "学生标识")
    private String id;
    @Field(comment = "姓名")
    private String name;
    @Field(comment = "性别")
    private String sex;
}
