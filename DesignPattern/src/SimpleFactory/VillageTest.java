package SimpleFactory;

import org.junit.Test;

import junit.framework.Assert;

public class VillageTest {
	@Test
	public void test() {
		// �s����V�m�_�I��
		Adventurer memberA = TrainingCamp.trainAdventurer("archer");
		Adventurer memberB = TrainingCamp.trainAdventurer("warrior");
		// UnitTest
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");
	}
}
