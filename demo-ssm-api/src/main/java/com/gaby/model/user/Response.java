package com.gaby.model.user;

import com.gaby.model.BaseResponse;
import lombok.Data;

@Data
public class Response extends BaseResponse {
    private String username;
    private String age;
}
