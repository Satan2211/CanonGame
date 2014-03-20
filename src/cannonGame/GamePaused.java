package cannonGame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class GamePaused extends JFrame implements ActionListener {
	

	private static final long serialVersionUID = 4062460860021480319L;
	
	
	JButton btnExitToMain = btnExitToMain();
	JButton btnReturn	 = btnReturn();
	
	
	
	public GamePaused() {
		
		btnExitToMain.addActionListener(this);
		btnReturn.addActionListener(this);
		
		getContentPane().setLayout(null);
		setTitle("Game Paused");
		setPreferredSize(new Dimension(300,315));
		
		
		JLabel lblGamePaused = new JLabel("Game paused");
		lblGamePaused.setBounds(10, 11, 65, 14);
		getContentPane().add(lblGamePaused);
		
		JLabel lblCurrentScore = new JLabel("Current Score:");
		lblCurrentScore.setBounds(127, 11, 71, 14);
		getContentPane().add(lblCurrentScore);
		
	}
	private JButton btnExitToMain(){
		JButton btnExitToMain = new JButton("Exit to main menu");
		btnExitToMain.setBounds(81, 70, 117, 23);
		getContentPane().add(btnExitToMain);
		return btnExitToMain;
	}
	private JButton btnReturn(){
		JButton btnReturn = new JButton("Return to game");
		btnReturn.setBounds(81, 36, 117, 23);
		getContentPane().add(btnReturn);
		return btnReturn;
	}
	
	public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	if(src == btnExitToMain){		
		System.out.println("Exiting to main menu");
		new cannonGame.GameOptions().setVisible(true);
		this.setVisible(false);
	}
	else if(src == btnReturn){
		System.out.println("Returning to the game");
		this.setVisible(false);
	}
}

}
