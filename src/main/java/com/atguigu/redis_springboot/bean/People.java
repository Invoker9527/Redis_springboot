package com.atguigu.redis_springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author YangRuiHong
 * @create 2022-07-23 20:22
 * @email Yangrhd@dcits.com
 * @description:只有在容器中的组件，才会拥有springboot提供的强大功能
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "people")
public class People {
    private String name;
    private String sex;
}
