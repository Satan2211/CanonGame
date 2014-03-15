package cannonGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.*;

import javax.swing.JPanel;

public abstract class GamePanel extends JPanel implements KeyListener{
	private static final long serialVersionUID = 1111070142478367390L;
	
	private GamePhysics physics = new GamePhysics();
	
	private double GRAVITY   = physics.getGRAVITY();
	private double xVelocity = physics.getxVelocity();
	private double yVelocity = physics.getyVelocity();
	private double angle 	 = physics.getAngle();
	private double wind 	 = physics.getWind();
	private int xPos 		 = physics.getxPos();
	private int yPos 		 = physics.getyPos();    
	private int power 		 = physics.getPower(); 
	private int score		 = physics.getScore();
	

	
	public GamePanel(LevelType level){
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.setPreferredSize(new Dimension(800,625));
		this.addKeyListener(this);
	}
	
	public void fireBullet(Graphics g, int pow, int angle, int size) {
		g.setColor(new Color(255,255,0));
		g.setColor(Color.cyan);
		g.fillOval(xPos - size/2, yPos - size/2, size, size);
	}
    	
	public void paintComponent(Graphics g) {
		bkImage(g);			
		if (yPos <= 475) {
			yPos -= (int)yVelocity/100;
			xPos += (int)xVelocity/100;    
		   
			yVelocity -= GRAVITY;
			xVelocity -= wind;
		}   
		if(Math.random() > .5) {
			wind -= Math.random();
		} else {
			wind += Math.random();
		}
		drawStats(g);
		drawLeftBox(g);
		drawRightBox(g);
		Bullet.fireBullet(g, xPos, yPos, 10);
		drawAngle(g);
		
      
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		repaint();  
	} 
//	private void fireBullet(Graphics g, int pow, int angle, int size) {
//		g.setColor(new Color(255,255,0));
//		g.setColor(Color.cyan);
//		g.fillOval(xPos - size/2, yPos - size/2, size, size);
////		bullet.paint(g2d);
//	}
	private void drawAngle(Graphics g) {
		g.setColor(new Color(255,0,0));
		g.drawLine(5, 475, (int)(30*Math.cos(angle * Math.PI / 180) + 15), (int)(475 - 30*Math.sin(angle * Math.PI / 180)));
	}
	private void drawStats(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("Wind: "+(int)wind, 5, 15);
		g.drawString("Power: "+power, 5, 25);
		g.drawString("Angle: "+angle, 5, 35);
		//g.drawString("X: "+xPos+" Y: "+yPos, 5, 45);
		g.drawString("Score: " +(int)score, 5, 45);
	}   
	private void bkImage (Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 625);
		
	} 		
	public abstract void drawLeftBox(Graphics g);
	public abstract void drawRightBox(Graphics g);
	
	@Override
	public void keyPressed(KeyEvent evt) {
		int keyCode = evt.getKeyCode();
    	switch(keyCode) {
    		case 37: 
    			physics.setAngle(angle++);
    			break;
    		case 39:
    			physics.setAngle(angle--);
    			break;
    		case 38:
    			physics.setPower(power += 50);
    			break;
    		case 40:
    			physics.setPower(power -= 50);
    			break;
    		case 32:
    			xPos = 5;
    			yPos = 475;
    			xVelocity = power*Math.cos(angle * Math.PI / 180);
    			yVelocity = power*Math.sin(angle * Math.PI / 180);
    	}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub		
	}
	}
	
