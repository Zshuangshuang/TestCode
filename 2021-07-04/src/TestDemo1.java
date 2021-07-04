import java.util.Arrays;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-07-04 9:13
 */
public class TestDemo1 {
    public static void bubbleSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                    flg = true;
                }
            }
            if (!flg){
                break;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {90,21,34,56,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
