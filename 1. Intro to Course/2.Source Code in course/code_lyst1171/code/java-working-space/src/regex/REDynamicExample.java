package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDynamicExample {

    public static void checkStringAgainstRE(String re, String str) {

        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.matches();
        System.out.println(matches);

    }


    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter regular expression");
            Scanner scanner = new Scanner(System.in);
            String re = scanner.nextLine();
            System.out.println("Enter your string");
            String str = scanner.nextLine();
            checkStringAgainstRE(re, str);
            System.out.println("Want to exit [Y/N]");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Thankyou for using this app");
                break;

            }
        }


    }
}
