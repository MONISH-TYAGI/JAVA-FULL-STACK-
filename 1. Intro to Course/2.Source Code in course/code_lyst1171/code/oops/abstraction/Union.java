public class Union implements Bank {

    public int getInterest() {
        return 10;
    }

    @Override
    public void displayBalance(int accountNo) {
        System.out.println("No balance");
    }

}
