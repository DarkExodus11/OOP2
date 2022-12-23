import java.util.Scanner;
public class Prac5C{
    public static void main(String arg[]){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter input string:");
        String str = sc.nextLine();
        sc.close();
        if(str.length()>80){
            System.out.println("MAXIMUM 80 CHARACTERS ALLOWED");
            return;
        }
        String arr[] =  str.split("\\s+");
        if(arr[arr.length-1].charAt(arr[arr.length-1].length()-1)=='.'){
            arr[arr.length-1]=arr[arr.length-1].substring(0,arr[arr.length-1].length()-1);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0)>='a' && arr[i].charAt(0)<='z'){
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1); 
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].length()<arr[j].length()){
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }else if(arr[i].length()==arr[j].length()){
                    for(int k=0;k<arr[i].length();k++){
                        if(arr[i].charAt(k)<arr[j].charAt(k)){
                            break;
                        }
                        if(arr[i].charAt(k)>arr[j].charAt(k)){
                            String tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                                break;
                        }
                    }
                }
            }
        }
        arr[arr.length-1]+=".";
        System.out.println("Output:");
        for(String tmp : arr){
            System.out.print(tmp+" ");
        }
    }
}