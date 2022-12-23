import java.util.Random;
abstract class Compartment{
    abstract void notice();
}
class FirstClass extends Compartment{
    @Override
    void notice(){
        System.out.println("This is FirstClass compartment!");
    }
}
class Ladies extends Compartment{
    @Override
    void notice(){
        System.out.println("This is Ladies compartment!");
    }
}
class General extends Compartment{
    @Override
    void notice(){
        System.out.println("This is General compartment!");
    }
}
class Luggage extends Compartment{
    @Override
    void notice(){
        System.out.println("This is Luggage compartment!");
    }
}
class TestCompartment{
    TestCompartment(){
        Compartment obj[] = new Compartment[10];
        for (int i = 0; i < obj.length; i++) {
            Random random = new Random();
            switch(random.nextInt(4)+1){
                case 1:
                    obj[i] = new FirstClass();
                    break;
                case 2:
                    obj[i] = new Ladies();
                    break;
                case 3:
                    obj[i] = new General();
                    break;
                case 4:
                    obj[i] = new Luggage();
            }
            obj[i].notice();
        }
    }
}
public class Prac7B {
    public static void main(String[] args) {
        TestCompartment obj = new TestCompartment();
    }
}