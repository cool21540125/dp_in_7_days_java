package Command;

public interface KitchenWorker {
    void finishOrder();
}


class Barkeep implements KitchenWorker {
    @Override
    public void finishOrder() {
        System.out.println("拿杯子 -> 加冰塊 -> 倒飲料 -> 發貨");
        System.out.println();
    }
}


class Chef implements KitchenWorker {
    @Override
    public void finishOrder() {
        System.out.println("麵包塗奶油 -> 烤烤烤 -> 發貨");
        System.out.println();
    }
}
