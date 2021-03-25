package 输出1到100中9的个数;


public class TestDemo {
    public static void main(String[] args) {
        System.out.println(display());;
    }
    private static int display(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9){
                count++;
            }
            if (i / 10 == 9){
                count++;
            }
        }
        return count;
    }
}
