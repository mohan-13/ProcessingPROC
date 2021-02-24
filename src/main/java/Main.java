import processing.core.PApplet;

public class Main extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public static int counter=0;

    public static void main(String[] args) {
        PApplet.main("Main",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        step();
        showBalls();
    }

    private void showBalls() {
        ellipse(counter,HEIGHT*1/5,DIAMETER, DIAMETER);
        ellipse(2*counter,HEIGHT*2/5,DIAMETER, DIAMETER);
        ellipse(3*counter,HEIGHT*3/5,DIAMETER, DIAMETER);
        ellipse(4*counter,HEIGHT*4/5,DIAMETER, DIAMETER);
    }

    private void step() {
        counter++;
    }
}
