package 冒泡排序;

/*
* 时间复杂度O(n^2)
* 空间复杂度O(1)
* 稳定性:稳定
* */
import java.util.Arrays;

public class TestDemo {
    public static void bubble(int[] array){
        boolean flag = false;
        for (int i = 0; i < array.length-1; i++) {
            flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
