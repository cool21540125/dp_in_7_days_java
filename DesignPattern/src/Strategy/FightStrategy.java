package Strategy;

public interface FightStrategy {
	void execute();
}


class NormalAttack implements FightStrategy {
	@Override
	public void execute() {
		System.out.println("一般攻擊");
	}
}

class UseSkill implements FightStrategy {
	@Override
	public void execute() {
		System.out.println("技能攻擊");

	}
}


class UseItem implements FightStrategy {
	@Override
	public void execute() {
		System.out.println("放火");
	}
}

