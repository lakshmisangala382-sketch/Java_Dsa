import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("First Element: " + list.get(0));

        list.remove("Banana");
        System.out.println("After Remove: " + list);

        list.clear();
        System.out.println("After Clear: " + list);
    }
}