package SimpleFactory;


public interface Adventurer {
	String getType();
}


class Warrior implements Adventurer {
	@Override
	public String getType() {
		System.out.println("�ڬO���h");
		return this.getClass().getSimpleName();
	}
}


class Archer implements Adventurer{
	@Override
	public String getType() {
		System.out.println("�ڬO�}�b��");
		return this.getClass().getSimpleName();
	}
}