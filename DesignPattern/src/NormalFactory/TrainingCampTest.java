package NormalFactory;

import org.junit.Test;

import junit.framework.Assert;

public class TrainingCampTest {
	@Test
	public void Test() {
		System.out.println("=====�u�t�Ҧ�����=====");
		
		TrainingCamp trainingCamp = new ArcherTrainingCamp();
		Adventurer memberA = trainingCamp.trainAdventurer();
		
		trainingCamp = new WarriorTrainingCamp();
		Adventurer memberB = trainingCamp.trainAdventurer();
		
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");
	}
}
