package pattern.client;

import pattern.state.Ampel;

public class Client {

	public static void main(String[] args) {
		Ampel ampel = new Ampel();

		// Aufgabe 1
		System.out.println(ampel.getActualColor()); // start color is red
		ampel.nextColor();
		System.out.println(ampel.getActualColor()); // color is green
		ampel.nextColor();
		System.out.println(ampel.getActualColor()); // color is red

		// Aufgabe 2
		ampel.switchOff();
		ampel.switchOn(); // color after switchOn is red
		System.out.println(ampel.getActualColor());

	}
}
