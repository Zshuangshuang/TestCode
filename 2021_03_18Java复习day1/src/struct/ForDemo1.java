package struct;


public class ForDemo1 {
    public static void main(String[] args) {
        //计算0-100的奇数之和和偶数之和
        int oldSum = 0;
        int evenSum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                evenSum+=i;
            }else {
                oldSum += i;
            }
        }
        System.out.println("奇数之和:"+oldSum);
        System.out.println("偶数之和:"+evenSum);
    }
}
