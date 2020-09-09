import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) { // I worked with Cameron Shaw on this problem
        return str.length() - str.replaceAll("a", "").replaceAll("b", "").replaceAll("c", "").length();
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return str.toLowerCase().contains("the");
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Your string contains " + countABC(str) + " a's, b's, or c's");
        System.out.println("Your string " + ((containsThe(str)) ? "DOES" : "DOES NOT") + " contain \"the\"");
        System.out.println("Your string " + ((isPalindrome(str)) ? "IS" : "IS NOT") + " a palindrome");
    }
}
