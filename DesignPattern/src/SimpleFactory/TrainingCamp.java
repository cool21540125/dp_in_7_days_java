package SimpleFactory;

public class TrainingCamp {
	public static Adventurer trainAdventurer(String type) {
		switch (type) {
			case "archer" : {
				System.out.println("�V�m�@�Ӥ}�b��");
				return new Archer();
			}
			case "warrior": {
				System.out.println("�V�m�@�Ӱ��h");
				return new Warrior();
			}
			default: return null;
		}
	}
}
