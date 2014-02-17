package cannonGame;


import java.awt.Dimension;

import javax.swing.JFrame;

public class CannonGame {	
	public CannonGame() {
		GameOptions options = new GameOptions();
		
        final JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200,200));
        frame.add(options);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }  
	public static void main(String[] args) {
		new CannonGame();
	}
}
