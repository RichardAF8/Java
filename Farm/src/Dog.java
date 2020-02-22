
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		setType("Dog");
	}

	public String speak() {
		String speech = "";
		for (int x = 0; x < (((getHungerLevel() / 2) + 1) * 2); x++) {
			if (getSleep() == false) {
				speech += "woof ";
			} else {
				speech += "Snore ";
			}
		}
		return speech;
	}
}
