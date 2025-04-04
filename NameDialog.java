import javax.swing.JOptionPane;

public class NameDialog {

	public static void main (String[] args) {
	
		// prompt user to enter name
		String name = JOptionPane.showInputDialog(" What is Your Name ? ");
		
		// create the message
		String message = 
			String.format(" Welcome, %s, to Java Programming!", name);
			
		// display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message);
	
	}
}