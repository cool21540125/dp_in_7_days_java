package AbstractFactory;

import org.junit.Test;

import junit.framework.Assert;

public class EquipFactoryTest {
	private EquipFactory equipFactory;
	
	@Test
	public void equipFactoryTest() {
		System.out.println("=======抽象工廠模式===========");
		
		// 生產弓箭手裝備
		equipFactory = new ArcherEquipFactory();
		Clothes archerLeather = equipFactory.productArmor();
		Weapon archerBow = equipFactory.productWeapon();
		
		// 弓箭手裝備屬性
		Assert.assertEquals(1, archerLeather.getDef());
		Assert.assertEquals(10,  archerBow.getAtk());
		Assert.assertEquals(10, archerBow.getRange());
		
		// 劍士裝備
		equipFactory = new WarriorEquipFactory();
		Clothes armor = equipFactory.productArmor();
		Weapon longSword = equipFactory.productWeapon();
		
		// 劍士裝備屬性
		Assert.assertEquals(10, armor.getDef());
		Assert.assertEquals(10,  longSword.getAtk());
		Assert.assertEquals(1, longSword.getRange());
		
		// 弓箭手訓練營
		TrainingCamp camp = new ArcherTrainingCamp();
		Adventurer archer = camp.trainAdventurer();
		
		// 訓練鬥士
		camp = new WarriorTrainingCamp();
		Adventurer warrior = camp.trainAdventurer();
		
		archer.display();
		warrior.display();
	}
}
