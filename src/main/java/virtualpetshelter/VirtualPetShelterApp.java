package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		System.out.println("Welcome to your Pet Shelter!");
		System.out.println("It's our job to take care of stray pets until we can find them new homes!");
		System.out.println("Lets start by adding our first pet.");
		System.out.println("Since it's a stray, we'll have to give it a new name:");
		String name = input.nextLine();
		System.out.println("And let's give it a brief description for potential adopters:");
		String description = input.nextLine();
		shelter.addPet(new VirtualPet(name, description));
		
		System.out.println("If at any time you would like to quit, just type \"quit.\"");
		
		
	}

}
