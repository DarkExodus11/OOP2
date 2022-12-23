public class Prac5A {
    public static void main(String[] args) {
        String s = "Nirma University",srev="";
        for (int i = s.length()-1; i > -1; i--) {
            srev+=s.charAt(i);
        }
        System.out.println("Using String: ");
        System.out.println("Reverse: "+srev);
        System.out.println("Replaced Ni with Ab: "+s.replace("Ni","Ab"));
        System.out.println("Check if rma is present?: "+s.contains("rma"));
        System.out.println("Check if Uni is present?: "+s.contains("Uni"));
        StringBuffer sbuf1 = new StringBuffer(s);
        StringBuffer sbuf2 = new StringBuffer(s);
        sbuf2.reverse();
        System.out.println("Using StringBuffer:");
        System.out.println("Reverse: "+sbuf2);
        System.out.println("Replaced Ni with Ab: "+sbuf1.replace(sbuf1.indexOf("Ni"),(sbuf1.indexOf("Ni")+"Ni".length()),"Ab"));
        System.out.println("Check if rma is present?:"+(sbuf1.indexOf("rma")>-1));
        System.out.println("Check if Uni is present?:"+(sbuf1.indexOf("Uni")>-1));
    }
}