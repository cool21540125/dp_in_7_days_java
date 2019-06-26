package NormalFactory;

public class Warrior implements Adventurer {
	@Override
	public String getType() {
		System.out.println("§Ú¬O°«¤h");
		return this.getClass().getSimpleName();
	}
}
