import java.util.HashMap;

import java.util.Map;



public class Main1 {
    public static boolean isEqual(String str){
        if (str == null){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{'){
                if (map1.containsKey(ch)){
                    map1.put(ch,map1.get(ch)+1);
                }else {
                    map1.put(ch,1);
                }
            }
            if (ch == '}' || ch == ']' || ch == ')'){
                if (map2.containsKey(ch)){
                    map2.put(ch,map2.get(ch)+1);
                }else {
                    map2.put(ch,1);
                }
            }
        }
        if (map1.get('[') == map2.get(']') && map1.get('{') == map2.get('}')
                && map1.get('(') == map2.get(')')){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "{[(})] ";
        System.out.println(isEqual(str));
    }
}
