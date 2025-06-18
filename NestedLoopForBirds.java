import java.util.Scanner; // Always import Scanner for user input

public class NestedLoopForBirds {

	public static void main(String[] args) {
		
		// NOTE - Scanner in include
		
		// Scanner and variable initialization
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = " ";
		
		// User input #1
		System.out.println("Enter # of Rows you want: ");
		rows = scanner.nextInt();
		
		// User input #2
		System.out.println("Enter # of Columns you want: ");
		columns = scanner.nextInt();
		
		// User input #3
		System.out.println("Choose a Symbol for it to use: ");
		symbol = scanner.next();
		
		// Nested Loop
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
		
		// Closing our Scanner/No more user input after: scanner.close();
		scanner.close();

	}

}
