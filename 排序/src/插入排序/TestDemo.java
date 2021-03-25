package 插入排序;

/**
 *时间复杂度：O(n^2)
 * 空间复杂度:O(1)
 * 稳定性:稳定
 *
 *
 * */
import java.util.Arrays;

public class TestDemo {
    public static void insertSort(int[] array){
        for (int bound = 1; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound-1;
            for (; cur >= 0; cur--) {
                if(array[cur] > tmp){
                    array[cur+1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur+1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
