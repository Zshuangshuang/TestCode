package com.zss.homework;

import java.util.Map;

/*
* 求出0～999之间的所有"水仙花数"并输出。("水仙花数"是指一个三位数，其各位数字的立方和确好等于该数本身，如;153=1+5+3?，则153是一个“水仙花数"。)
 * */
public class Demo9 {
    public static void show(){
        for (int num = 1; num <= 9999999; num++) {
            int count = 0;
            int sum = 0;
            int tmp = num;
            while (tmp != 0){
                count++;
                tmp = tmp/10;
            }
            tmp = num;
            while (tmp != 0){
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if (sum == num){
                System.out.println(sum+": is my num");
            }
        }
    }
    public static void main(String[] args) {
        show();
    }
}
