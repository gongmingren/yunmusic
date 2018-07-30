package com.qingguatang.yunmusic.course1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ming
 * @date 2018/7/30
 */

@Controller
public class HelloWorld {
    //方法名可以自定义，课程为hello
    @RequestMapping (value ="/hello" )
    //value的值就是localhost:8080后面的值
    @ResponseBody
    public String sayhello(){
        String message = "hello world";
        return message;
    }
}
