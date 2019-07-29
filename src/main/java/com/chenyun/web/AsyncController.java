package com.chenyun.web;

import com.chenyun.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/async")
    public void generateReport(){
        System.out.println("请求线程的名称："+ Thread.currentThread().getName());
        asyncService.generateReport();
    }




}
