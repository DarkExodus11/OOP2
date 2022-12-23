import java.util.Scanner;
public class birthdate {
    public static void main(String[] args) {
        int date,month,year;
        boolean leap=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth date,month,year:");
        date=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        sc.close();
        if(year>0){
            if(year%400==0 || year%4==0 && year%100!=0){
                leap=true;
            }
        }else{
            System.out.println("Invalid year!");
            return;
        }
        if(month <13 && month >0){
            if(month==4 ||month==6 ||month==9 ||month==11){
                if(!(date>0 && date<31)){
                    System.out.println("Invalid date!");
                    return;
                }
            }else if(month==2){
                if(leap){
                    if(!(date>0 && date<30)){
                        System.out.println("Invalid date!");
                        return;
                    }
                }else{
                    if(!(date>0 && date<29)){
                        System.out.println("Invalid date!");
                        return;
                    }
                }
            }else if(!(date>0 && date<32)){
                System.out.println("Invalid date!");
                return;
            }
        }else{
            System.out.println("Invalid month!");
            return;
        }
        System.out.println("Your birthdate is:"+date+"/"+month+"/"+year);
    }
}