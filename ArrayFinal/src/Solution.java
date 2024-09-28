import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Input:");

        // Read the input string
        String original = sc.next();

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();


        if (original.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
