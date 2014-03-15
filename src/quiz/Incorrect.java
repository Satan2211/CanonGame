package quiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Incorrect extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Incorrect() {
		getContentPane().setLayout(null);
		
		JLabel lblYourAnswerWas = new JLabel("Your answer was incorrect, the correct answer is:");
		lblYourAnswerWas.setBounds(10, 11, 246, 19);
		getContentPane().add(lblYourAnswerWas);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 41, 380, 54);
		getContentPane().add(panel);
		
		JLabel lblYourAnswerWas_1 = new JLabel("Your answer was:");
		lblYourAnswerWas_1.setBounds(10, 99, 246, 14);
		getContentPane().add(lblYourAnswerWas_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 124, 374, 54);
		getContentPane().add(panel_1);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(10, 197, 89, 23);
		getContentPane().add(btnContinue);
	}

}
