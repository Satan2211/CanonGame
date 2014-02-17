package cannonGame;

import java.awt.Graphics;


public abstract class GameLevel extends GamePanel{	
	private static final long serialVersionUID = 3280731413813259484L;
	
	private LevelType level = null;
	public GameLevel(LevelType level) {
		super(level);
		this.level = level;
	}		
	public LevelType getLevel() {
		return level;
	}
	public void setLevel(LevelType level) {
		this.level = level;
	}
	@Override
	public void drawLeftBox(Graphics g) { }
	@Override
	public void drawRightBox(Graphics g) { }
}
