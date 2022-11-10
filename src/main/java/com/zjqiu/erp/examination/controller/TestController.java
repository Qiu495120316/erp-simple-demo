package com.zjqiu.erp.examination.controller;

import com.zjqiu.erp.examination.model.request.test.TestRequest;
import com.zjqiu.erp.examination.model.respond.RespondEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {


    @PostMapping("/login")
    public RespondEntity testLogin(@RequestBody TestRequest testRequest  ){
        return RespondEntity.OK( null );
    }

}
