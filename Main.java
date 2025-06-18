import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String boxOne = "Toys";
		String boxTwo = "Other";
		String switcher = null;
		
		switcher = boxOne;
		boxOne = boxTwo;
		boxTwo = switcher;
		
		System.out.println("Box 1: " + boxOne);
		System.out.println("Box 2: " + boxTwo);
		
		System.out.println("Put something in Box 1: ");
		String other = scanner.nextLine();
		
		System.out.println("Put something in Box 2: ");
		String toy = scanner.nextLine();
		
		System.out.println("You put a " + other + " in Box 1");
		System.out.println("You put a " + toy + " in Box 2");
		
		scanner.close();
		
	}

}
