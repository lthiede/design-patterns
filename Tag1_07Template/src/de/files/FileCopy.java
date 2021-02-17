package de.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements CharacterHandler {
	
	FileWriter out;

	@Override
	public void init() {
		try {
			out = new FileWriter("Ausgabe.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void process(char c) {
		try {
			out.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void dispose() {
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
