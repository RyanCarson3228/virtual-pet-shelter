package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	
	private VirtualPetShelter underTest;
	
	@Before
	public void setup() {
	underTest = new VirtualPetShelter();
	}
	
	@Test
	public void assertPetAddition() {
		underTest.addPet(new VirtualPet("Harry", "Description"));
		int check = underTest.listSize();
		
		assertEquals(1, check);
	}
	
	@Test
	public void assertASecondPet() {
		underTest.addPet(new VirtualPet("Harry", "Description"));
		underTest.addPet(new VirtualPet("Joe", "Description"));
		int check = underTest.listSize();
		
		assertEquals(2, check);
	}
	@Test 
	public void shouldRemovePet() {
		underTest.addPet(new VirtualPet("Harry", "Description"));
		underTest.addPet(new VirtualPet("Joe", "Description"));
		underTest.removePet(new VirtualPet("Harry", "Description"));
		int check = underTest.listSize();
		assertEquals(1, check);
	}
	
	@Test
	public void nameShouldGetPet() {
		VirtualPet expected = new VirtualPet("Harry", "Description");
		underTest.addPet(expected);
		VirtualPet check = underTest.getPet("Harry");
		assertEquals(expected, check);
	}
	
	@Test
	public void shouldPullThirstFromRightAnimal() {
		underTest.addPet(new VirtualPet("Harry", "Description", 25, 0, 0));
		underTest.addPet(new VirtualPet("Joe", "Description", 20, 0, 0));
		int check = underTest.getPetThirst("Harry");
		assertEquals(25, check);
	}
	@Test
	public void shouldPullHungerFromRightAnimal() {
		underTest.addPet(new VirtualPet("Harry", "Description", 0, 25, 0));
		underTest.addPet(new VirtualPet("Joe", "Description", 0, 20, 0));
		int check = underTest.getPetHunger("Joe");
		assertEquals(20, check);
	}
	@Test
	public void shouldPullBoredomFromRightAnimal() {
		underTest.addPet(new VirtualPet("Harry", "Description", 0, 0, 25));
		underTest.addPet(new VirtualPet("Joe", "Description", 0, 0, 20));
		int check = underTest.getPetBoredom("Joe");
		assertEquals(20, check);
	}
	
	
	
}
