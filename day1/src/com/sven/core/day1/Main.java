package com.sven.core.day1;

import java.net.http.HttpRequest;

public class Hero{
    //类的首字母大写
    String name; //姓名
    float hp; //血量
    float armor;  //护甲
    int moveSpeed; //移动速度
}

public class Item{
    String name;
    int price;
}

public class Main {
    public static void main(String[] args) {
        System.out.println("hello Qber my");

        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;


        Item d1 = new



    }
}



