package de.client;

import de.state.Fassade;

public class Client {

	public static void main(String[] args) {
		Fassade f = new Fassade();
		
		f.print();
		
		f.changeToB();
		
		f.print();
		
		f.changeToB();

	}

}
