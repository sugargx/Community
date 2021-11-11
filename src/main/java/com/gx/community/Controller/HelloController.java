package com.gx.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gx
 * @description：
 * @date 2021-11-09 23:34
 */

//加上controller注解后，会自动被当作spring的一个bean去管理
//同时可以当作一个controller：允许这个类去接收前端的一个请求
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model) {
        //可以按住ctrl+p来看提示可以填入的值
        model.addAttribute("name", name);

        //自动去templates文件夹下找 hello.html文件
        return "hello";
    }
}
