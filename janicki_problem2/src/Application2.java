package janicki_problem2;

public class Application {
	public static void main(String[] args) {
		DuplicateCounter test = new DuplicateCounter();
		test.count("problem2.txt");
		test.write("outputFile.txt");
		
	}

}
