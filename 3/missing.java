import java.util.Scanner;
public class missing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter range of elements:");
        int n = sc.nextInt(),arr[] = new int[n-1],sum=0;
        System.out.println("Enter "+(n-1)+" elements:");
        for (int i = 0; i < n-1; i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Missing element is "+((n*(n+1)/2)-sum));
        sc.close();
    }
}