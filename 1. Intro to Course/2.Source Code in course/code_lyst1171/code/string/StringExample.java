public class StringExample {
    public static void main(String[] args) {

        // created using : literal
        String str = "this is working fine";

        // created: using new keyword
        String str1 = new String("this is not working fine");

        System.out.println(str);
        System.out.println(str1);

        // creating blank string

        String str2 = new String();

        byte[] data = { 65, 66, 67 };

        String str3 = new String(data);

        System.out.println(str3);

        char[] chars = {
                'a', 'f', 't', 'u'
        };

        String str4 = new String(chars);

        System.out.println(str4);

        StringBuffer bf = new StringBuffer("this is buffer value");

        String str5 = new String(bf);

        System.out.println(str5);

    }
}