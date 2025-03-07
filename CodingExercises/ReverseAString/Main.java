package CodingExercises.ReverseAString;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the anything : ");
        String str = obj.nextLine();

        String result = reverse(str);
        System.out.println(result);
    }
    public static String reverse(String str) {
        String result = "";
        for (int i=str.length()-1; i>=0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
