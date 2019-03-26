package com.gaby.stu.model.student.query;

import com.gaby.annotation.Field;
import com.gaby.model.BaseRequest;
import com.gaby.model.Page;
import lombok.Data;

@Data
public class Request extends BaseRequest {
    @Field(comment = "姓名")
    private String name;
    private Page page;
}
