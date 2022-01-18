class BankAccount {
    protected double balance;
    public BankAccount(double balanceIn) {
        balance = balanceIn;
    }

    public void printBalance() {
        System.out.println("Your account balance is $" + balance);
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override 
    public void printBalance() {
        System.out.println("Your checking account balance is $" +balance);
    }

    public void checkBalances() {
        //calls method from checkingAccount
        printBalance();
        //calls method from BankAccount
        super.printBalance();
    }

    public static void main(String[] args) {
        CheckingAccount  myChecking = new CheckingAccount(500);
        myChecking.checkBalances();
    }

}


