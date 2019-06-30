package Decorator;

public abstract class Title implements Adventurer {
	
	protected Adventurer adventurer;
	
	public Title(Adventurer adventurer) {
		this.adventurer = adventurer;
	}

	@Override
	public void attack() {
		this.adventurer.attack();
	}
}

class TitleStrong extends Title {

	public TitleStrong(Adventurer adventurer) {
		super(adventurer);
	}
	
	@Override
	public void attack() {
		System.out.println("用力打 ");
		super.attack();
	}
}


class TitleAgile extends Title {

	public TitleAgile(Adventurer adventurer) {
		super(adventurer);
	}
	
	@Override
	public void attack() {
		System.out.println("快速打 ");
		super.attack();
	}
	
	public void useFlash() {
		System.out.println("超音速移動");
	}
}

class TitleInFire extends Title {

	public TitleInFire(Adventurer adventurer) {
		super(adventurer);
	}
	
	@Override
	public void attack() {
		System.out.println("火焰魔法 ");
		super.attack();
	}
	
	public void fireball() {
		System.out.println("火球~");
	}
}