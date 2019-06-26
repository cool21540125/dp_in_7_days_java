package NormalFactory;

public interface TrainingCamp {
	public Adventurer trainAdventurer();
}


class ArcherTrainingCamp implements TrainingCamp {
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("�V�m�@�Ӥ}�b��");
		return new Archer();
	}
}


class WarriorTrainingCamp implements TrainingCamp {
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("�V�m�@�Ӥ}�b��");
		return new Warrior();
	}
}
