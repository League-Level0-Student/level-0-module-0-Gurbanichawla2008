import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
String name= JOptionPane.showInputDialog(null,"What is your name?");
String summer=JOptionPane.showInputDialog(null,"What did you do last summer?");
JOptionPane.showMessageDialog(null,"Hi " + name + " I know you from " + summer + " last summer!");
	
}
}
