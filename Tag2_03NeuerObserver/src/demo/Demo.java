package demo;

import de.beans.Person;
import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		Person p = new Person();
		p.addPropertyChangedListener(new Maske());
		
		p.setVorname("Jane");
		p.setNachname("Wayne");
		
		
	}
	
	class Maske implements PropertyChangedListener {

		@Override
		public void propertyChanged(PropertyChangedEvent event) {
			System.out.println(event);
			
		}
		
	}

}
