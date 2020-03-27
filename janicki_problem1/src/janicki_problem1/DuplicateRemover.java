package janicki_problem1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class DuplicateRemover {
	public Set<String> uniqueWords = new HashSet<String>();


	
	
	



public  Set<String> remove(String dataFile) {
	
	//instance variable of unique words
	
	

	//handles file 
	File file = new File(dataFile);
	
	try(Scanner scanner = new Scanner(file)) {
			while(scanner.hasNext()) {
					uniqueWords.add(scanner.next().toLowerCase());			
				
			}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
		return uniqueWords;
	
}


public void write(String outputFile) {
	
	PrintWriter out;
	try {
		out = new PrintWriter(outputFile);
		out.print(uniqueWords);
		out.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
}

Set<String> SetUniqueWords(){
	
	return uniqueWords;
	
	
}



}