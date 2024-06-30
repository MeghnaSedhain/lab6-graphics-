import javax.swing.*;
import java.awt.*;

public class TriangleDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawTriangles(g2d);
    }

    private void drawTriangles(Graphics2D g2d) {
        int[] xPoints1 = {50, 100, 150};
        int[] yPoints1 = {150, 50, 150};
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(xPoints1, yPoints1, 3);

        int[] xPoints2 = {50, 100, 150};
        int[] yPoints2 = {50, 150, 50};
        g2d.setColor(Color.RED);
        g2d.fillPolygon(xPoints2, yPoints2, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Triangles Facing Each Other");
        TriangleDrawing panel = new TriangleDrawing();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}