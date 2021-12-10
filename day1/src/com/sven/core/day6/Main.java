package com.sven.core.day6;

import java.net.http.HttpRequest;

class Hero{
    public String name;
    protected float hp;


    //实例方法，对想方法
    public void die() {
        hp = 0;
        System.out.println("hp=0");
    }

    //静态方法，通过类就能调用
    public static void battleWin(String name){
        System.out.println(name + "battleWin++");
    }
}


class Ahero{
    //声明该属性的时候初始化
    public String name = "Some Ahero";
    protected float hp;
    float maxHP;
    {
        //初始化块
        maxHP = 200;
    }

    public Ahero(){
        //构造方法中初始化
        hp = 100;
    }
}


public class Main {
    public static void main(String[] args) {

        Hero garen = new Hero();
        garen.name = "盖伦";

        garen.die();

        Hero teemo = new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);

        Hero.battleWin(teemo.name);

        Ahero h2 = new Ahero();
        System.out.println(h2.name);





    }
}
