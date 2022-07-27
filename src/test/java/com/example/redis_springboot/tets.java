package com.example.redis_springboot;

import org.junit.jupiter.api.Test;

/**
 * @author YangRuiHong
 * @create 2022-07-11 22:16
 * @description:
 */
public class tets {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void test() {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i+ ++i * i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

}
