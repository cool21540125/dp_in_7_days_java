package Observer;

public abstract class Adventurer {
    protected String name;

    public Adventurer(String name) {
        this.name = name;
    }

    // 接任務
    public abstract void getQuestions(String questions);
}


class Lancer extends Adventurer {

	public Lancer(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		System.out.println(name + " 槍兵啥都不怕衝第一!");
	}
}


class Bard extends Adventurer {

	public Bard(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
        if (questions.length() > 10) {
            System.out.println(name + " 這太麻煩了... 我是懶散的遊俠");
        } else {
            System.out.println(name + " 我是街頭藝人 haha");
        }
	}
}


class Gunman extends Adventurer {

	public Gunman(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
        if (questions.length() > 10) {
            System.out.println(name + " 太容易, 不接了");
        } else {
            System.out.println(name + " 看我遠遠的結束掉她");
        }
	}
}
