//Author: Spencer Gilcrest
//Date created 12/4/24
//This is the Ball class that contains information about the ball in the Brick break game
import java.awt.*;

public class Ball {
	//instance variables
	private int xPos;
	private int yPos;
	private int size;
	private int xVelocity = 1;
	private int yVelocity = 1;
	
	//constructor
	public Ball(int initXPos, int initYPos, int initSize){
		xPos = initXPos;
		yPos = initYPos;
		size = initSize;
	}
	
	//getters
	public int getXpos(){
		return xPos;
	}

	public int getYpos(){
		return yPos;
	}

	public int getSize(){
		return size;
	}

	//setters
	public void setXVelocity(int x){
		xVelocity = x;
	}

	public void setYVelocity(int y){
		yVelocity = y;
	}

	public void setX(int x){
		xPos = x;
	}

	public void setY(int y){
		yPos = y;
	}

	//other methods

	//pre condition: none
	//post condition: moves x in opposite direction
	public void reverseX(){
		xVelocity *= -1;
	}

	//pre condition: none
	//post condition: moves y in opposite direction
	public void reverseY(){
		yVelocity *= -1;
	}

	//pre condition: none
	//post condition: a call to this method actually moves the ball based on its given velocity
	public void move(){
		xPos += xVelocity;
		yPos += yVelocity;
	}

	//pre condition: g cannot be null
	//post condition: draws the ball on the screen!
	public void draw(Graphics g){
		g.fillOval(xPos, yPos, size, size);
		g.setColor(Color.WHITE);
	}
	
	
	
	
	

}
