import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        //判断参数的合法性
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int middle = left+(right-left)/2;
            if (array[middle] < array[right]){
                left=middle+1;
            }else if (array[middle] > array[right]){
                right = middle;
            }else {
                right--;
            }
        }
        return array[left];
    }
}