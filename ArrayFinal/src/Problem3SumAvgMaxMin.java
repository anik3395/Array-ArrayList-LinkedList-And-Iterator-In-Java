import java.util.Scanner;

public class Problem3SumAvgMaxMin {
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
        System.out.println();
        int sum =0;
        System.out.println("Original Array summation: ");
        for ( int j =0; j < newArray.length;j++){
            sum = sum + newArray[j];
        }
        System.out.println(sum);

        System.out.println();
        int max;
        max = newArray[0];
        for ( int j =0; j < newArray.length;j++){
            if (max < newArray[j]){
                max=newArray[j];
            }
        }
        System.out.println(max);

        System.out.println();
        int min;
        min = newArray[0];
        for ( int j =0; j > newArray.length;j++){
            if (min < newArray[j]){
                min=newArray[j];
            }
        }
        System.out.println(min);

    }
}
