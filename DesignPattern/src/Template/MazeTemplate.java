package Template;

public abstract class MazeTemplate {
    protected int difficulty;
    protected Adventurer adventurer;
    protected boolean isDoubleMaze = false;

    private boolean isAdventurerLevelEnough(int level) {
        if (level >= difficulty) {
            return true;
        }

        return false;
    }

    // 進入迷宮的冒險者
    public Adventurer adventure(Adventurer adventurer) {
        this.adventurer = adventurer;

        if (isAdventurerLevelEnough(adventurer.getLevel())) {
            System.out.println("=== 等級OK, 歡迎挑戰迷宮 ===");
            createMaze();
            start();

            if (isDoubleMaze) {
                hiddenMaze();
            }
            showResult();
        } else {
            System.out.println("等級不夠, 滾~");
        }
        return this.adventurer;
    }

    abstract void createMaze();

    abstract void start();

    void hiddenMaze() {
        System.out.println("迷宮關閉");
    }

    // 結束迷宮探險之後, 增加經驗值
    Adventurer showResult() {
        this.adventurer.setLevel(adventurer.getLevel() + 5 * difficulty);
        System.out.println("得到經驗值");
        return this.adventurer;
    }
}


class EasyMaze extends MazeTemplate {
    public EasyMaze() {
        super.difficulty = 1;
    }

    @Override
    void createMaze() {
        System.out.println("很簡單的迷宮產生了");
        System.out.println("產生 1 個史萊姆");
        System.out.println("產生 10 隻小熊維尼");
        System.out.println("產生 50 隻韓國來的魚");
    }

    @Override
    void start() {
        System.out.println("冒險者避著眼睛不帶武器進入迷宮");
    }
}


class DifficultMaze extends MazeTemplate {
    public DifficultMaze() {
        super.difficulty = 10;
    }

    @Override
    void createMaze() {
        System.out.println("困難的迷宮產生了");
        System.out.println("產生 1 個兵長 - 里維·阿卡曼");
        System.out.println("產生 10 隻暗黑破壞神");
    }

    @Override
    void start() {
        System.out.println("冒險者非常小心地進入迷宮");
    }
}