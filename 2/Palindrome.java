import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt(),rev=0,tmp=n;
        while(tmp>0){
            int rem=tmp%10;
            rev=rev*10+rem;
            tmp/=10;
        }
        if(n==rev){
            System.out.println(n+" is a palindrome number");
        }else{
            System.out.println(n+" is not a palindrome number");
        }
        sc.close();
    }
}