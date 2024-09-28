import java.util.Scanner;

public class Array2Summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];

        int sum =0;
        System.out.print("Enter input:");

        for ( int i=0; i<5;i++){
            number[i]=input.nextInt();
        }

        int max = number[0];
        for ( int i=1; i <5; i++ ){
            if (max < number[i]){
                max=number[i];
            }
        }
        System.out.println("Maximum is " + max);

        for (int i=0; i<5;i++){
            sum =sum + number[i];
        }
        System.out.println(sum);
    }
}
