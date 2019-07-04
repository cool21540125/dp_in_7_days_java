package Adapter;

public interface Archer {
	void shot();	// 射擊
}


// 一般的弓箭手, 會做正統弓箭手會做的 射擊動作
class NormalArcher implements Archer {
    @Override
    public void shot() {
        System.out.println("射箭");
    }
}


