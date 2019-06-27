package Strategy;
import org.junit.Test;

public class FightTest {

	@Test
	public void test() {
        Adventurer ad = new Adventurer();

        System.out.println("=====史萊姆=====");

        ad.chooseStrategy(new NormalAttack());
        ad.attack();

        System.out.println("=====大隻史萊姆=====");
        ad.chooseStrategy(new UseSkill());
        ad.attack();

        System.out.println("=====殭屍=====");
        ad.chooseStrategy(new UseItem());
        ad.attack();
	}
}
