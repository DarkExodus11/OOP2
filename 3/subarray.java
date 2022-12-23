import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt(),arr[] = new int[n];
        boolean flag=false;
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum=arr[i];
            for (int j = i+1; j < n; j++) {
                sum+=arr[j];
                if(sum==0){
                    flag=true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("YES!");
        }else{
            System.out.println("NO!");
        }
        sc.close();
    }
}