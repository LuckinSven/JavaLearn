package com.sven.core.day7;

class GiantDragon{
    //私有化构造方法使得该类无法在外部通过new 再实例化
    String name;
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象
    private static GiantDragon instance = new GiantDragon();

    public static GiantDragon getInstance(){
        return instance;
    }
}

//懒汉单例模式

class GiantDragonLazy{

    String lazy_name = "321";

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragonLazy(){

    }
    //准备一个类属性，用于指向一个实例化对象，但是暂时为null
    private static GiantDragonLazy instance;

    public static GiantDragonLazy getInstance(){
        if (null == instance){
            instance = new GiantDragonLazy();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {

        GiantDragon g1 = GiantDragon.getInstance();
        g1.name = "123";
        System.out.println(g1.name);
        GiantDragon g2 = GiantDragon.getInstance();
        System.out.println(g2.name);

        GiantDragonLazy glayz1 = GiantDragonLazy.getInstance();
        System.out.println(glayz1.lazy_name);

    }
}
