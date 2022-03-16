package com.bridgelabz.workshop;

public class Main {

	public static void main(String[] args) {
		CharacterThread charecterThread = new CharacterThread();
		NumberRunnable numberRunnable = new NumberRunnable();
		Thread numberThread = new Thread(numberRunnable);
		numberThread.setDaemon(true);

		charecterThread.start();
		numberThread.start();
		System.out.println("Goodbye from main Function");
	}
}
