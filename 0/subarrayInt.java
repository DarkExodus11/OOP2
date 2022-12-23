import java.util.Scanner;
import java.lang.Math;
public class subarrayInt {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of total elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        long a = System.nanoTime();
        for(int i=1;i < Math.pow(2,n);i++){
            int binarr[] = binArray(i);
            int sum=0;
            for(int j=0;j<n;j++){
                if(binarr[j]==1){
                    System.out.print(arr[j]+" ");
                    sum+=arr[j];
                }
            }
            System.out.println(" sum: "+sum);
        }
        System.out.println(System.nanoTime()-a);
        sc.close();
    }
    static int[] binArray(int x){
        int arr[] = new int[n];
        int index=0;
        while(x>1){
            int rem=x%2;
            arr[index++]=rem;
            x/=2;
        }
        arr[index]=1;
        return arr;
    }
}