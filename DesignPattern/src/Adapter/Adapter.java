package Adapter;

// 某種轉職後的職業, 會作法師做的事情
public class Adapter implements Wizard {
    private Archer archer;

    // 轉職行業, 本身包裹著弓箭手(偽裝)
    public Adapter(Archer archer) {
        this.archer = archer;
    }

    // 他不是正統法師, 但因為實作法師介面, 所以也會做類似 丟火球的動作
    @Override
    public void fireBall() {
        System.out.println("弓箭偽裝成火球");
        archer.shot();
        System.out.println("火球~~");
    }
}
