import java.util.Scanner;

class Student{
    String name,rollno;
    int mark1, mark2, mark3;
    int total(){
        return mark1+mark2+mark3;
    }
}
class Percentage extends Student{
    float percentage;
    Percentage(){
        Getter();
    }
    void Getter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        name=sc.nextLine();
        System.out.println("Enter student roll no:");
        rollno=sc.nextLine();
        System.out.println("Enter student marks for subject 1:");
        mark1=sc.nextInt();
        System.out.println("Enter student marks for subject 2:");
        mark2=sc.nextInt();
        System.out.println("Enter student marks for subject 3:");
        mark3=sc.nextInt();
    }
    float percent(){
        return (total()/3);
    }
}
class Grade extends Percentage{
    Grade(){
        PrinGrade();
    }
    void PrinGrade(){
        String grade="";
        percentage=percent();
        if(percentage>=90 && percentage<=100){
            grade = "A+";
        }else if(percentage>=80 && percentage<=89){
            grade = "A";
        }else if(percentage>=70 && percentage<=79){
            grade = "B+";
        }else if(percentage>=60 && percentage<=69){
            grade = "B";
        }else if(percentage>=50 && percentage<=59){
            grade = "C+";
        }else if(percentage>=40 && percentage<=49){
            grade = "C";
        }else if(percentage>=0 && percentage<40){
            grade = "IF";
        }
        System.out.println("Grade of student:"+name+"("+rollno+") : "+grade);
    }
}
public class Prac6A {
    public static void main(String[] args) {
        Grade s = new Grade();
    }
}