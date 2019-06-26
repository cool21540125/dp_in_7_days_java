package AbstractFactory;

// ��������
public abstract class Clothes {
	protected int def;	// ��
	
	public void display() {
		System.out.println(this.getClass().getSimpleName() +
				" def = " + def);
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
}


class Armor extends Clothes {
	
}


class Leather extends Clothes {
	
}


