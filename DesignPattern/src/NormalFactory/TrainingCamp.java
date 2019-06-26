package NormalFactory;

public interface TrainingCamp {
	public Adventurer trainAdventurer();
}


class ArcherTrainingCamp implements TrainingCamp {
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("訓練一個弓箭手");
		return new Archer();
	}
}


class WarriorTrainingCamp implements TrainingCamp {
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("訓練一個弓箭手");
		return new Warrior();
	}
}
