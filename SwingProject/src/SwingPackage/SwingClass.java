package SwingPackage;
import javax.swing.*;

public class SwingClass {
	public SwingClass() {
		JFrame jframe = new JFrame("This Is axaiting");
		jframe.setSize(350,200);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingClass();
				
			}
		}
		);

	}

}
