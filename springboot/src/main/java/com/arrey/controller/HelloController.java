package com.arrey.controller;

import com.arrey.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GetMapping 相当与@RequestMapping(method = RequestMethod.GET)的缩写
 * 类似的还有@PostMapping、@PutMapping、@DeleteMapping。
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    HelloWorld helloWorld;

    @RequestMapping("haha")
    public String hello() {
        return helloWorld.hello();
    }
}
