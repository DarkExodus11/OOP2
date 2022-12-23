import java.util.Scanner;
public class pseudorearrange {
    static int arr[];
    public static void main(String[] args) {
        pseudorearrange obj = new pseudorearrange();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        int n=sc.nextInt();
        arr = new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        obj.divide(0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    void divide(int i,int j){
        if(i>=j){
            return;
        }
        int mid=(i+j)/2;
        divide(i, mid);
        divide(mid+1, j);
        merge(i, mid, j);
    }
    void merge(int low,int mid,int high){
        int l=low,k=mid+1;
        while(l<=mid && arr[l]>-1){
            l++;
        }
        while(k<=high && arr[k]>-1){
            k++;
        }
        reverse(l,mid);
        reverse(mid+1, k-1);
        reverse(l,k-1);
    }
    void reverse(int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}