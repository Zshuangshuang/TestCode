public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0){
            return false;
        }
        int left = 0;
        int right = sequence.length-1;
        while (right != 0){
            while (sequence[left] < sequence[right]){
                left++;
            }
            while(sequence[left] > sequence[right]){
                left++;
            }
            if (left < right){
                return false;
            }
            right--;
            left = 0;
        }
        return true;
    }
}