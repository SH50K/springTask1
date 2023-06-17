package com.xxxx.task;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author C
 * @Description
 * @Date create in 2023/6/17 8:34
 */
@Component
public class TaskJob {
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void job(){
        System.out.println("任务一"+sdf.format(new Date()));
    }

    public void job1(){
        System.out.println("任务二"+sdf.format(new Date())+"-------------------");
    }
}
