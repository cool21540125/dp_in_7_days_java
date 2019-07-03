package Observer;

import java.util.ArrayList;
import java.util.List;

// 虛擬議題
public abstract class Subject {
    protected List<Adventurer> list = new ArrayList<>();

    public void add(Adventurer observer) {
        list.add(observer);
    }

    public void remove(Adventurer observer) {
        list.remove(observer);
    }

    // 推播
    public abstract void sendQuestions(String questions);
}


// 冒險者協會
class Association extends Subject {
    @Override
    public void sendQuestions(String questions) {
        for (Adventurer adventurer : list) {
            adventurer.getQuestions(questions);
        }
    }
}
