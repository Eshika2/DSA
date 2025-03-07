package CodingExercises.StringPalindrome;

public class Main {
    public static void main(String[] args) {
        String str = "naman";
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        System.out.println(str);
        System.out.println(reverse);
    }
}
