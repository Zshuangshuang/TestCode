package struct;


import java.util.Scanner;

public class SelectDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("恭喜获得满分");
        }else if(score<100 && score >= 90){
            System.out.println("A级");
        }else if(score < 90 && score >= 80){
            System.out.println("B级");
        }else if (score<80 && score >= 70){
            System.out.println("C级");
        }else if (score < 70 && score >= 60){
            System.out.println("D级");
        }else {
            System.out.println("不及格");
        }
    }
}
