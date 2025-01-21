public class StringOp {
    public static void main(String[] args) {

        String str = "i love java";
        int result = str.length();
        System.out.println("Length = " + result);

        String name = "durgesh";

        System.out.println(name.length());

        String str1 = "java is";

        char ch = str1.charAt(3);
        System.out.println(ch);

        int index = str1.indexOf('a', 3);
        System.out.println(index);

        System.out.println("============");

        String str5 = "java is powerFul Language";

        System.out.println(str5.isEmpty());

        String newStr5 = str5.toUpperCase();
        System.out.println(str5);
        System.out.println(newStr5);

        String newNewStr5 = str5.toLowerCase();

        System.out.println(newNewStr5);

        System.out.println("==================");

        String eStr1 = "java";
        String eStr2 = "Java";

        boolean eResult = eStr1.equals(eStr2);
        System.out.println(eResult);

        System.out.println(eStr1.equalsIgnoreCase(eStr2));

        String str6 = " ";
        System.out.println(str6.isBlank());

    }

}
