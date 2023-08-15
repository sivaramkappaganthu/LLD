public class NoMoneyInsertedState implements State{
    @Override
    public void pressButton(Rack rack) {

    }

    @Override
    public void insertMoney(Double money) {
        //change the state to MONEY INSERTED STATE
    }

    @Override
    public void issueChange(Product product, Double money) {

    }

    @Override
    public void dispenseProduct(Product product) {

    }

    @Override
    public void updateInventory(Product product) {

    }
}
