package struct;


public class DoWhileDemo1 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            i++;
            sum += i;
            System.out.println(sum);
        }while (i < 100);
    }
}
