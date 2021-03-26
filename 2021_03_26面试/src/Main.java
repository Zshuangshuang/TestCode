import java.util.Arrays;


public class Main {
    public static int[] intersection (int[] set1, int[] set2) {
        if (set1 == null || set2 == null){
            return null;
        }
        int i = 0;//表示set1的下标
        int j = 0;//表示set2的下标
        int ret = 0;//表示结果集合的下标
        int len = set1.length-set2.length;
        int[] array;
        if (len < 0){
            array = new int[set1.length];
        }else {
           array = new int[set2.length];
        }

        while (i < set1.length && j < set2.length){
            while(set1[i] < set2[j] ){
                i++;
            }
            if (set1[i] == set2[j]){
                array[ret] = set1[i];
                i++;
                j++;
                ret++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {2,3,4};
        System.out.println(Arrays.toString(intersection(array1,array2)));
    }
}
