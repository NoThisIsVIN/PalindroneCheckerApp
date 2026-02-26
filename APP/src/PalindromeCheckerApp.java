import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        long start, end;

        // Algorithm 1: Reverse String
        start = System.nanoTime();
        boolean result1 = reverseCheck(input);
        end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start) + " ns");

        // Algorithm 2: Two Pointer
        start = System.nanoTime();
        boolean result2 = twoPointerCheck(input);
        end = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (end - start) + " ns");

        System.out.println(result1 && result2 ? "Palindrome" : "Not a Palindrome");
        sc.close();
    }

    private static boolean reverseCheck(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    private static boolean twoPointerCheck(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}