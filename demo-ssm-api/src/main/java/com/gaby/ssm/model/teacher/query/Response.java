package com.gaby.ssm.model.teacher.query;

import com.gaby.model.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
public class Response extends BaseResponse {
    private List<Item> items;
}