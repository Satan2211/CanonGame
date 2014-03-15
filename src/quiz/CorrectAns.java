package quiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CorrectAns extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JLabel lblWellDoneYour = new JLabel("Well Done, your answer is correct");
	public CorrectAns() {
		getContentPane().setLayout(null);
		lblWellDoneYour.setBounds(10, 11, 248, 31);
		getContentPane().add(lblWellDoneYour);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(10, 53, 89, 23);
		getContentPane().add(btnContinue);
	}

}
