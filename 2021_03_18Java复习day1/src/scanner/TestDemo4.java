package scanner;


import java.util.Scanner;

public class TestDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            sum += num;
            i++;
        }
        scanner.close();
        System.out.println("总和:"+sum);
        System.out.println("平均数:"+sum/(i*1.0));
    }
}
