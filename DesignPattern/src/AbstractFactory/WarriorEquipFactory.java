package AbstractFactory;

// 武器工廠(劍士用)
public class WarriorEquipFactory implements EquipFactory {

	@Override
	public Weapon productWeapon() {
		LongSword product = new LongSword();
		product.setAtk(10);
		product.setRange(1);
		return product;
	}

	@Override
	public Clothes productArmor() {
		Armor product = new Armor();
		product.setDef(10);
		return product;
	}
}
