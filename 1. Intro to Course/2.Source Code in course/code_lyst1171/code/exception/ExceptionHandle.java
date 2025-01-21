public class ExceptionHandle {
    public static void main(String[] args) {

        System.out.println("program started...");
        System.out.println("welcome to this program");

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int divResult = n1 / n2;
            System.out.println("Division  : " + divResult);
        }

        catch (ArithmeticException ex) {
            System.out.println("Error !!");
            System.out.println("Second number cannot be zero");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Numbers");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Provide Two numbers in arguments");
        }

        catch (RuntimeException ex) {

        } finally {

            // alway executed :
            // try chale
            // chahe catch block chale

            System.out.println("final ending of the program");

        }

        System.out.println("Thankyou for using my Calculator");
        System.out.println("Program Ended");

        // try {

        // } catch (ArithmeticException | NullPointerException | NumberFormatException
        // ex) {

        // }

    }
}
