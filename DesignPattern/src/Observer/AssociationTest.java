package Observer;

import org.junit.Test;

public class AssociationTest {
    @Test
    public void test() {
        System.out.println("========觀察者模式==========");

        Adventurer lancer = new Lancer("jacky");
        Adventurer lancer2 = new Lancer("Seven");
        Adventurer bard = new Bard("lee");
        Adventurer gunman = new Gunman("tony");

        Subject association = new Association();
        association.add(lancer);
        association.add(lancer2);
        association.add(bard);
        association.add(gunman);

        System.out.println("簡單任務 -------");
        association.sendQuestions("run");
        System.out.println();

        System.out.println("困難任務 -------");
        association.sendQuestions("very hard and long way to go");
        System.out.println();

        // 退出冒險者公會
        association.remove(lancer2);
        System.out.println();
        System.out.println("困難任務 -------");
        association.sendQuestions("very hard hard hard and long long long way to go");
    }
}
