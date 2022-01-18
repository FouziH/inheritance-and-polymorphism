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
    public void printBalance(double balance) {
        System.out.println("Your checking account balance is $" +balance);
    }

}


