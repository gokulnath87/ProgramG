package ProblemY;

public class SwapStrings {
    public static void main(String[] args) {


        String a = "java";
        String b = "gokul";
        System.out.println("before swap "+ a + b);
        a = a + b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("after swap "+ a + b);

    }
}
