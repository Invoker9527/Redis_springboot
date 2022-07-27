package com.atguigu.redis_springboot.bean;

/**
 * @author YangRuiHong
 * @create 2022-07-23 20:10
 * @email Yangrhd@dcits.com
 * @description:
 */
public enum Car implements Info {
    Baoma("宝马", 9600.00),
    aodi("奥迪", 9800.00);
    private final String name;
    private final Double price;

    private Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println(Baoma.price);
    }

    @Override
    public void show() {
        System.out.println("这是一辆车");
    }


}

interface Info {
    void show();
}
