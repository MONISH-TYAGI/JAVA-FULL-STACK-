public class StringPart2 {
    public static void main(String[] args) {
        String str = "java is java";

        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.startsWith("java"));
        System.out.println(str.endsWith("Java"));

        String str1 = "     java     ";

        System.out.println(str1.trim());
        System.out.println(str1.strip());
        System.out.println(str1.stripTrailing());
        System.out.println(str1.stripLeading());

        String str2 = "java is my favorite";

        String substringStr = str2.substring(5);
        System.out.println(substringStr);

        System.out.println(str2.substring(0, 4));

        char[] chars = str2.toCharArray();

        // for (char c : chars) {
        // System.out.println(c);
        // }

        String splittedString[] = str2.split(" ");

        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[3]);

        String string2 = String.valueOf(2);
        System.out.println(string2);

        long num = 2525235235L;

        String numStr = String.valueOf(num);

        System.out.println(numStr.length());

        System.out.println("=============");

        String str5 = "AAAA";
        String str6 = "A";
        System.out.println(str5.compareTo(str6));

        String str7 = "java is good programming";

        System.out.println(str7.replace("java", "python").replace("good", "bad"));

        String joinedString = String.join("-", "java", "is", "my", "favoriate");
        System.out.println(joinedString);

    }
}
