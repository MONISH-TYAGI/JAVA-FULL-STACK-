public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder bl = new StringBuilder("Durgesh Kumar Tiwari");
        System.out.println(bl);
        bl.append(" i live in INDIA");
        System.out.println(bl);
        bl.reverse();

        System.out.println(bl);

        System.out.println(Thread.currentThread().getName());

    }
}
