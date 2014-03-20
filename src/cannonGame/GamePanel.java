package cannonGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import cannonGame.Bullet;






import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class GamePanel extends JPanel implements KeyListener{
	private static final long serialVersionUID = 1111070142478367390L;
	
	private GamePhysics physics = new GamePhysics();
	 

	private int xPos 		 = 5;
    private int yPos 		 = 475;
//    private int yPos		 = physics.getyPos();
//    private int xPos		 = physics.getxPos();
   // private double wind 	 = physics.getWind();
    private double wind 	 = 0;
	private double GRAVITY   = physics.getGRAVITY();
	private double xVelocity = physics.getxVelocity();
	private double yVelocity = physics.getyVelocity();
//	private double angle 	 = physics.getAngle();
	private double angle 	 = 45;
	private int power 		 = physics.getPower(); 
	private int score		 = physics.getScore();
	private int ammo		 = physics.getAmmo();


	public GamePanel(LevelType level) {
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.setPreferredSize(new Dimension(800,625));
		this.addKeyListener(this);
	}
		
	
	public void fireBullet(Graphics g, int pow, int angle, int size) {
		g.setColor(new Color(255,255,0));
		g.fillOval(xPos - size/2, yPos - size/2, size, size);
	}
	public void erase(Graphics g) {
		g.setColor(new Color(0,0,0));
		g.fillRect(0,0,500,500);
	}
    	
	public void paintComponent(Graphics g) {
	
		
//		BufferedImage myPicture = null;
//		try {
//			myPicture = ImageIO.read(new File("resources/Level1Bk.jpg"));
//		} catch (IOException e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
//		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//		add(picLabel);
		
		
	
		bkImage(g);
        erase(g);
        

        if (yPos <= 475) {       	
            yPos -= (int)yVelocity/100;
            xPos += (int)xVelocity/100;   
            
            physics.setyVelocity(yVelocity - GRAVITY);
            //physics.setxVelocity(wind);
            
        }
        if(Math.random() > .5) {
        	wind -= Math.random();
        } else {
        	wind += Math.random();
        }
           
        drawStats(g);
        fireBullet(g, xPos, yPos, 10);
        drawAngle(g);
        drawRightBox(g);
        drawLeftBox(g);
              	
        try {
           Thread.sleep(20);
        } catch (InterruptedException e) {
           System.out.println(e);
        }
        repaint();
        
     }
	
	private void drawAngle(Graphics g) {
		g.setColor(new Color(255,255,0));
		g.drawLine(5, 475, (int)(30*Math.cos(angle * Math.PI / 180) + 5), (int)(475 - 30*Math.sin(angle * Math.PI / 180)));
	}
	private void drawStats(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("Wind: "+(int)wind, 5, 15);
		g.drawString("Power: "+power, 5, 25);
		g.drawString("Angle: "+angle, 5, 35);
		g.drawString("X: "+xPos+" Y: "+yPos, 5, 45);
		g.drawString("Score: " +(int)score, 5, 55);
		g.drawString("Ammo: " +(int)ammo, 5,65);
	}   
	private void bkImage (Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 625);
		
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
//    			physics.setxPos(5);
//              physics.setyPos(475);
    			xPos = 5;
    			yPos = 475;
    			physics.setxVelocity(power*Math.cos(angle * Math.PI / 180));
    			physics.setyVelocity(power*Math.sin(angle * Math.PI / 180));
    			physics.setAmmo(ammo -1);
    			break;
    		case 27:
    			new cannonGame.GamePaused().setVisible(true);
    			break;
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
	
