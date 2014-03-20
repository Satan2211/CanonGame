package cannonGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Bullet extends CannonGame implements KeyListener{

	private static GamePhysics physics = new GamePhysics();
	private static int xPos 		 = physics.getxPos();
	private static int yPos 		 = physics.getyPos(); 
	private double xVelocity = physics.getxVelocity();
	private double yVelocity = physics.getyVelocity();
	private double angle 	 = physics.getAngle();
	    
	private int power 		 = physics.getPower(); 	

	public static void fireBullet(Graphics g, int pow, int angle, int size) {
		g.setColor(Color.cyan);
		g.fillOval(xPos - size/2, yPos - size/2, size, size);
	}
	public void keyPressed(KeyEvent evt) {
		int keyCode = evt.getKeyCode();
    	switch(keyCode) {
    	case 32:
    	
	xPos = 5;
	yPos = 475;
	xVelocity = power*Math.cos(angle * Math.PI / 180);
	yVelocity = power*Math.sin(angle * Math.PI / 180);
    	}
    	
}
	
}




//public class Ball {
//	
//	private Game game;
//
//	public Ball(Game game) {
//		this.game= game;
//	}
//
//	void move() {
//		if (x + xa < 0)
//			xa = 1;
//		if (x + xa > game.getWidth() - DIAMETER)
//			xa = -1;
//		if (y + ya < 0)
//			ya = 1;
//		if (y + ya > game.getHeight() - DIAMETER)
//			game.gameOver();
//		if (collision()){
//			ya = -1;
//			y = game.racquet.getTopY() - DIAMETER;
//		}
//		x = x + xa;
//		y = y + ya;
//	}
//
//	private boolean collision() {
//		return game.racquet.getBounds().intersects(getBounds());
//	}
//
//	public void paint(Graphics2D g) {
//		g.fillOval(x, y, DIAMETER, DIAMETER);
//	}
//	
//	public Rectangle getBounds() {
//		return new Rectangle(x, y, DIAMETER, DIAMETER);
//	}
//}