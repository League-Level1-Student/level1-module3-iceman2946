package _06_frogger;

import processing.core.PApplet;

public class Car  {
	int x;
	int y;
	int size;
	int speed;
	PApplet sketch;
	Car(int x,int y, int size, int speed,PApplet sketch) {
		this.x=x;
		this.y=y;
		this.size=size;
		this.speed=speed;
		this.sketch=sketch;
	}
	void display()
	  {
	    sketch.fill(0,255,0);
	    sketch.rect(x , y,  size, 50);
	  }
	void moveLeft() {
		speed--;
		x--;
		if(x<0) {
			x=Frogger.WIDTH; 
		}
	}
	void moveRight() {
		speed++;
		x++;
		if(x>Frogger.WIDTH) {
			x=0;
		}
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getSize() {
		return size;
		
	}
	boolean intersects(Car car) {
		 if ((frogY > car.getY() && frogY < car.getY()+50) &&
		                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }

	}
}
