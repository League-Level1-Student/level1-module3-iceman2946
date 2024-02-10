package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x;
    int y;
    Car car1;
    Car car2;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	car1= new Car(0,200,50,20,this);
    	car2= new Car(0,400,50,20,this);
    }

    @Override
    public void draw() {
    	fill(112,154,79);
    	ellipse(x,y,40,40);
    	car1.moveLeft();
    	car1.display();
    	car2.moveRight();
    	car2.display();
    	car1.intersects(car1);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                y++;
            }
            else if(keyCode == DOWN)
            {
                y--;
            }
            else if(keyCode == RIGHT)
            {
                x++;
            }
            else if(keyCode == LEFT)
            {
                x--;
            }
        }
        exitCanvas();
    }
    public void exitCanvas() {
    	if(x>WIDTH) {
    		x=WIDTH;
    	}
    	if(x<0) {
    		x=0;
    	}
    	if(y>HEIGHT) {
    		y=HEIGHT;
    	}
    	if(y<0) {
    		y=0;
    	}
    }
}
