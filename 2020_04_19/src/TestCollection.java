import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-04-19 11:49
 */
public class TestCollection {
    public static void main(String[] args) {
        //1.创建Collection对象
        Collection<String> collection = new ArrayList<>();
        //2.使用size方法
        System.out.println(collection.size());
        //3.使用isEmpty()
        System.out.println(collection.isEmpty());
        //4.使用add方法
        collection.add("我");
        collection.add("爱");
        collection.add("Java");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        //6.使用toArray将Collection转为数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        //7.使用for循环遍历集合中的元素
        for (String s : collection){
            System.out.println(s);
        }
        //8.使用contains
        System.out.println(collection.contains("我"));
        //9.通过remove删除
        collection.remove("我");
        System.out.println("========分割线=====");
        for (String s : collection){
            System.out.println(s);
        }
        //全部删除
        collection.clear();
        System.out.println("清空后");
        System.out.println("========分割线=====");
        for (String s : collection){
            System.out.println(s);
        }
        System.out.println(collection.size());
    }
}
