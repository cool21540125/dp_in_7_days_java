package NormalFactory;

public class Warrior implements Adventurer {
	@Override
	public String getType() {
		System.out.println("�ڬO���h");
		return this.getClass().getSimpleName();
	}
}
