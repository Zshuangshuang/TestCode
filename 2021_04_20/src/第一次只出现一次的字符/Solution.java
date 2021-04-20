package 第一次只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
       //判断参数的合法性
        if (str == null || str.equals("")){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else {
                map.put(ch[i],1);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}