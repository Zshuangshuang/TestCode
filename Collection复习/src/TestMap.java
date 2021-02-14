import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //(1)创建map实例
        Map<String,String> map = new HashMap<>();
        //(2)使用size(),获取键值对个数
        int ret1 = map.size();
        System.out.println("map中的键值对个数: "+ret1);
        //(3)使用isEmpty(),判断map是否为null;
        boolean ret2 = map.isEmpty();
        System.out.println("map是否为空: "+ret2);
        //(4)将键值对存放到map
        map.put("小卤蛋","鲁班七号");
        map.put("奶妈","蔡文姬");
        map.put("单身哈士奇","成吉思汗");
        map.put("大小姐","孙尚香");
        map.put("酸菜鱼","庄周");
        //(5)使用get(),根据key查找对应的value,如果key不存在,返回null
        System.out.println(map.get("小卤蛋"));
        //(6)使用getOrDefault(),查找map中不存在的元素,会返回默认值
        System.out.println(map.getOrDefault("毒奶", "扁鹊"));
        //(7)通过containsKey和containsValue来判断某个值是否存在
        System.out.println(map.containsKey("瑶妹"));
        System.out.println(map.containsValue("娜可露露"));
        ret1 = map.size();
        System.out.println("map中的键值对个数: "+ret1);
        ret2 = map.isEmpty();
        System.out.println("map是否为空: "+ret2);
        //(8)使用foreach遍历map
        //entry表示一个键值对
        //map.entrySet()得到的是所有的键值对
        //map中的元素顺序和插入顺序无关,取决于map的实现方法
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        //(9)删除元素
        map.remove("酸菜鱼");
        System.out.println("删除后======");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        //(10)如果插入的键值对的key值已经存在,那么就会覆盖原有的key
        map.put("大小姐","大乔");
        System.out.println("修改后=======");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
