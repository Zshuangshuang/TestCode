package struct;


public class SwitchDemo1 {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("较好");
                break;
            case 'C':
                System.out.println("一般");
                break;
            case 'D':
                System.out.println("差");
                break;
            default:
                System.out.println("挂了");
               break;
        }
    }
}
