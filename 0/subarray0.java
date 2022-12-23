import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class subarray0 {
    static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of total elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }

        long start = System.nanoTime();
        printSubArray0(arr,(int)Math.pow(2, n));
        System.out.println((System.nanoTime()-start)/1000000+"ms");

        sc.close();
    }

    static void printSubArray0(int arr[],int subArraySize){

        int[][] subArray = new int[subArraySize-1][n]; 
        int subArrayIndex=0;
        
        for(int i=1;i<subArraySize;i++){
            
            int index=0;
            int sum=0;
            
            for (int j = 0; j < arr.length; j++) {
                if((i & (1 << j))>0){
                    sum += arr[j];
                    subArray[subArrayIndex][index++]=arr[j];
                }
            }

            // if(sum==0){
                System.out.println(Arrays.toString(subArray[subArrayIndex])+" sum: "+sum);
            // }
            
            subArrayIndex++;
        }
    }

}