package AbstractFactory;

// 虛擬工廠
public interface EquipFactory {
	
	// 生產武器
	Weapon productWeapon();
	
	// 生產防具
	Clothes productArmor();
}
