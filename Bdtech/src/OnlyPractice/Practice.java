package OnlyPractice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Practice implements ActionListener{
	JTextField textField;
	JButton button;
	JLabel promptLabel;
	JLabel contentLabel;
	public Practice() {
		JFrame frame = new JFrame("Enter Text :");
		frame.setLayout(new FlowLayout());
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		textField = new JTextField(10);
		textField.setActionCommand("textfild");
		button = new JButton("Reverse");
		textField.addActionListener(this);
		button.addActionListener(this);
		promptLabel = new JLabel("enter text");
		contentLabel = new JLabel("");
		
		frame.add(promptLabel);
		frame.add(textField);
		frame.add(button);
		frame.add(contentLabel);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Practice();
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Reverse")) {
			
		}else {
			contentLabel.setText("you prass enter. text is "+JTextField.getDefaultLocale());
		}
		
	}

}