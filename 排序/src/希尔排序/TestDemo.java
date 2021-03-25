package 希尔排序;

/**
 * 时间复杂度理论值:O(n^1.3)
 * 空间复杂度:O(1)
 * 稳定性:不稳定
 *
 * */
import java.util.Arrays;

public class TestDemo {
    private static void gapInsert(int[] array,int gap){
        for (int bound = gap; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound-gap;
            for (; cur >= 0; cur -= gap) {
                if (array[cur] > tmp){
                    array[cur+gap] = array[cur];
                }else {
                    break;
                }
            }
            array[cur+gap] = tmp;
        }
    }
    public static void shellSort(int[] array){
        int gap = array.length/2;
        while (gap > 1){
            gapInsert(array,gap);
            gap = gap/2;
        }
        gapInsert(array,1);
    }
    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
