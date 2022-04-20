package ProblemY;

public class CharacterStringOne {
    public static boolean onlyAlphabets(String str, int n)
    {

        // Return false if the string
        // has empty or null
        if (str == null || str == "") {
            return false;
        }

        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
            // Check if the specified
            // character is not a letter then
            // return false,
            // else return true
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "Geeksfor1Geeks";
        int len = str.length();

        // Function Call
        System.out.println(
                onlyAlphabets(str, len));
    }
}
