public abstract class BankAccount {

    ATMCard atmCard;
    long accountNumber;
    int totalBalance;
    int availableBalance;
    int withDrawlLimit;

    public abstract void checkBalance();
}
