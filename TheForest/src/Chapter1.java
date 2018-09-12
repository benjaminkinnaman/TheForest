//This is a text-based adventure game developed by Benjamin Kinnaman.
//Here is the initial Chapter in the story, which explains to the user how to play the game.
//Initial build: 9/11/2018
//Current Build:9/11/2018

import java.util.Scanner;

public class Chapter1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the forest.\n");
		Thread.sleep(3000);
		System.out.println("This is a text-based adventure game, where you type your choice of actions, dictating which ending you get.\n");
		Thread.sleep(5000);
		System.out.println("Typing a choice incorrectly will cause the game to instantly end.\nType \"1\" in the console and press enter to begin.");
		int choice = input.nextInt();
		if (choice == 1){
			System.out.println("\n\nYou wake up, surrounded by trees, the night sky a blackish-blue blanket with stars sprinkled across it.");
		}
		
		System.out.println("\n\nGame over.");
	}

	
}
