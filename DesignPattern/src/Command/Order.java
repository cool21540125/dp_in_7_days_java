package Command;

public abstract class Order {
    protected KitchenWorker receiver;   // 廚房工作者
    protected String name;              // 訂單名稱

    public Order(KitchenWorker receiver) {
        this.receiver = receiver;
    }

    public void sendOrder() {
        receiver.finishOrder();
    }

    public String getName() {
        return this.name;
    }
}


class DrinkOrder extends Order {
    public DrinkOrder(KitchenWorker receiver) {
        super(receiver);
        super.name = "大奶薇薇";
    }
}


class SnackOrder extends Order {
    public SnackOrder(KitchenWorker receiver) {
        super(receiver);
        super.name = "冰火波蘿油";
    }
}
