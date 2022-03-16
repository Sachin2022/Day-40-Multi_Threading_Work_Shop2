package com.bridgelabz.workshop;

public class CharacterThread extends Thread {

	NumberRunnable numberRunnable=new NumberRunnable();
  public static boolean thread;
	@Override
	public void run() {
		for ( char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
		thread=true;
		System.out.println("Goodbye from Character Thread");

	}
}