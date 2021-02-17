package de.files;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class FileProcessor {
	
	
	private List<CharacterHandler> handlers = new ArrayList<>();
	
		
	public boolean addCharacterHandler(CharacterHandler characterHandler) {
		return handlers.add(characterHandler);
	}

	public boolean removeCharacterHandler(CharacterHandler characterHandler) {
		return handlers.remove(characterHandler);
	}

	private static final int EOF = -1;

	public final void run(String filename) {
		
		try (FileReader reader = new FileReader(filename)) {
			
			init();
			
			int zeichen;
			
			while((zeichen = reader.read()) != EOF) {
				process((char) zeichen);
			}
			
			
			dispose();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	
	private void init() {
		for (CharacterHandler handler : handlers) {
			handler.init();
		}
	}

	private void process(char c) {
		for (CharacterHandler handler : handlers) {
			handler.process(c);
		}
	}
	
	private void dispose() {
		for (CharacterHandler handler : handlers) {
			handler.dispose();
		}
	}
	
}
