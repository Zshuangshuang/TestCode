
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      //判断参数的合法性
        if( pushA == null || popA == null || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty()){
                int tmp = stack.peek();
                if (tmp == popA[j]){
                    stack.pop();
                    j++;
                }
            }
        }
        return stack.isEmpty();
    }
}