import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of levels for pattern:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<n+1;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}