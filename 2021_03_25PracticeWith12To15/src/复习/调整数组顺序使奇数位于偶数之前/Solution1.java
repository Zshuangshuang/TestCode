package 复习.调整数组顺序使奇数位于偶数之前;

public class Solution1 {
  
    public int[] reOrderArray (int[] array) {
       int[] result = new int[array.length];
       if (array.length == 0 || array == null){
           return result;
       }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i] % 2 != 0){
               result[j] = array[i];
               j++;
           }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }
}