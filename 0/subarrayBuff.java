import java.util.Scanner;
import java.lang.Math;
public class subarrayBuff{
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
            StringBuffer bin = binArray(i);
            int sum=0;
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1'){
                    System.out.print(arr[j]+" ");
                    sum+=arr[j];
                }
            }
            System.out.println(" sum: "+sum);
        }
        System.out.println(System.nanoTime()-a);
        sc.close();
    }
    static StringBuffer binArray(int x){
        StringBuffer arr = new StringBuffer();
        while(x>1){
            int rem=x%2;
            arr.append(rem);
            x/=2;
        }
        arr.append(1);
        return arr;
    }
}