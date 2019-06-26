package AbstractFactory;

// µêÀÀªZ¾¹
public abstract class Weapon {
	protected int atk;		// §ğÀ»¤O
	protected int range;	// §ğÀ»½d³ò
	
	public void display() {
		System.out.println(this.getClass().getSimpleName() + 
				" atk = " + atk + " , range = " + range);
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getRange() {
		return this.range;
	}
}


class LongSword extends Weapon {
	
}


class Bow extends Weapon {
	
}

