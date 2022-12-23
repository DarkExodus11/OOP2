import java.util.*;
class Special{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt(),sum=0,mul=1,temp=n;
        while(temp>0){
            sum+=temp%10;
            mul*=temp%10;
            temp/=10;
        }
        if((sum+mul)==n){
            System.out.println(n+" is a special number");
        }else{
            System.out.println(n+" is not a special number");
        }
        sc.close();
    }
}