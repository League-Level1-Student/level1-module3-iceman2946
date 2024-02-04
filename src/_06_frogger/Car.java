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
}
