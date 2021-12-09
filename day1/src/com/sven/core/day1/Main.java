package com.sven.core.day1;

import org.w3c.dom.ls.LSOutput;

import java.net.http.HttpRequest;

//public class Hero{
    class  Hero{
    //类的首字母大写
    //这些状态，叫做 属性
    String name; //姓名
    float hp; //血量
    float armor;  //护甲
    int moveSpeed; //移动速度
    String dieWord ;

    void keng(){
        //能够作什么，叫做方法
        System.out.println("坑队友");
    }

    float getArmor(){
        return armor;
    }

    void addSpeed(int speed){
        moveSpeed = moveSpeed +speed;
    }
}

//public class Item{
    class Item{
    String name;
    int price;
}



public class Main {
    public static void main(String[] args) {
        System.out.println("hello Qber my");


        class h1{

            public void method(final int i){
               // i = 5;

                System.out.println(i);
            }
        }

        h1 h2 = new h1();
        h2.method(333);
        h2.method(444);


        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.dieWord= "i am died";

        System.out.println(garen.name);
        System.out.println(garen.dieWord);
        garen.keng();
        float ga = garen.getArmor();
        System.out.println(ga);

        System.out.println(garen.moveSpeed);
        garen.addSpeed(100);

        System.out.println(garen.moveSpeed);



        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        Item d1 = new Item();
        d1.name = "血瓶";
        d1.price =50;

        Item d2 = new Item();
        d2.name = "草鞋";
        d2.price = 300;

        Item d3 = new Item();
        d3.name = "长剑";
        d3.price = 350;

        System.out.println("day2学习");
        int year = 1949;
        System.out.println(year);

        byte a = 100;
        short b = 1000;
        int c = 1000;
        long d = 1000;
        System.out.format("%d %d %d %d ",a,b,c,d);

        char ca = 'z';
        char cb = '中';

        float fa = 123;
        double da = 11.11;

        boolean btag = true;
        boolean atag = false;

        String str1 = "hello world\n";
        System.out.format("%s", str1);

        char cc = 'A';
        short s = 66;

        cc = (char)s;
        System.out.println(cc);

        int ii =5;
        int jj =6;
        int k = 1;
        k = ii<jj ? 99:88;
        System.out.println(k);


    }
}



