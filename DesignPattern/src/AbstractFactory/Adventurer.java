package AbstractFactory;


// �����_�I��
public abstract class Adventurer {
	protected Weapon weapon;
	protected Clothes clothes;
	
	public abstract void display();
	
	public abstract void setWeapon(Weapon weapon);
	public abstract void setClothes(Clothes clothes);
}

// �}�b�� (�_�I��)
class Archer extends Adventurer {
	@Override
	public void display() {
		System.out.println("�ڬO�}�b��, �˳�: ");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}

	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}
}

// �C�h (�_�I��)
class Warrior extends Adventurer {
	@Override
	public void display() {
		System.out.println("�ڬO�C�h, �˳�: ");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}

	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}
}

