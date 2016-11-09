import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPolygons extends JComponent{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);

        polygons.add(new Square(100,100));
        polygons.add(new Triangle(150,150));
        polygons.add(new Rectangle(100,200));

    }//constructor

    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

        Polygon p1 = new Triangle(300, 200);
        polygons.add(p1);

        Polygon p2 = new Square(300, 200);
        polygons.add(p2);

        p1.overlaps(p2);


    }//main

}//DrawPolygons