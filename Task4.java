import java.util.*;


public class Task4 {
    public static void main(String[] args) {
        String word = "";
        System.out.println("enter a word to check if Palindrome");
        Scanner input = new Scanner(System.in);
        word = input.nextLine();
        System.out.println(word);

        StringBuilder reverse_string = new StringBuilder();
        int l = word.length()-1;

        for (int i=l;i>=0;i--){
            reverse_string.append(word.charAt(i));
//            System.out.println(reverse_string);
        }
        boolean palindrome = word.equalsIgnoreCase(reverse_string.toString());
        System.out.println("The reverse word of your input is: " + reverse_string);

        System.out.println(palindrome ? "This is palindrome":"This is not palindrome");
    }
}
