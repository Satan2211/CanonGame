package cannonGame;

public class GamePhysics {
	private int xPos 			 = 5;
	private int yPos 			 = 475;
    private int power 			 = 1000;
    private double angle 		 = 65.0;
    private double xVelocity	 = power*Math.cos(angle * Math.PI / 180), yVelocity = power*Math.sin(angle * Math.PI / 180);
    private final double GRAVITY = 9.8;
    private double wind 		 = 0.0;
    private int score 			 = 0;
	
    public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public double getxVelocity() {
		return xVelocity;
	}
	public void setxVelocity(double xVelocity) {
		this.xVelocity = xVelocity;
	}
	public double getyVelocity() {
		return yVelocity;
	}
	public void setyVelocity(double yVelocity) {
		this.yVelocity = yVelocity;
	}
	public double getWind() {
		return wind;
	}
	public void setWind(double wind) {
		this.wind = wind;
	}
	public double getGRAVITY() {
		return GRAVITY;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
}
