import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for ( int i =0; i <=20; i++){
            names.add("Name" + i);
        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
