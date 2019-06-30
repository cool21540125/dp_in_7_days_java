package Decorator;

import org.junit.Test;

public class TitleTest {
	@Test
	public void test() {
		System.out.println("======= 裝飾者模式 ========");

		Adventurer lancer = new Lancer("Tony");
		System.out.println("--- 強壯的 Tony ---");
		Title sTony = new TitleStrong(lancer);
		sTony.attack();

        System.out.println();
        System.out.println("--- 敏捷的 Tony ----");
        TitleAgile aTony = new TitleAgile(sTony);
        aTony.attack();
        aTony.useFlash();

        System.out.println();
        System.out.println("--- 會燃燒的 Tony ---");
        TitleInFire fTony = new TitleInFire(sTony);
        fTony.attack();
        fTony.fireball();

        System.out.println(" --- 什麼都有但又更猛的 Tony ---");
        TitleStrong ffTony = new TitleStrong(fTony);
        ffTony.attack();
	}
}
