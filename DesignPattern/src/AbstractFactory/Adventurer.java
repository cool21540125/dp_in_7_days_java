package AbstractFactory;


// 概念冒險者
public abstract class Adventurer {
	protected Weapon weapon;
	protected Clothes clothes;
	
	public abstract void display();
	
	public abstract void setWeapon(Weapon weapon);
	public abstract void setClothes(Clothes clothes);
}

// 弓箭手 (冒險者)
class Archer extends Adventurer {
	@Override
	public void display() {
		System.out.println("我是弓箭手, 裝備: ");
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

// 劍士 (冒險者)
class Warrior extends Adventurer {
	@Override
	public void display() {
		System.out.println("我是劍士, 裝備: ");
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

