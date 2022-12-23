import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 elements:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Largest is: "+((a>b && a>c)?a:(b>c)?b:c));
        sc.close();
    }
}