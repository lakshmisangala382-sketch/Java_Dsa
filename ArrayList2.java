import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(80);
        list.add(30);
        list.add(50);

        System.out.println("Maximum = " + Collections.max(list));
    }
}