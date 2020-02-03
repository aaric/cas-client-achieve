package com.github.aaric.sb2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试控制器
 *
 * @author Aaric, created on 2020-02-03T15:47.
 * @version 0.1.0-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping(value = "/get/{id}")
    public Map<String, Object> get(@PathVariable("id") Integer id) {
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("code", "0000");
        responseData.put("message", "请求成功");

        return responseData;
    }
}
