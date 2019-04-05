package com.gaby.ssm.facade;

import com.gaby.ssm.model.teacher.query.Request;
import com.gaby.ssm.model.teacher.query.Response;

public interface TeacherFacade {
    Response query(Request request);
}
