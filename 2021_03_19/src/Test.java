import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-19 13:53
 */
public class Test {
    public static List<Integer> sum(int n){
        List<Integer> result = new ArrayList<>();
        if (n <= 0){
            return result;
        }
        for (int i = 1; i <= n; i++) {
            if (2*i+1 == n){
                result.add(i);
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = sum(n);
        System.out.println(list);
    }
}
