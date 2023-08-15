import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Member extends Account{


    double fundsAvailable;

    List<StockPosition> heldStocks;

    Date membershipDate;
    HashMap<Integer,Order> activeOrders;


    public ErrorCode placeSellLimitOrder(Stock stock, int quantity, double limitPrice, TimeEnforcementType enforcementType){
        return new ErrorCode();
    }

    public ErrorCode placeBuyLimitOrder(Stock stock, int quantity, double limitPrice, TimeEnforcementType enforcementType){
        return new ErrorCode();
    }

    public void callBackStockExchange(int orderId, OrderStatus orderStatus){

    }

}
