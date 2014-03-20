package levels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import cannonGame.CannonGame;
import cannonGame.GameLevel;
import cannonGame.LevelType;

public class Level1 extends GameLevel {
	//private static final long serialVersionUID = 5307606560799284583L;
	
	
	private static final long serialVersionUID = 1L;
	public CannonGame game;
	private static Graphics g;
	private BufferedImage image;
    public Level1 () {
    	super(LevelType.EASY);
    	try {                
            image = ImageIO.read(new File("Level1Bk.jpg"));
         } catch (IOException ex) {
             
         }
    	 	
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
