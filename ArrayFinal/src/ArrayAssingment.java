import java.util.Scanner;

public class ArrayAssingment {
    public static void main(String[] args) {

        String[] daysOfWeek = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = input.nextInt();

        if (day >= 1 && day <= 7) {
            System.out.println("The day is: " + daysOfWeek[day]);
        } else {
            System.out.println("Invalid number! Please enter a number between 1 and 7.");
        }
    }
    }
