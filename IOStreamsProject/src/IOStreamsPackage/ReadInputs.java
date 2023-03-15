package IOStreamsPackage;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class ReadInputs implements ActionListener{
	JLabel myLabel;
	public ReadInputs() {
		JFrame jFrame = new JFrame("Birth Day");
		jFrame.setLayout(new FlowLayout());
		jFrame.setSize(250, 150);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		JButton myButton = new JButton("UP");
		JButton nyButton = new JButton("DOWN");
		JButton paButton = new JButton("TEST");
		myButton.addActionListener(this);
		nyButton.addActionListener(this);
		paButton.addActionListener(this);
		
		myLabel = new JLabel("Prass the botton for me");
		
		jFrame.add(myButton);
		jFrame.add(nyButton);
		jFrame.add(paButton);
		jFrame.setVisible(true);
		jFrame.add(myLabel);
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ReadInputs();
			}
		});
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("UP")) {
			myLabel.setText("Where are you going");

		}else if (e.getActionCommand().equals("DOWN")) {
			myLabel.setText("where are you comeing from");
		}else {
			myLabel.setText("This is your day");
		}
		
	}

}
