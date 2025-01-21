import java.util.StringTokenizer;

public class TokenExample {
    public static void main(String[] args) {

        StringTokenizer tokenizer = new StringTokenizer("This is my program");

        System.out.println("Tokens : " + tokenizer.countTokens());

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token + ": " + token.length());
        }

    }
}
