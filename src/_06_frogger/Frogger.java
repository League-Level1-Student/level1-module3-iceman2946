package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x;
    int y;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(112,154,79);
    	ellipse(50,300,40,40);
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
    }
    public void exitCanvas() {
    	if(x<=0) {
    		x=50;
    		y=300;
    }
    	else if(y<=0) {
    		x=50;
    		y=300;
    	}
    	else if(x>600) {
    		x=50;
    		y=300;
    	}
    	else if(y>400) {
    		x=50;
    		y=300;
    	}
    }
}
