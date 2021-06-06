

public class Solution2 {

    public int[] reOrderArray (int[] array) {
       if(array == null || array.length == 0){
           return array;
       }
       int oddPos = 0;
       int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            if (array[i] %2 == 0){
                continue;
            }else {
                int evePos = i;
                while (evePos > oddPos){
                    array[evePos] = array[evePos-1];
                    evePos--;
                }
                array[oddPos] = tmp;
                oddPos++;
            }
        }
        return array;
    }
}