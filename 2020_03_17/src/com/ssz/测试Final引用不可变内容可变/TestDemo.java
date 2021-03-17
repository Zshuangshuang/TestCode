package com.ssz.测试Final引用不可变内容可变;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-17 9:03
 */
public class TestDemo {
    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder("哈哈");
        System.out.println("stringBuilder中的内容是: "+stringBuilder);
        System.out.println("stringBuilder的hashCode: "+stringBuilder.hashCode());
        stringBuilder.append("双双");
        System.out.println("我改变了");
        System.out.println("stringBuilder中的内容是: "+stringBuilder);
        System.out.println("stringBuilder的hashCode: "+stringBuilder.hashCode());

    }
}
