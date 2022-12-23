import java.util.Scanner;
public class Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char c = sc.next().charAt(0);
        if(c>='a' && c<= 'z'){
            System.out.println(c+" is lower case character");
        }else if(c>='A'&& c<='Z'){
            System.out.println(c+" is upper case character");
        }else if(c>='0' && c<='9'){
            System.out.println(c+" is a digit");
        }else{
            System.out.println(c+" is special case character");
        }
        sc.close();
    }    
}