package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);
	}

	public int listSize() {
		return pets.size();
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}
	
	
}
