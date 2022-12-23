import java.util.*;
class BizzFizz{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                System.out.println(i+" :Bizz-Fizz");
            }else if(i%5==0){
                System.out.println(i+" :Fizz");
            }else if(i%3==0){
                System.out.println(i+" :Bizz");
            }
        }
        sc.close();
    }
}