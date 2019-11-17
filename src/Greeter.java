import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String snack=JOptionPane.showInputDialog(null,"What is your favorite snack?");
	JOptionPane.showMessageDialog(null,snack+ " are awsome!");
}
}
