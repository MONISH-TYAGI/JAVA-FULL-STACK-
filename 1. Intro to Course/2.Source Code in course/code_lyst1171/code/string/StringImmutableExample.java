public class StringImmutableExample {
    public static void main(String[] args) {

        String ob = "hi";

        System.out.println(ob.hashCode());

        ob = ob + "hello";

        System.out.println(ob.hashCode());

    }
}
