package com.chenyun.service.impl;

import com.chenyun.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async  // 声明使用异步调用
    public void generateReport(){

        //打印异步线程的名称
        System.out.println("报表县城名称："+Thread.currentThread().getName());
    }
}
