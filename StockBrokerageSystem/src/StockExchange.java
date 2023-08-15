public class StockExchange {
    private static volatile StockExchange instance = null;

    private StockExchange() {}

    public static StockExchange getInstance()
    {
        if(instance == null) {
            synchronized (StockExchange.class) {
                if(instance == null) {
                    instance = new StockExchange();
                }
                return instance;
            }
        }
        return instance;
    }

    public boolean placeOrder(Order order) {
        return false;
    }

}
