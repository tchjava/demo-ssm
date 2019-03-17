package com.gaby.model.user;

import com.gaby.annotation.Field;
import com.gaby.model.BaseRequest;
import lombok.Data;

@Data
public class Request extends BaseRequest {
    @Field(comment = "用户名",nullable = false)
    private String username;
    private String age;
}
