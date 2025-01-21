public class AgeInvalidException extends Exception {

    public AgeInvalidException() {
        super("Age is Invalid !!");
    }

    public AgeInvalidException(String message) {
        super(message);
    }

}
