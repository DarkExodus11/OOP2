import java.util.Scanner;
public class paratmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        boolean flag=true;
        while(flag){
            String s1=sc.next();
            if(s1.equals("EOF")){
                flag=false;
                break;
            }
            s+=s1;
        }
        sc.close();
        System.out.println(s);
    }
}