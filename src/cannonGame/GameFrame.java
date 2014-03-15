package cannonGame;

import java.awt.Graphics;


public abstract class GameFrame extends GamePanel{	
	
	private static final long serialVersionUID = 3510177305361465350L;
	private FrameType frame = null;
	public GameFrame(FrameType frame) {
		super(null, frame);
		this.frame = frame;
	}		
	public FrameType getframe() {
		return frame;
	}
}
