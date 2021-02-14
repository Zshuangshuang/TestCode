

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        //(1)创建List实例
        List<String> list = new ArrayList<>();
        //(2)新增元素
        list.add("Java");
        list.add("Python");
        list.add("C##");
        list.add("Redis");
        //(3)打印
        System.out.println(list);
        //(4)按照下标访问元素
        System.out.println(list.get(0));
        //(5)根据下标修改元素
        list.set(2,"PHP");
        System.out.println(list);
        //(6)使用foreach循环来访问每个元素
        for (String s : list){
            System.out.print(s+"  ");
        }
        System.out.println("=================");
        //(7)使用for循环来打印list中的内容
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
        System.out.println("获取子序列:");
        //(8)获取子序列:前闭后开区间
        List<String> strings = list.subList(0,2);
        System.out.println(strings);
        //(9)根据构造方法创建新的List对象
        List<String> list2 = new ArrayList<>(list);
        System.out.println("复制后的list2: ");
        System.out.println(list2);
    }
}
