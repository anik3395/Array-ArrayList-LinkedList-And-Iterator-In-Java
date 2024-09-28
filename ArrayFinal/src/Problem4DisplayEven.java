import java.util.Scanner;

public class Problem4DisplayEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] newArray = new int[10];

        System.out.println("Original Array  input: ");
        for (int i =0; i< newArray.length;i++){
            newArray[i] = input.nextInt();
        }
        System.out.println("Original Array: ");
        for ( int j =0; j < newArray.length;j++){
            System.out.print(" " +newArray[j]);
        }

        int sum=0;
        System.out.println();
        for (int j =0; j < newArray.length;j++){
            if (newArray[j] % 2 == 0){
                System.out.println( "The Even element is : "+ newArray[j]);
            }
        }

        System.out.println();
        for (int j =0; j < newArray.length;j++){
            if (newArray[j] % 2 == 0){
                sum = sum + newArray[j];
            }
        }
        System.out.println("The sum of even number is : " + sum);

        System.out.println();
        for (int j =0; j < newArray.length;j++){
            if (newArray[j] % 2 != 0){
                System.out.println( "The odd element is : "+ newArray[j]);
            }
        }



    }
}
