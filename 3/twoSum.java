import java.util.Scanner;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt(),k,count=0;
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the integer k:");
        k=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.println("Total number of pairs whose sum is equal to "+k+" is:"+count);
        sc.close();
    }
}