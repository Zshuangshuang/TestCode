package 青蛙跳台阶;

public class Solution {
    public int JumpFloor(int target) {
        if (target <=0 ){
            return 0;
        }
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        for (int i = 3; i <= target; i++) {
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;
    }
}