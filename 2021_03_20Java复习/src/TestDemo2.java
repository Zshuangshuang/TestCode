import java.util.Scanner;

public class TestDemo2 {
    public static boolean isPrime2(int num){
        int sqrt = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
                if (num%i == 0){
                    return false;
                }
        }
        return true;
    }
    public static boolean isPrime1(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //判定一个数字是否是素数
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(isPrime2(num));
        }
    }
}
