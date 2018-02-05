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
	public void shouldReomveAPet() {
		underTest.addPet(new VirtualPet("Harry", "Description"));
		underTest.addPet(new VirtualPet("Joe", "Description"));
		underTest.removePet(new VirtualPet("Harry", "Description"));
		int check = underTest.listSize();
		assertEquals(1, check);
	}
	
	@Test
	public void nameShouldGetIndividualInfo() {
		VirtualPet expected = new VirtualPet("Harry", "Description");
		underTest.addPet(expected);
		VirtualPet check = underTest.getPet("Harry");
		assertEquals(expected, check);
	}
	
	@Test
	public void shouldFeedAllPets() {
		
	}
	
	
	
}
