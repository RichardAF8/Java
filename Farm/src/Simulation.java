////
// Name: Richard Forrester
// Section: A
// Program Name: Simple Farm Simulation
// Description: This program is a farm simulation in which objects (representing animals) are looped in a while loop
// until their HungerLevel fields represented by an Integer are 0, which means they are full.
//The animal objects are all children of the parent class Animal and are thus stored in an ArrayList representing the farm
// During each cycle a for each loop is used to iterate over the Arraylist containing the animals 
// Information about each animal is printed to the console using their speak and overwritten toString method
// Subsequently, their feed function is called lowering their hunger level field and then the tick function increases it slightly
//the tick function is used to represent the passage of time.
////

import java.util.*;

public class Simulation {
	static int satisfiedAnimals = 0;

	public static void main(String[] args) {
		List<Animal> farm = new ArrayList<>(
				List.of(new Cow("Tom"), new Cow("Jeff"), new Dog("Fido"), new Dog("Blue"), new Chicken("Pecker"),
						new Chicken("Sam"), new Horse("Boxer"), new Horse("Ben"), new Sheep("luv"), new Sheep("Ian")));

		int farmSize = farm.size();
		int cycle = 1;

		while (satisfiedAnimals < farmSize) {
			System.out.println("FEEDING " + cycle + "\n");

			satisfiedAnimals = 0;
			cycle += 1;
			Collections.sort(farm, new Comparator<Animal>() {
				@Override
				public int compare(Animal first, Animal second) {
					return second.getHungerLevel() - first.getHungerLevel();
				}
			});

			farm.forEach((animal) -> {
				if (animal.getHungerLevel() == 0) {
					satisfiedAnimals += 1;
				} else {
					satisfiedAnimals = 0;
				}
				// "Allow each animal to speak, print it out and then feed it if it is not
				// full."
				System.out.println(animal.speak());
				System.out.println(animal);

				if (animal.getHungerLevel() != 0) {
					animal.feed();
				}
				animal.tick();
			});
			System.out.println("_ _ _ _ _ _ _ _ _ _ _\n");
		}
	}
}
