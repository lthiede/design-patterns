package de.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {
	
	
	private static List<AttributedCharacter> characters = new ArrayList<>();
	
	private final char c;
	private final boolean bold;
	
	public static AttributedCharacter getInstance(char c, boolean bold) {
		for (AttributedCharacter attributedCharacter : characters) {
			if(attributedCharacter.c == c && attributedCharacter.bold == bold)
				return attributedCharacter;
		}
		
		return new AttributedCharacter(c, bold);
	}
	
	
	private AttributedCharacter(char c, boolean bold) {
		this.c = c;
		this.bold = bold;
		characters.add(this);
	}


	public char getC() {
		return c;
	}


	public boolean isBold() {
		return bold;
	}
	
	
	

}
