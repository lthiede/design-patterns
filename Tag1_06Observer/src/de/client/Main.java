package de.client;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main {

	private final Metzger metzger = new Metzger();
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		Schwein piggy = new Schwein("Miss Piggy");
//		piggy.addPigTooFatListener(new PigTooFatListener() {
//			
//			@Override
//			public void pigTooFat(Schwein schwein) {
//				metzger.schlachten(schwein);
//				
//			}
//		});
		
		piggy.addPigTooFatListener(e->metzger.schlachten(e));

		
		for (int i = 0; i < 12; i++) {
			piggy.fressen();
		}

		
	}

	
//	class SchweineMetzgerAdapter implements PigTooFatListener {
//
//		@Override
//		public void pigTooFat(Schwein schwein) {
//			metzger.schlachten(schwein);
//			
//		}
//		
//	}

	class Metzger {

	
		public void schlachten(Object tier) {
			System.out.println("Messer Wetz!");
		}
		
	}

}
