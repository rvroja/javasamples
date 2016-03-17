package com.csrk.apps;

import com.csrk.beings.Animal;
import com.csrk.beings.Cat;
import com.csrk.beings.Dog;
import com.csrk.beings.Elephant;
import com.csrk.beings.Pet;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal aAnimal = new Dog();
		
		aAnimal.print();
		aAnimal.says();
		
		aAnimal = new Cat();
		
		aAnimal.print();
		aAnimal.says();
		
		aAnimal = new Elephant();
		
		aAnimal.print();
		aAnimal.says();
		
		Pet aPet = new Dog();
		
		aPet.tamable();
		
		aPet = new Cat();
		
		aPet.tamable();
		
		
	}
}
