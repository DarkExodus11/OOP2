import java.util.*;
public class Prac5B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string:");
        String s = sc.nextLine(),word;
        int chars[] = new int[256];
        for(int i=0;i<s.length();i++){
            chars[(int)s.charAt(i)]++;
        }
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        System.out.println("No of sentences : "+s.split("[?.]").length);
        System.out.println("No of Words : "+s.split(" ").length);
        for(String x : s.split("[?.]")){
            System.out.println("Sentence: \""+x.trim() +"\" has: "+x.trim().split(" ").length+ " words");
        }
        System.out.println("No of Characters : "+s.replaceAll("\\s+","").length());
        for(int i=0;i<256;i++){
            if(chars[i]>0){
            System.out.println((char)i+" occurs:"+chars[i]+" time");
            }
        }
        System.out.print("Enter the search keyword: ");
        word=sc.next();
        if(s.contains(word)){
            System.out.println(word+" is present in the paragraph.");
        }else{
            System.out.println(word+" is not present in the paragraph!");
        }
        sc.close();
    }
}