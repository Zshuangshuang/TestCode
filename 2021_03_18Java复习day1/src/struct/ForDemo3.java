package struct;


public class ForDemo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
