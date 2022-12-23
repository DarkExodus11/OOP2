public class Employee2 {
    protected float salary;
    protected int hours;
    Employee2(){}
    Employee2(float salary,int hours){
        this.salary=salary;
        this.hours=hours;
    }
    void getInfo(float salary,int hours){
        this.salary=salary;
        this.hours=hours;
    }
    void AddSal(){
        if(salary<500){
            salary+=10;
        }
    }
    void AddWork(){
        if(hours>6){
            salary+=5;
        }
    }
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2();
        Employee2 emp2 = new Employee2(500,8);
        emp1.getInfo(450, 7);
        emp1.AddSal();
        emp1.AddWork();
        emp2.AddSal();
        emp2.AddWork();
        System.out.println("Salary of employee 1 is: "+emp1.salary);
        System.out.println("Salary of employee 2 is: "+emp2.salary);
    }
}