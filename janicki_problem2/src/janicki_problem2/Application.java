package janicki_problem2;

public class Application {
	public static void main(String[] args) {
		DuplicateCounter duplicatCounter = new DuplicateCounter();
		duplicatCounter.count("problem2.txt");
		duplicatCounter.write("outputFile.txt");
		
	}

}
