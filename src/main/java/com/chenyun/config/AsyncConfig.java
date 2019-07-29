package com.chenyun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 在代码中，注解@EnableAsyanc代表开启spring异步，这样可以使用@async驱动spring使用异步
 * 但异步需要提供可用线程池，所以这里配置类会实现AsyncConfigurer接口,然后覆盖
 * getAsyncExecutor方法，这样就可以自定义一个线程池。因此当方法标注@Async时，
 * spring就会通过这个线程池的空闲线程去运行该方法。
 * */
@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    //定义线程池
    @Override
    public Executor getAsyncExecutor(){

        // 定义线程池
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();

        // 核心线程数
        taskExecutor.setCorePoolSize(100);

        // 线程池最大线程数
        taskExecutor.setMaxPoolSize(300);

        //线程队列最大线程数
        taskExecutor.setQueueCapacity(2000);

        // 初始化
        taskExecutor.initialize();

        return taskExecutor;










    }
}
