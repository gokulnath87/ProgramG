package ProblemY;

import java.util.function.IntPredicate;

public class JavaEightVowels {
    public static boolean isvowel(char t){
        return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
                t=='A'||t=='E'||t=='I'||t=='O'||t=='U';

    }
    public static void main(String[] args) {
        String str="gokulgokul";
        int cvowl=0;
        for (int x=0;x<str.length();x++) {
            if (isvowel(str.charAt(x))) {
                cvowl++;
            }
        }
        System.out.println("ccc"+ cvowl);


        System.out.println("java8");
        IntPredicate vowel= new IntPredicate() {
            @Override
            public boolean test(int t) {
               return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
                t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
            }

        };
        String test ="gokulgo";
        long cv=test.chars().filter(vowel).count();
        System.out.println("cou" + cv);
    }

}
