import java.util.Scanner;
public class rearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ext[] =new int[n];
        int positive=0,negative=n-1;
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++) {
            if((arr[i]=sc.nextInt())>-1){
                ext[positive++]=arr[i];
            }else{
                ext[negative--]=arr[i];
            }
        }
        int start=negative+1;
        int last=n-1;
        while(start<last){
            int temp=ext[start];
            ext[start]=ext[last];
            ext[last]=temp;
            start++;
            last--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ext[i]+" ");
        }
        sc.close();
    }
}