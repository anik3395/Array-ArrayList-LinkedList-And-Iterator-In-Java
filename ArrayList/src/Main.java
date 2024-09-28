import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        System.out.println("The size of initial Array is :" + number.size());

        //Adding Element...
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

//        System.out.println(number);
        for ( int i : number){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The size of update Array is :" + number.size());

        number.remove(2);
        System.out.println(number);
        System.out.println("The size of update Array is :" + number.size());

        boolean check = number.isEmpty();
        System.out.println("The array List is empty " + check);

        ArrayList <Integer> number1 = new ArrayList<>();
        number1.add(10);
        number1.add(20);
        number1.add(40);

        for ( int j : number1){
            System.out.print(" " + j);
        }
        System.out.println();

        boolean CheckResult =  number.equals(number1);
        System.out.println(CheckResult);
    }
}
