package levels;

import java.awt.Color;
import java.awt.Graphics;

import cannonGame.CannonGame;
import cannonGame.GameLevel;
import cannonGame.LevelType;

public class Level2 extends GameLevel {
	private static final long serialVersionUID = 5307606560799284583L;
	
	public CannonGame game;
	private static Graphics g;
    public Level2 () {
    	super(LevelType.EASY);
    } 
	public void drawLeftBox(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 525, 80, 100);
	}
	public void drawRightBox(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(720, 525, 80, 100);		
	}
	public static Graphics getG() {
		return g;
	}
	public static void setG(Graphics g) {
		Level2.g = g;
	}	
}
