
public class LogicalStuff {

	public static void main(String[] args) {
		
		int carrotStock = 16;
		int tomatoStock = 14;
		boolean hot = true;
		boolean notHot = !hot;
		
		System.out.println(notHot);
		
		System.out.println(carrotStock > 14 || carrotStock < 14);
		System.out.println(tomatoStock > 15 || tomatoStock < 15);
		
		if (carrotStock > 30000) {
			System.out.println("Infinite amount of Carrots");
		} else if (carrotStock >= 20000 && carrotStock <= 30000) {
			System.out.println("Good amount of Carrots");
		} else {
			System.out.println("Low amount of Carrots");
		}

	}

}
