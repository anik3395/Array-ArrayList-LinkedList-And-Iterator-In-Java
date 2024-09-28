import java.util.Scanner;

public class Problem2Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] originalArray = new int[10];

        System.out.print("Enter the array value:");
        for ( int i = 0; i < originalArray.length ; i++){
            originalArray[i] = input.nextInt();
        }

        System.out.println("Original Array: ");
        for (int j=0; j < originalArray.length; j++){
            System.out.print(" " + originalArray[j]);
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for (int k = originalArray.length-1; k >= 0; k--)
            System.out.print(originalArray[k] + " ");
    }
}
