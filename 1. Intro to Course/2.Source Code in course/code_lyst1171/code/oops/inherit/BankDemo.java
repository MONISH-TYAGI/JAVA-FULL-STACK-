public class BankDemo {
    public static void main(String[] args) {
        Bank bank1 = new Pnb();
        Bank bank2 = new Union();
        Kenra bank3 = new Kenra();

        Human durgesh = new Human(bank1);
        Human harsh = new Human(bank2);
        Human anshu = new Human(bank3);

        durgesh.showBankInterest();
        harsh.showBankInterest();
        anshu.showBankInterest();

    }
}
