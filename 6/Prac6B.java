import java.util.Scanner;
class BasicPatient{
    String name,address;
    int age;
    void display(){
        System.out.println();
        System.out.println("Patient name: "+name);
        System.out.println("Patient age: "+age);
        System.out.println("Patient address: "+address);
    }
}
class Patient extends BasicPatient{
    Patient(){
        age=0;
        name="";
        address="";
    }
    Patient(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class CovidParameters extends Patient{
    float CTScore,Ddimer;
    int platelet;
    CovidParameters(){
        super();
        CTScore=0;
        Ddimer=0;
        platelet=0;
    }
    CovidParameters(String name,int age,String address,float CTScore,float Ddimer,int platelet){
        super(name, age, address);
        this.CTScore=CTScore;
        this.Ddimer=Ddimer;
        this.platelet=platelet;
    }
    public void display(){
        super.display();
        System.out.println("CTScore: "+CTScore);
        System.out.println("Ddimer: "+Ddimer);
        System.out.println("Platelet: "+platelet);
    }
    public void Getter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        name=sc.next();
        System.out.print("Enter patient age: ");
        age=sc.nextInt();
        System.out.print("Enter patient address: ");
        sc.nextLine();
        address=sc.nextLine();
        System.out.print("Enter CTScore: ");
        CTScore=sc.nextFloat();
        System.out.print("Enter Ddimer: ");
        Ddimer=sc.nextFloat();
        System.out.print("Enter platelet: ");
        platelet=sc.nextInt();
        sc.close();
    }
}
class Test{
    Test(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size for users:");
        n=sc.nextInt();
        CovidParameters obj[] = new CovidParameters[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new CovidParameters();
            System.out.println("======= ENTER PATIENT"+(i+1)+" DETAILS =======");
            obj[i].Getter();
            System.out.println("======= DETAILS OF PATIENT"+(i+1)+" =======");
            obj[i].display();
        }
    }
}
public class Prac6B {
    public static void main(String[] args) {
        CovidParameters obj1 = new CovidParameters("PatientA", 18,"Nirma", 21, 150, 1000);
        obj1.display();
            Test t1 = new Test();
    }
} 