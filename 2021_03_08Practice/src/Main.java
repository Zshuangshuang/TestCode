import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-08 22:27
 */
public class Main {
    private static int count(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String line  = scanner.nextLine();
            }
        }
    }
}
