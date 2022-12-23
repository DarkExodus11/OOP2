public class typecasting {
    public static void main(String[] args) {
        int i=10;
        long l=i;//AUTOMATIC type conversion
        float f=i;//AUTOMATIC type conversion
        double d=i;//AUTOMATIC type conversion

        i=(int)l;//EXPLICIT type conversion
        f=l;//AUTOMATIC type conversion
        d=l;//AUTOMATIC type conversion

        i=(int)f;//EXPLCIT type conversion
        l=(long)f;//EXPLCIT type conversion
        d=f;//AUTOMATIC type conversion

        i=(int)d;//EXPLICIT type conversion
        l=(long)d;//EXPLICIT type conversion
        f=(float)d;//EXPLICIT type conversion

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }       
}