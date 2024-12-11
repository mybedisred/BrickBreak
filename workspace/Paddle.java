//Author: Spencer Gilcrest
//date: 12/4/24
//This is the paddle class that contains information about the paddle (player) in the Brick Break game
import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int velocity = 0;
	


	//constructor
	public Paddle(int initXPos, int initYPos, int initWidth, int initHeight){
		xPos = initXPos;
		yPos = initYPos;
		width = initWidth;
		height = initHeight;
	}
	
	//getters
	public int getX(){
		return xPos;
	}

	public int getY(){
		return yPos;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}

	//setters
	public void setX(int x){
		xPos = x;
	}

	public void setVelocity(int velo){
		velocity = velo;
	}

	//other methods

	//pre condition: input (addition) is an integer
	//post condition: increases or decreases paddle velocity accordingly
	public void addVelocity(int addition){
		velocity+= addition;
		if (velocity > 8){
			velocity = 8;
		}
		if (velocity < -8){
			velocity = -8;
		}
		
	}

	//pre condition: none
	//post condition: moves the paddle based on given velocity
	public void move(){
		xPos+=velocity;
		if (velocity > 1){
			velocity-=2;
		}
		if (velocity < -1){
			velocity+=2;
		}
	}
	

	//pre condition: g cannot be null
	//post condition: draws the paddle on the screen
	public void draw(Graphics g){
		g.fillRect(xPos, yPos, width, height);
		g.setColor(Color.WHITE);
	}
	
	
}
