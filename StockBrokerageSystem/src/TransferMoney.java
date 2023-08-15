public abstract class TransferMoney {

    long transactionId;

    String fromAccount;
    String toAccount;
    double amount;

    public abstract void initiateTransaction();
}
