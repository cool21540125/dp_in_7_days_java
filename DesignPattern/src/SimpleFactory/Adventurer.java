package SimpleFactory;


public interface Adventurer {
	String getType();
}


class Warrior implements Adventurer {
	@Override
	public String getType() {
		System.out.println("我是鬥士");
		return this.getClass().getSimpleName();
	}
}


class Archer implements Adventurer{
	@Override
	public String getType() {
		System.out.println("我是弓箭手");
		return this.getClass().getSimpleName();
	}
}