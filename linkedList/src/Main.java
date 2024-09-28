import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> countryName = new LinkedList<>();

        countryName.add("Bangladesh");
        countryName.add("Bhutan");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("Nepal");

        countryName.addFirst("Australia");
        countryName.addLast("Japan");

        System.out.println(countryName);

        System.out.println("The first element is :" + countryName.getFirst());
        System.out.println("The Last element is :" + countryName.getLast());
        System.out.println(countryName.get(2));
    }
}
