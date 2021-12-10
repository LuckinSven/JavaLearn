package com.sven.core.day5;


class Hero{
    public String name; //实例属性
    protected float hp;
    static String copyright; //类属性，静态属性

}


public class Main {

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";

        Hero.copyright = "版权由Qber持有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);

        System.out.println(Hero.copyright);

        garen.copyright = "123";
        System.out.println(garen.copyright);
        System.out.println(Hero.copyright);






    }


}
