package de.client;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import de.files.CharacterCounter;
import de.files.FileCopy;
import de.files.FileProcessor;
import de.files.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor();
		
		fileProcessor.addCharacterHandler(new CharacterCounter());
		fileProcessor.addCharacterHandler(new LineCounter());
		fileProcessor.addCharacterHandler(new FileCopy());
		fileProcessor.run("CBS.log");
		
		
		List<String> strings = Arrays.asList("eins","zwei","drei");
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		Iterator<String> it = strings.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
