package Assignment2;

public class testCode {

	public static void main(String[] args) {
		Transcript ts = new Transcript("input.txt", "transcript.txt");
		ts.printTranscript(ts.buildStudentArray());
	}

}
