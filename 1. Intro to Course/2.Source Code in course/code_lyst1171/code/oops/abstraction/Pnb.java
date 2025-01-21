public class Pnb implements Bank {

    int balance = 40000;

    public int getInterest() {
        return 6;
    }

    public void displayBalance(int accountNo) {
        System.out.println("balance :  " + balance);
    }
}
