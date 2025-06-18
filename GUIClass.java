import javax.swing.JOptionPane;

public class GUIClass {
	

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Your name");
		JOptionPane.showMessageDialog(null, "Hello " + name + ", nice to see you!");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old!");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Your height"));
		JOptionPane.showMessageDialog(null, "You say you are " + height + " cm tall!!!");
		

	}
	
	

}
