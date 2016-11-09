import java.awt.*;

public class Rectangle extends Polygon {
    Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void toString(Polygon p) {
        System.out.println("Rectangle");
    }

    public void paint(Graphics g){
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
