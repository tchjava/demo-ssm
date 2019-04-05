package com.gaby.ssm.model.teacher.query;

import com.gaby.annotation.Field;
import lombok.Data;

import java.io.Serializable;
@Data
public class Item implements Serializable {
    @Field(comment = "姓名")
    private String name;
    @Field(comment = "年龄")
    private Integer age;
}
