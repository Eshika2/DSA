package CodingExercises.StringPalindrome;

public class StringPalindrome2 {
    public static void main(String[] args) {
        String str = "racecar";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
//Write a code to identify a palindrome
//eg:
//racecar
