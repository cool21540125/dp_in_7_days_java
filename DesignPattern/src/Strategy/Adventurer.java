package Strategy;

public class Adventurer {
	FightStrategy fightStrategy;

	public void attack() {
		if (fightStrategy == null) {
			fightStrategy = new NormalAttack();
		}
		fightStrategy.execute();
    }

    public void chooseStrategy(FightStrategy strategy) {
        this.fightStrategy = strategy;
    }
}
