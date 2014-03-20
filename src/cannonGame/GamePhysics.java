package cannonGame;

public class GamePhysics {
    private int power 			 = 1000;
    private double angle 		 = 45.0;
    private double xVelocity	 = power*Math.cos(angle * Math.PI / 180), yVelocity = power*Math.sin(angle * Math.PI / 180);
    private final double GRAVITY = 9.8;
    private int score 			 = 0;
    private int ammo			 = 3;
    private double wind			 = 0;
    private int xPos			 = 5;
    private int yPos			 = 475;
	
	public int getPower() {
		return this.power;
	}
	public int getxPos(){
		return this.xPos;
	}
	public void setxPos(int xPos){
		this.xPos = xPos;
	}
	public int getyPos(){
		return this.yPos;
	}
	public void setyPos(int yPos){
		this.yPos = yPos;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public double getWind(){
		return this.wind;
	}
	public double getAngle() {
		return this.angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public double getxVelocity() {
		return this.xVelocity;
	}
	public void setxVelocity(double xVelocity) {
		this.xVelocity = xVelocity;
	}
	public double getyVelocity() {
		return this.yVelocity;
	}
	public void setyVelocity(double yVelocity) {
		this.yVelocity = yVelocity;
	}
	public double getGRAVITY() {
		return this.GRAVITY;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return this.score;
	}
	public void setAmmo(int ammo){
		this.ammo = ammo;
	}
	public int getAmmo(){
		return this.ammo;
	}
}
