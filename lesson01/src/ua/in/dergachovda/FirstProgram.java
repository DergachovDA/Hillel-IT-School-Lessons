package ua.in.dergachovda;

public class FirstProgram {

	public static void main(String[] args) {
		System.out.println("This is a first java program");	// Print "This is a first java program"
		int i = 0; 											
		for (String param : args) {
			i++;
			System.out.println("Param" + i + ": " + param); // Вывод параметров
		}
	}

}
