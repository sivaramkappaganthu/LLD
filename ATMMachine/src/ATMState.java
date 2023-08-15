public abstract class ATMState {

    abstract void insertCard();
    abstract void authenticatePin();
    abstract void selectOperation();
    abstract void dispenseCash();
    abstract void returnCard();
    abstract void cashWithdrawl();
    abstract void transferMoney();
}
