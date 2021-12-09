package com.sven.core.day2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        System.out.println("day2 Now");
//        Scanner s1 = new Scanner(System.in);
//        int a = s1.nextInt();
//        System.out.println("第一个整数： "+a);
//        int b = s1.nextInt();
//        System.out.println("第二个整数： "+b);
//
//        float fa = s1.nextFloat();
//        System.out.println("读取的是浮点数: "+fa);
//
//        String str_a = s1.nextLine();
//        String str_b = s1.nextLine();
//        //取走回车换行
//        System.out.println("读取的字符串 "+str_a);
//        System.out.println("读取的字符串 "+str_b);
        boolean flag = true;
        if (flag){
            System.out.println("Flag is True");
        }

        boolean flag_k = false;

        if(flag_k){
            System.out.println("yes!!!");
        }
        else{
            System.out.println("Flag_k is FASLE");
        }

        int day =5;
        switch(day) {
            case 1:
                System.out.println("星期一");break;
            case 2:
                System.out.println("星期二");break;
            case 5:
                System.out.println("星期五");break;

            default:
                System.out.println("啥啥啥");

        }

        int i_while = 0;
        do{
            System.out.println(i_while);
            i_while ++;

        }while(i_while<5);


        int iii =  0;
        while(iii<5){
            System.out.println("while输出 "+iii);
            iii++;
        }

        //使用for打印0到4
        for (int j = 0; j<5; j++){
            System.out.println("for 循环输出的 "+j);
        }

        for (int j_11=0; j_11 < 10; j_11++){
            if(0==j_11%2){
                //如果是双数，后面代码不执行
                //continue;
                System.out.println("jjj "+j_11);
                break;
            }
            System.out.println("jjj "+j_11);
        }

        System.exit(1);





    }
}
