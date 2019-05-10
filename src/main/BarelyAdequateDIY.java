package main;

import view.BarelyAdequateFrame;

public class BarelyAdequateDIY {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				BarelyAdequateFrame mainFrame = new BarelyAdequateFrame();
			}
		};
		task.run();
	}
}
