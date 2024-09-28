import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];
        System.out.print("Enter the array value:");

        for (int i =0;i<array.length;i++){
            array[i] = input.nextInt();
        }

        for (int j =0; j<array.length ; j++){
            System.out.println("Array values are : " +array[j]);
        }
    }




}
