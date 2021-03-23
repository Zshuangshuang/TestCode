package 跳台阶;

public class Solution {
    public int JumpFloor(int target) {
        //判断参数的合法性
        if (target <= 0){
            return 0;
        }
        if (target == 1){
            return 1;
        }
        int t1 = 1;
        int t2 = 2;
        int t3 = 0;
        for (int i = 3; i <= target; i++) {
            t3 = t1+t2;
            t1 = t2;
            t2 = t3;
        }
        return t2;
    }
}