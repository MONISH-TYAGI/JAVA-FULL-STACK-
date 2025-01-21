import java.util.*;
import java.io.*;

public class TryWithResourceExmaple {
    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(System.in);
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                DbConnection db = new DbConnection();

        ) {

            System.out.println("Enter your age");

            int age = sc.nextInt();

            System.out.println("Your age is " + age);
            db.operate();

        } catch (Exception ex) {
            System.out.println("Error !!");
            ex.printStackTrace();
        }

    }
}
