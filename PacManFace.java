import javax.swing.*;
import java.awt.*;

public class PacManFace extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPacMan(g);
        drawDots(g);
    }

    private void drawPacMan(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        
        g2d.fillArc(50, 50, 100, 100, 45, 270);
    }

    private void drawDots(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLUE);

        g2d.fillOval(160, 90, 20, 20);
        g2d.fillOval(190, 90, 20, 20);
        g2d.fillOval(220, 90, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pac-Man Face");
        PacManFace pacManFace = new PacManFace();
        frame.add(pacManFace);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}