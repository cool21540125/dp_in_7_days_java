package Template;

import org.junit.Test;

public class MazeTest {
    Adventurer a1 = new Adventurer();
    Adventurer a2 = new Adventurer();

    MazeTemplate easy = new EasyMaze();
    MazeTemplate hard = new DifficultMaze();

    @Test
    public void test() {
        a1.setLevel(30);
        a2.setLevel(5);

        System.out.println("----- 樣板模式 -----");

        System.out.println("困難迷宮11");
        a1 = hard.adventure(a1);    // 進入 困難迷宮 的 老手
        System.out.println("簡單迷宮22");
        a2 = easy.adventure(a2);    // 進入 初階迷宮 的 新手

        System.out.println("----- 訓練過後 -----");
        System.out.println("困難迷宮11");
        a1 = hard.adventure(a1);    // 進入 困難迷宮 的 老手
        System.out.println("困難迷宮22");
        a2 = hard.adventure(a2);    // 進入 困難迷宮 的 新老手
    }


}
