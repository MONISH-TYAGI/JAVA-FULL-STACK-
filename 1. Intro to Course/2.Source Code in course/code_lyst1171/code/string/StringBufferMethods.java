public class StringBufferMethods {

    public static void main(String[] args) {

        StringBuffer br = new StringBuffer("Hello");

        br.append(10);
        br.append(45.7);
        br.append(" how are you?");
        br.append(new char[] { 'a', 'b', 'c' });

        System.out.println(br);

        StringBuffer br1 = new StringBuffer("jva");
        br1.insert(1, 10L);
        System.out.println(br1);

        String str = br.substring(2);
        System.out.println(str);

        StringBuffer nameBr = new StringBuffer("Durgesh");

        System.out.println(nameBr);

        // nameBr.reverse();

        // System.out.println(nameBr);
        // StringBuffer buffer = nameBr.repeat(" tiwari", 2);

        // System.out.println(buffer);

    }
}
