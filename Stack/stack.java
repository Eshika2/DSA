package Stack;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //LIFO
        Stack<String> s = new Stack<String>();

        s.push("Kamal");
        s.push("Nimal");
        s.push("Wimal");
        String popValue = s.pop();
        String peelValue = s.peek();
        int searchValue = s.search("Nimal");

        System.out.println(s);
        System.out.println(popValue);
        System.out.println(peelValue);
        System.out.println(searchValue);
    }
}
