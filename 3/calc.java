import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two operands:");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.print("Enter operator:");
        switch(sc.next().charAt(0)){
            case '+':
                a+=b;
                break;
            case '-':
                a-=b;
                break;
            case '/':
                a/=b;
                break;
            case '*':
                a*=b;
                break;
            case '&':
                a&=b;
                break;
            case '|':
                a|=b;
                break;
            case '^':
                a^=b;
                break;
            case '%':
                a%=b;
                break;
            default:
                System.out.println("Invalid!");return;
        }
        System.out.println("Answer: "+a);
        sc.close();
    }
}