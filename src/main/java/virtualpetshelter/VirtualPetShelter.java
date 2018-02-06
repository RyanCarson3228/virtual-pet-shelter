package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);
	}

	public void removePet(VirtualPet virtualPet) {
		pets.remove(virtualPet.getName());

	}

	public int listSize() {
		return pets.size();
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public int getPetThirst(String name) {
		return pets.get(name).getThirst();
	}

	public int getPetHunger(String name) {
		return pets.get(name).getHunger();
	}

	public int getPetBoredom(String name) {
		return pets.get(name).getBoredom();
	}

	

}
