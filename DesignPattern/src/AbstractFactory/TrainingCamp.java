package AbstractFactory;

public interface TrainingCamp {
	public Adventurer trainAdventurer();
}


// 弓箭手訓練營
class ArcherTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new ArcherEquipFactory();

	// 弓箭手訓練營, 可以生產弓箭手(冒險者)
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("訓練一個弓箭手");
		Archer archer = new Archer();
		
		archer.setWeapon(factory.productWeapon());
		archer.setClothes(factory.productArmor());
		return archer;
	}
}


// 劍士訓練營
class WarriorTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new ArcherEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("訓練一個劍士");
		Warrior warrior = new Warrior();
		
		warrior.setWeapon(factory.productWeapon());
		warrior.setClothes(factory.productArmor());
		return warrior;
	}
	
	
}