import java.util.Scanner;

public class OOP_P2_C{
    public static void main(String args[]){

        //Widening or Automatic Type Casting/Conversion.

        System.out.println("\nAutomatic Type Casting :");
        System.out.print("\nEnter the byte number (ranging from -128 to 127) : ");
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();

        short s = b; //byte to short.

        int i = s; //short to int.

        long l = i; //int to long.

        float f = l; //long to float.

        double d = f; //float to double.

        System.out.println("\nOriginal byte, b = " + b);
        System.out.println("byte to short,  s = " + s);
        System.out.println("short to int, i = " + i);
        System.out.println("int to long, l = " + l);
        System.out.println("long to float, f = " + f);
        System.out.println("float to double, d = " + d);

        //Narrowing or Explicit Type Casting/Conversion.

        System.out.println("\nExplicit Type Casting :");
        System.out.print("\nEnter the double number : ");
        d = sc.nextDouble();

        f = (float)d; //double to float.

        l = (long)f; //float to long.

        i = (int)l; //long to int.

        s = (short)i; //int to short.

        b = (byte)s; //short to byte.

        System.out.println("\nOriginal double, d = " + d);
        System.out.println("double to float,  f = " + f);
        System.out.println("float to long, l = " + l);
        System.out.println("long to int, i = " + i);
        System.out.println("int to short, s = " + s);
        System.out.println("short to byte, b = " + b);

        //Type promotion in Expression

        System.out.println("\nType promotion in Expression : ");
        System.out.print("\nEnter the double number : ");
        d = sc.nextDouble();

        System.out.print("\nEnter the float number : ");
        f = sc.nextFloat();

        System.out.print("\nEnter the long number : ");
        l = sc.nextLong();

        System.out.print("\nEnter the int number : ");
        i = sc.nextInt();

        System.out.print("\nEnter the short number : ");
        s = sc.nextShort();
        
        System.out.print("\nEnter the byte number : ");
        b = sc.nextByte();

        double result = ((f * b) * (i - l)) / (d + s);

        System.out.println("\nresult = ((f * b) * (i - l)) / (d + s) = " + result + "\n");
    }
}