package cannonGame;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = -5497422839715600682L;

	public GameWindow(LevelType level){
		setTitle("Game");
		setResizable(false);
		setSize(new Dimension(800,625));
		add(GameLevelFactory.createLevel(level));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
