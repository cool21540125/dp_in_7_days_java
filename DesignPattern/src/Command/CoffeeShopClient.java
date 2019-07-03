package Command;

public class CoffeeShopClient {
    public static void main(String[] args) {
        System.out.println("=====命令模式======");

        Chef tony = new Chef();
        Barkeep tiff = new Barkeep();
        Order snack = new SnackOrder(tony);
        Order drink = new DrinkOrder(tiff);
        Invoker fei = new Invoker();

        // 開始營業
        System.out.println("---客人點餐---");
        fei.setOrder(snack);
        fei.setOrder(snack);
        fei.setOrder(drink);
        fei.setOrder(drink);

        // 飲料沒了
        fei.setOrder(drink);

        // 取消點心訂單
        System.out.println("取消點心");
        fei.cancelOrder(snack);

        //
        fei.setOrder(snack);
        fei.setOrder(snack);
        fei.setOrder(snack);

        // Message Queue 送工作
        fei.notifyBaker();
    }
}
