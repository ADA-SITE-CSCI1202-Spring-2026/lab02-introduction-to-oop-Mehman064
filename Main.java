public class Main {
    public static void main(String[] args) {

        Point a = new Point(2, 5);
        Point b = new Point(8, 11);

        Segment s = new Segment(a, b);

        System.out.println("Length: " + s.length());
    }
}