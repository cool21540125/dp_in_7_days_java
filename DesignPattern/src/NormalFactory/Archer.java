package NormalFactory;

import AbstractFactory.Clothes;
import AbstractFactory.Weapon;

// �}�b�� (�_�I��)
public class Archer implements Adventurer {

	@Override
	public String getType() {
		System.out.println("�ڬO�}�b��");
		return this.getClass().getSimpleName();
	}
}
