import java.util.Scanner;
public class paragraph {
    public static void main(String argv[]) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("::Start Entering Paragraph from Here::\n\t");
        s=sc.nextLine();
        char[] c=s.toCharArray();
        // System.out.print("\nTotal Character :=:"+c.length+"\nTotal Spaces :=:"+ (s.length()-s.replace(" ", "").toCharArray().length));
        System.out.println("\nTotal Sentences :=:"+ s.replace(" ","").replace("."," ").split(" ").length);
        System.out.println("Total number of words :"+   s.split(" ").length);
    }
}