package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello") // 경로는 중복 가능
    @ResponseBody
    public String hello() { // 메서드 중복 불가능
        return "Hello World!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET METHOD 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청";
    }

    @DeleteMapping("/delate")
    @ResponseBody
    public String delate() {
        return "Delate Method 요청";
    }
}
