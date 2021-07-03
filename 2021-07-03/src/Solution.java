import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k > input.length || input.length == 0){
            return result;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
       for (int x : input){
           queue.offer(x);
       }
       while (!queue.isEmpty() && k>0){
           result.add(queue.poll());
           k--;
       }
       return result;
    }
}