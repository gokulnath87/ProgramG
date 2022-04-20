package ProblemY;

public class CharacterStringTwo {
    // Method 1
    // To check String for only Alphabets
    public static boolean isStringOnlyAlphabet(String str)
    {

        return ((str != null) && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {

        // Calling out methods over string
        // covering all scenarios

        // Use case 1
        System.out.println("Test Case 1:");
        // Input string
        String str1 = "Geeksfor2Geeks";
        System.out.println("Input: " + str1);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str1));
    }
}
