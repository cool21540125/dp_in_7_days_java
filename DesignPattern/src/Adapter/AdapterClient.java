package Adapter;

import org.junit.Test;

public class AdapterClient {

    @Test
    public void test() {
        System.out.println("====轉接器====");
        System.out.println("需要火球 轟炸獨裁政府");
        System.out.println("把弓箭手偽裝成法師吧");
        Adapter wizard = new Adapter(new NormalArcher());
        wizard.fireBall();
    }
}
