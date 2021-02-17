package de.flyweight;

public class Client {

	public static void main(String[] args) {
		AttributedCharacter fettesA = AttributedCharacter.getInstance('A', true);
		
		AttributedCharacter fettesb = AttributedCharacter.getInstance('B', true);
		
		
		System.out.println(fettesA == fettesb);
		
		AttributedCharacter einAnderesFettesB = AttributedCharacter.getInstance('B', true);
		
		System.out.println(fettesb == einAnderesFettesB);

	}

}
