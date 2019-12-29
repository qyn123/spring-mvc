package com.qiaoyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qiaoyn
 * 注解版springmvc
 *
 * 实现步骤其实非常的简单：
 *
 * 新建一个web项目
 * 导入相关jar包
 * 编写web.xml , 注册DispatcherServlet
 * 编写springmvc配置文件
 * 接下来就是去创建对应的控制类 , controller
 * 最后完善前端视图和controller之间的对应
 * 测试运行调试.
 **/
@Controller
//@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String test(Model mode1){
        mode1.addAttribute("msg","hello,SpringMvc");
        //web-inf/jsp/test.jsp
        return "test";
    }
}
