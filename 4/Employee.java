public class Employee {
    protected float salary;
    protected int hours;
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
        Employee emp = new Employee();
        emp.getInfo(450, 7);
        emp.AddSal();
        emp.AddWork();
        System.out.println("Salary of employee is: "+emp.salary);
    }
}