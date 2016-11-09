import java.awt.*;

public class Square extends Polygon {
    Square(int x, int y) {
        super(x,y);
    }

    @Override
    public void toString(Polygon p) {
        System.out.println("Square");
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(centerPoint.x - 10, centerPoint.y - 10, 20, 20);
    }
}
