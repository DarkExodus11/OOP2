public class complex {
    private float real,imaginary;
    complex(){
        real=1f;
        imaginary=1f;
    }
    complex(float real,float imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void display(){
        System.out.println(real+" "+'+'+" ("+imaginary+"i)");
    }
    public complex add(complex c){
        complex ans = new complex(real+c.real,imaginary+c.imaginary);
        return ans;
    }
    public complex sub(complex c){
        complex ans = new complex(real-c.real,imaginary-c.imaginary);
        return ans;
    }
    public static void main(String[] args) {
        complex c1 = new complex();
        complex c2 = new complex(2,5);
        complex c3=c1.add(c2);
        complex c4=c1.sub(c2);
        System.out.print("EQUATION 1: ");
        c3.display();
        System.out.print("EQUATION 2: ");
        c4.display();
    }
}