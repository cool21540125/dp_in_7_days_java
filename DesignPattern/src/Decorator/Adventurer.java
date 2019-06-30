package Decorator;

public interface Adventurer {
	void attack();
}


class Lancer implements Adventurer {
	
	private String name;
	
	public Lancer(String name) {
		this.name = name;
	}
	
	@Override
	public void attack() {
		System.out.println(this.name + " 長槍攻擊~");
	}
}
