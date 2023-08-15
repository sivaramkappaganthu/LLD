import java.util.List;

public class VendingMachine {

    public static volatile VendingMachine vendingmachine = null;

    List<Rack> rackList;


    private State vendingMachineState;

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Product dispenseProduct(Rack rack) {
        return null;
    }

    public void pressButton(Rack rack) {
        this.vendingMachineState.pressButton(rack);
    }

    public void insertMoney(Double money) {
        this.vendingMachineState.insertMoney(money);
    }

    public void issueChange(Product product, Double money) {
        this.vendingMachineState.issueChange(product, money);
    }

    public void dispenseProduct(Product product) {
        this.vendingMachineState.dispenseProduct(product);
    }

    public void updateInventory(Product product) {
        this.vendingMachineState.updateInventory(product);
    }

}
