package com.atguigu.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

/**
 * @author YangRuiHong
 * @create 2022-07-27 10:29
 * @email Yangrhd@dcits.com
 * @description:
 */
@RestController
@RequestMapping("/redisTest")
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;

    public void testLock() {
        //1获取锁
        Boolean lock = redisTemplate.opsForValue().setIfAbsent("lock", "111");
        //2获取锁成功，查询num的值
        if (lock) {
            Object value = redisTemplate.opsForValue().get("num");
//            2.1判断num为空return
            if (StringUtils.isEmpty(value)) {
                return;
            }
            //2.2有值转换为int
            int num = Integer.parseInt(value + "");
            //2.3把Redis的num+1
            redisTemplate.opsForValue().set("num", ++num);
            // 2.4 释放锁，del
            redisTemplate.delete("lock");

        } else {
            //3获取锁失败，每隔0。1秒再获取
            try {
                Thread.sleep(100);
                testLock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
