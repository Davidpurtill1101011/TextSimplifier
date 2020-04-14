package gmit;

import java.util.*;

public class Menu {
	// global variables
	private static Scanner scanner;
	private boolean isRunning = true;
	String readIn = ""; 
	// map to store words in the menu
	private Map<String, String> map;
	
	// Menu constructor
	public Menu(Map<String, String> map) {
		this.map = map;
		showMenu();
	}// menu constructor 

	public void showMenu() {
		// asking the user to enter some text for the program
		System.out.println(ConsoleColour.WHITE_BOLD);
		System.out.print("Please enter some text to see some magic: (type Quit/quit to exit)> ");
		scanner = new Scanner(System.in);
		readIn = scanner.nextLine();
		// while loop to see if the program is running 
		while(isRunning) {
			if(readIn.equals("Quit") || readIn.equals("quit")) {
				// this will end the loop if "quit" is entered.
				isRunning = false;
			}
			else {
				// printing the string that has been changed
				String text;
				text = getWords(readIn);
				System.out.println(text);
				System.out.println(ConsoleColour.WHITE_BOLD);
				System.out.print("Please enter some text to see some magic: (type Quit/quit to exit)> ");
				readIn = scanner.nextLine();
			}// asking for more text 
			System.out.println(ConsoleColour.RESET);
		}// end of while
	}
	private String getWords(String str) {
		
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		
		for(String word: words) {
			// if to see if the word is in the map
			if(map.containsKey(word)) {
				//get the value from the map
				String value = map.get(word);
				//append the value to the string builder
				// to make the changed string
				System.out.println(ConsoleColour.RED);
				sb.append(value + " ");
			}
			else {
				// else to just return the word
				System.out.println(ConsoleColour.BLUE);
				sb.append(word + " ");
			}
		}// end of forEach
		// returning everything in this
		//method to a String
		return sb.toString();	
	}// end of getWords method

	//get and set for the map
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	

}
