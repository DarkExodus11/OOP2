import java.util.*;
public class Rearrange{
    public static void main(String args[]){
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i,j,temp=0;
        System.out.println("Enter the elements of array : ");
        for(i=0;i<n;i++)
        {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i;j<n-1;j++)
            {
                if(arr[j]<0 && arr[j+1]>=0)
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nThe new array is : ");
        for(i=0;i<n;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
