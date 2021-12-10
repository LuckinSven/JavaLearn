package com.sven.core.day4;

public class Main {
    public static void main(String[] args) {

        class Hero {
            String name;
            float hp;
            int moveSpeedd;


            void recovery(float xp){
                hp = hp +xp;
                xp = 0;
            }
            Hero(String name, float hp){
                this.name = name;
                this.hp = hp;
            }
            //某个英雄被攻击，损失HpDrop
            void attcked(Hero hero,int HpDrop){
                hero.hp = hero.hp - HpDrop;
            }

            void recive(Hero h){
                h = new Hero("提莫",383);
            }
        }


        Hero teemo = new Hero("提莫",383);
        int xp1= 100;

        System.out.println(teemo.name);
        System.out.println(teemo.hp);

        teemo.recovery(1000);
        System.out.println(teemo.hp);
        teemo.recovery(xp1);
        System.out.println(xp1);
        System.out.println(teemo.hp);

        Hero garen = new Hero("盖伦", 500);

        garen.attcked(teemo,500);

        System.out.println(teemo.hp);


        teemo.hp = teemo.hp - 4000;
        System.out.println(teemo.hp);

        teemo.recive(teemo);
        System.out.println(teemo.hp);













    }
}
