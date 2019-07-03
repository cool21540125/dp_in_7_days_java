package Command;

import java.util.ArrayList;
import java.util.List;

// 調用的服務生
public class Invoker {
    private int snackQty = 2;   // 飲料材料數
    private int drinkQty = 4;   // 點心材料數
    private List<Order> orderList = new ArrayList<>();

    // 增加訂單
    public void setOrder(Order order) {
        if (order.name.equals("大奶薇薇")) {
            if (drinkQty <= 0) {
                System.out.println("飲料沒了");
            } else {
                System.out.println("訂一杯, 剩 " + (--drinkQty));
                orderList.add(order);
            }
        } else if (order.name.equals("冰火波蘿油")) {
            if (snackQty <= 0) {
                System.out.println("點心沒了");
            } else {
                System.out.println("訂一顆 剩 " + (--snackQty));
                snackQty--;
                orderList.add(order);
            }
        }
    }

    // 取消訂單
    public void cancelOrder(Order order) {
        if (order.name.equals("大奶薇薇")) {
            System.out.println("取消一杯 剩 " + (++drinkQty));
            drinkQty++;
        } else if (order.name.equals("冰火波蘿油")) {
            System.out.println("取消一顆 剩 " + (++snackQty));
            snackQty++;
        }
    }

    // 送訂單
    public void notifyBaker() {
        for (Order order : orderList) {
            order.sendOrder();
        }
        orderList.clear();
    }
}
