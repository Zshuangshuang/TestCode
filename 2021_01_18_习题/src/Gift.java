import java.util.*;

public class Gift {
    public static int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++){
            if (map.containsKey(gifts[i])){
                map.put(gifts[i],map.get(gifts[i])+1);
            }else {
                map.put(gifts[i],1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(gifts[i]) > (n/2)){
                return gifts[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2};
        int ret = getValue(array,5);
        System.out.println(ret);
    }
}