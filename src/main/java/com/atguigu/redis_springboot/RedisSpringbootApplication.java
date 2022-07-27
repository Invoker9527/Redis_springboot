package com.atguigu.redis_springboot;

import com.atguigu.redis_springboot.bean.People;
import com.atguigu.redis_springboot.config.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class RedisSpringbootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(RedisSpringbootApplication.class, args);
//        for (String name : run.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
//        People tom = run.getBean("Tom", People.class);
//        People tom1 = run.getBean("Tom", People.class);
//        System.out.println(tom == tom1);
////        bean = com.atguigu.redis_springboot.config.config.TestConfig$$EnhancerBySpringCGLIB$$c3fbe717@3b718392
//        TestConfig bean = run.getBean(TestConfig.class);//拿到的是代理对象
//        System.out.println("bean = " + bean);
//        People people = bean.people();
//        People people1 = bean.people();
//        System.out.println(people == people1);
        for (String beanDefinitionName : run.getBeanDefinitionNames()) {

            System.out.println(beanDefinitionName);
        }
        Jedis getJedis = run.getBean("getJedis", Jedis.class);
        System.out.println("getJedis = " + getJedis);
        System.out.println(run.containsBean("Tom"));
//        People hehe = run.getBean("hehe", People.class);
//        System.out.println("hehe = " + hehe);


    }

}
