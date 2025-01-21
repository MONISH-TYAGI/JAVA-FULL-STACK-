import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String str = new String("java is wow");
        Scanner ob = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println(ob instanceof Scanner);
        System.out.println(str instanceof Object);
        System.out.println(ob instanceof Object);
        System.out.println(bank instanceof Object);

    }
}
