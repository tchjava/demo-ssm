package com.gaby.stu.model.student.list;

import com.gaby.annotation.Field;
import com.gaby.model.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
public class Response extends BaseResponse {
    @Field(comment = "集合")
    List<Item> items;
}
