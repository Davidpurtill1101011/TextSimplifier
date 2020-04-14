package gmit;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Parser {
	Map<String,String> map = new HashMap<String,String>();
	//Map<String,String> google = new TreeMap<String,String>();
	
	
	Path Google = Paths.get("./google-1000.txt");
	Path Moby = Paths.get("./MobyThesaurus2.txt");
	String[] word;
	String wordReplace;
	int i;
	// Parser Constructor 
	public void parseGoogle(String file) throws IOException{
		
		BufferedReader Google = Files.newBufferedReader(this.Google);
	      String line = null;     
	      
	      while ((line = Google.readLine()) != null){
	    	 String[] words = line.split(" ");
	         String key = words[0];;
	         String value = words[0];
	         
	         map.put(key, value);
	      }
	      Google.close();
	   
	}// end of 
	
	public void parse(String file) throws Exception{
		
		BufferedReader Moby = Files.newBufferedReader(this.Moby);
		
		String line;
		
		//while loop for checking to see if the line if full or empty
		while((line = Moby.readLine()) != null) {
			
			// splitting the words when the "," is hit
			String[]words = line.split(",");
			// get the total number of words on the line and 
			// random will be from 1- (total-1)
			int end = words.length - 1;
			int start = 1;
			// creating a new random method to set the index
			// to get a different word every time 
			Random rand = new Random();
			int index = rand.nextInt((end-start)+1) + start;
			// filling the map with the words
			map.put(words[0], words[index]);
		}// end of Outer while statement
		// closing the file
		Moby.close();
	}// end of parseIn method
	
	// getter and setter for the map
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}// end of parser class

