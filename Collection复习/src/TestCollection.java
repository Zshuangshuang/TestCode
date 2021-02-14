import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        //向上转型,此处的泛型参数类型必须是引用类型
        //(1)创建Collection对象
        Collection<String> collection = new ArrayList<>();
        //(2)使用size()
        int ret1 = collection.size();
        System.out.println("集合中的元素个数: "+ret1);
        //(3)使用isEmpty()
        boolean ret2 = collection.isEmpty();
        System.out.println("集合是否为空: "+ret2);
        //(4)使用add(),ArrayList和LinkedList默认尾插
        collection.add("Hello");
        collection.add("Collection");
        collection.add("!");
        ret1 = collection.size();
        System.out.println("集合中的元素个数: "+ret1);
        ret2 = collection.isEmpty();
        System.out.println("集合是否为空: "+ret2);
        //(5)将Collection转化为数组
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        //(6)直接使用for循环遍历
        for (String s : collection){
            System.out.print(s+" ");
        }
        System.out.println();
        //(7)使用Contains()
        //此处比较使用的是equals(比较的是元素的内容)
        boolean ret3 = collection.contains("Hello");
        System.out.println("是否存在Hello: "+ret3);
        //(8)使用remove()
        boolean ret4 = collection.remove("!");
        System.out.println("删除元素: "+ret4);
        //(9)清空所有元素
        collection.clear();
        System.out.println("清空collection后: "+collection.isEmpty());
        System.out.println("清空collection后: "+collection.size());
    }
}
