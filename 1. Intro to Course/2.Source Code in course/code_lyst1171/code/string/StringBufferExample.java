public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer br = new StringBuffer("hi");
        br.append("hello");
        br.append("252525r2fwfcfafrwgfqrwfqrwvqrwqrwg");
        System.out.println(br);
        System.out.println(br.hashCode());
        System.out.println(br.capacity());
        StringBuffer br1 = new StringBuffer(100);
        System.out.println(br1.capacity());

        br1.repeat(null, 5);
        System.out.println(br1);

    }

}
