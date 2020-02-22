
public class Cow extends Animal {

	public Cow(String name) {
		super(name);
		setType("Cow");
	}

	public String speak() {
		String speech = "";
		for (int x = 0; x < ((getHungerLevel() + 1) * 2); x++) {
			if (getSleep() == false) {
				speech += "moo ";
			} else {
				speech += "Snore ";
			}
		}
		return speech;
	}

}
