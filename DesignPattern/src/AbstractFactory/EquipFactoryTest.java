package AbstractFactory;

import org.junit.Test;

import junit.framework.Assert;

public class EquipFactoryTest {
	private EquipFactory equipFactory;
	
	@Test
	public void equipFactoryTest() {
		System.out.println("=======��H�u�t�Ҧ�===========");
		
		// �Ͳ��}�b��˳�
		equipFactory = new ArcherEquipFactory();
		Clothes archerLeather = equipFactory.productArmor();
		Weapon archerBow = equipFactory.productWeapon();
		
		// �}�b��˳��ݩ�
		Assert.assertEquals(1, archerLeather.getDef());
		Assert.assertEquals(10,  archerBow.getAtk());
		Assert.assertEquals(10, archerBow.getRange());
		
		// �C�h�˳�
		equipFactory = new WarriorEquipFactory();
		Clothes armor = equipFactory.productArmor();
		Weapon longSword = equipFactory.productWeapon();
		
		// �C�h�˳��ݩ�
		Assert.assertEquals(10, armor.getDef());
		Assert.assertEquals(10,  longSword.getAtk());
		Assert.assertEquals(1, longSword.getRange());
		
		// �}�b��V�m��
		TrainingCamp camp = new ArcherTrainingCamp();
		Adventurer archer = camp.trainAdventurer();
		
		// �V�m���h
		camp = new WarriorTrainingCamp();
		Adventurer warrior = camp.trainAdventurer();
		
		archer.display();
		warrior.display();
	}
}
