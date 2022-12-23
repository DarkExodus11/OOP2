abstract class Instrument{
   abstract void play();
}
class Piano extends Instrument{
    void play(){
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument{
    void play(){
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class Prac7A {
    public static void main(String[] args) {
        Instrument obj[] = new Instrument[10];
        for (int i = 0; i < 10; i++) {
            switch(i%3){
                case 0:
                    obj[i] = new Piano();
                    break;
                case 1:
                    obj[i] = new Flute();
                    break;
                case 2:
                    obj[i] = new Guitar();
            }
            obj[i].play();
        }
    }
}