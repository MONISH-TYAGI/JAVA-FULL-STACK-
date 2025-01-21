public class BankDemo {
    public static void main(String[] args) {

        Bank bank1 = new Pnb();
        Bank bank2 = new Union();

        int interest = bank1.getInterest();
        System.out.println("Interest : " + interest);
        bank1.displayBalance(1321);

        System.out.println(bank2.getInterest());
        bank2.displayBalance(124);

    }
}
