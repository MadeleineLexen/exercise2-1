import javax.swing.*;
import java.awt.*;

public abstract class Polygon extends JComponent{
    Point centerPoint;

    private Polygon(Point center){
        this.centerPoint = center;
    }

    public Polygon(int x, int y){
        this(new Point(x,y));
    }

    public abstract void toString( Polygon p);

    public boolean overlaps(Polygon p){
        System.out.println("Polygon.overlaps " + p.toString() + "vs " + this.toString());
        return true;
    }
    @Override
    public abstract void paint(Graphics g)//paint
    ;
}
