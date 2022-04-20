package ProblemY;

public class SixthReversStrin {
    public static void main(String[] args) {
        String s="gokul iam";
        String[] s1= s.split(" ");
        String reversestr ="";
        for (String s2:s1){
            String reverseword="";
            for (int i=s2.length()-1;i>=0;i--){
                reverseword=reverseword+s2.charAt(i);
            }
            reversestr=reversestr+reverseword+" ";
        }
        System.out.println("org "+ s);
        System.out.println("the g "+reversestr);
    }
}
