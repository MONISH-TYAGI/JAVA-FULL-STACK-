public class Human {

    Bank bank;

    Human(Bank bank) {
        this.bank = bank;
    }

    // bank account
    public void showBankInterest() {
        this.bank.getRateOfInterest();
    }

}
