package com.atguigu.redis_springboot.config.config;

import com.atguigu.redis_springboot.bean.People;
import com.atguigu.redis_springboot.bean.Student;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * @author YangRuiHong
 * @create 2022-07-23 20:24
 * @email Yangrhd@dcits.com
 * @description: proxyBeanMethods：代理bean的方法
 * full(proxyBeanMethods = true)、调用时都会到容器中找组件
 * lite("proxyBeanMethods = false)在容器中不会保存代理对象，每次调用都会新创建一个
 * 组件依赖
 * @Import({People.class, Student.class})在容器中自动创建这两个类型的组件 默认bean名字为全类名com.atguigu.redis_springboot.bean.People
 * com.atguigu.redis_springboot.bean.Student
 */
@Import({People.class, Student.class})
@Configuration(proxyBeanMethods = true)//此配置类本身也是一个组件，此参数
//@ImportResource("classpath:bean.xml")//导入spring配置文件
//@EnableConfigurationProperties(People.class)//一定要写配置类里，开启属性配置功能（能够读取配置文件（application.yml）里的内容），写了这个，要配置的类可以不写@Component
public class TestConfig {
    @ConditionalOnBean(name = "getJedis")
    @Bean("Tom")//默认单实例
    public People people() {
        return new People();
    }
}
