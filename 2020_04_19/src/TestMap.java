import java.util.HashMap;
import java.util.Map;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-04-19 11:59
 */
public class TestMap {
    public static void main(String[] args) {
        //1.创建map实例
        Map<String,String> map = new HashMap<>();
        //2.size()获取键值对个数
        System.out.println(map.size());
        //3.isEmpty()
        System.out.println(map.isEmpty());
        //4.put()存放键值对
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        //5.get()根据key查找value
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("大刀"));
        System.out.println(map.getOrDefault("行者", "武松"));
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
