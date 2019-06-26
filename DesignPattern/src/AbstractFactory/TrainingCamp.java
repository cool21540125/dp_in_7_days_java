package AbstractFactory;

public interface TrainingCamp {
	public Adventurer trainAdventurer();
}


// �}�b��V�m��
class ArcherTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new ArcherEquipFactory();

	// �}�b��V�m��, �i�H�Ͳ��}�b��(�_�I��)
	@Override
	public Adventurer trainAdventurer() {
		System.out.println("�V�m�@�Ӥ}�b��");
		Archer archer = new Archer();
		
		archer.setWeapon(factory.productWeapon());
		archer.setClothes(factory.productArmor());
		return archer;
	}
}


// �C�h�V�m��
class WarriorTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new ArcherEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("�V�m�@�ӼC�h");
		Warrior warrior = new Warrior();
		
		warrior.setWeapon(factory.productWeapon());
		warrior.setClothes(factory.productArmor());
		return warrior;
	}
	
	
}