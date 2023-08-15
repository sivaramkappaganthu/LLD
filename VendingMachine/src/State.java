public interface State {

    public void pressButton(Rack rack);

    public void insertMoney(Double money);

    public void issueChange(Product product, Double money);

    public void dispenseProduct(Product product);

    public void updateInventory(Product product);

}
