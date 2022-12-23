import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if((n & 1) == 0){
            System.out.println(n+" is EVEN");
        }else{
            System.out.println(n+" is ODD");
        }
    }
}