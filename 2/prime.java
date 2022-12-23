import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        boolean prime = (n%2==0)?n==2:n!=1;
        for(int i=3;prime && i<=n/i;i+=2){
            prime=n%i!=0;
        }
        if(prime){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }
}