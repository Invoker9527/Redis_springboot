package com.atguigu.redis_springboot.controller;

import com.atguigu.redis_springboot.bean.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YangRuiHong
 * @create 2022-07-15 17:27
 * @description:
 */

@RestController
public class MyController {
    @Autowired
    private People people;

    public boolean secKill() {
        int a = 4 / 2;
        return true;
    }

    @RequestMapping("/people")
    public People getPeople() {
        return people;
    }


}
