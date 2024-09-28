import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList < Student > studentList = new LinkedList<>();

        Student student =new Student("Anik", 1808031,"Bsc");
        studentList.add(student);

        Student student2 =new Student("Milon", 1808032,"Msc");
        studentList.add(student2);

        Student student3 =new Student("Dipty", 1808033,"Tsc");
        studentList.add(student3);

        Student student4 =new Student("Mampy", 1808034,"Csc");
        studentList.add(student4);

        for ( Student i : studentList){
            System.out.println(i.name + " " + i.id + " " + i.className);
        }
    }
}
