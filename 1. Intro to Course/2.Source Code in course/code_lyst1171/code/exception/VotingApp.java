import java.util.*;

public class VotingApp {
    public static void main(String[] args) {

        System.out.println("Application Started");

        try {

            System.out.println("Enter age");

            Scanner ob = new Scanner(System.in);

            int age = ob.nextInt();

            if (age < 18) {
                // hame yaha par error ko lani
                AgeInvalidException ex = new AgeInvalidException();
                throw ex;
            }
            System.out.println("Voted !!");
        } catch (AgeInvalidException ex) {
            System.out.println("Error !!");
            ex.printStackTrace();

        }

        System.out.println("Thankyou for using our vote bank");
        System.out.println("bye bye");

    }
}
