package com.sven.core.day3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //声明一个数组
        int[] a;
        a = new int[5];

        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
       // a[5] = 5;


        int [] b = new int[5];
        System.out.println(a.length);

        System.out.println(Arrays.toString(b));


        for (int i = 0; i <a.length; i++){
            System.out.print(" ");
            System.out.print(a[i]);
        }

        int [] c ={100,200,300};
        System.out.println(Arrays.toString(c));
       // for (int j = 0; i< c.length; j++)

        //增强型for循环遍历
        for (int each : c){
            System.out.println(each);
        }


        int [] a_1 = new int[]{18, 19, 20, 23, 78};
        int [] b_1 = new int[5];

        for (int i = 0 ; i< b_1.length; i++){
            b_1[i] = a_1 [i];
        }

        for (int i = 0 ; i< b_1.length; i++){
            System.out.print(b_1[i]+ " ");
        }

        System.out.println("\n-----------");
        int [] c_1 = Arrays.copyOfRange(a_1, 0,  5);

        for (int i = 0 ; i< c_1.length; i++){
            System.out.print(c_1[i]+ " ");
        }




    }


}
