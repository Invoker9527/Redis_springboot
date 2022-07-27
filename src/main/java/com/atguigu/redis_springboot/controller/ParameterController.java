package com.atguigu.redis_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YangRuiHong
 * @create 2022-07-25 9:24
 * @email Yangrhd@dcits.com
 * @description:
 */
@Controller
public class ParameterController {
    @GetMapping("/test")
    public String parmTest() {
        return "parmTest";
    }

    @ResponseBody
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id, @PathVariable("username") String username, @PathVariable Map<String, String> pv, @RequestHeader("User-Agent") String userAgent, @RequestHeader Map<String, String> heads, @CookieValue("_ga") Cookie cookie,@CookieValue("_ga")String _ga) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);

        map.put("username", username);
        map.put("pv", pv);
        map.put("userAgent", userAgent);
        map.put("headers", heads);
        map.put("cookie", cookie);
        System.out.println("cookie = " + cookie);
        return map;
    }
}
