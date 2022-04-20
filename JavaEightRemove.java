package ProblemY;

import java.util.stream.Collectors;

public class JavaEightRemove {
    public static void main(String[] args) {
        String s ="gokulnath";
        char c='g';
        removeCharUsingStream(s,c);
    }

    private static void removeCharUsingStream(String s, char c) {
        String res =s.chars().filter(Character -> Character!= c)
                .mapToObj(cg->String.valueOf((char) cg)).
                collect(Collectors.joining());
        System.out.println("yee "+ res);
    }

}
