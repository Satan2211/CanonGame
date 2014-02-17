package levels;

import java.awt.Color;
import java.awt.Graphics;

import cannonGame.CannonGame;
import cannonGame.GameLevel;
import cannonGame.LevelType;

public class Level1 extends GameLevel {
	//private static final long serialVersionUID = 5307606560799284583L;
	
	public CannonGame game;
	private static Graphics g;
    public Level1 () {
    	super(LevelType.EASY);
    }
    @Override
	public void drawLeftBox(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 525, 80, 100);
	}
    @Override
	public void drawRightBox(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(135, 525, 80, 100);		
	}
	public static Graphics getG() {
		return g;
	}
	public static void setG(Graphics g) {
		Level1.g = g;
	}	
}
