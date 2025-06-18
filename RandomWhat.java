import java.util.Random;

public class RandomWhat {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(3, 7);
		double y = random.nextDouble(7.0);
		
		System.out.println(x);
		System.out.println(y);

	}

}
