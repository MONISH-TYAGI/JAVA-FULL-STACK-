public class SCP {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }
}