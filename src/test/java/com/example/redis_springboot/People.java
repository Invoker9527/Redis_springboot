package com.example.redis_springboot;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author YangRuiHong
 * @create 2022-07-23 20:02
 * @email Yangrhd@dcits.com
 * @description:
 */
public enum People {
    man("男", "穿衣服"),

    woman("女", "穿裙子");

    private final String sex;
    private final String hobby;

    private People(String sex, String hobby) {
        this.sex = sex;
        this.hobby = hobby;
    }

    public static void main(String[] args) {
        System.out.println(man.hobby);
    }

}
