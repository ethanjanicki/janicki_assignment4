package janicki_problem2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class DuplicateCounter {
	public Map<String,Integer>wordCounter = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		DuplicateCounter test = new DuplicateCounter();
		test.count("problem2.txt");
		test.write("outputFile.txt");
		
	}


public void count(String dataFile) {
	
	
	File file = new File(dataFile);
	
	try(Scanner scanner = new Scanner(file)) {
			while(scanner.hasNext()) {
				String tmp = scanner.next().toLowerCase();
				
				if(wordCounter.get(tmp)!= null ||wordCounter.containsKey(tmp) ){
					int i = wordCounter.get(tmp);
					wordCounter.get(tmp);
					wordCounter.put(tmp,i+1);
					
				}else {
					wordCounter.put(tmp,1);
				}
						
				
					
				
			}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void write(String outputFile) {
	PrintWriter out;
	try {
		out = new PrintWriter(outputFile);
		out.print(wordCounter);
		out.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
}
}

