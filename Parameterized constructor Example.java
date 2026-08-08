public class Main {

    int x, y;

    Main(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Main m = new Main(12, 23);
        m.display();
    }
}