package 数字在升序数组中出现的次数;


import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length == 0 || array == null){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        return map.getOrDefault(k,0);
    }
}
