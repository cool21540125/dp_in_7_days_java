package NormalFactory;

import AbstractFactory.Clothes;
import AbstractFactory.Weapon;

// 弓箭手 (冒險者)
public class Archer implements Adventurer {

	@Override
	public String getType() {
		System.out.println("我是弓箭手");
		return this.getClass().getSimpleName();
	}
}
