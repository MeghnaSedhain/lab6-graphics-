
import java.awt.Frame;
import java.awt.Graphics;
     public class NepalFlag extends Frame{
    NepalFlag(){
        setSize(500,500);
        setVisible(true);
    
    }
    public void paint(Graphics g){
        super.paint(g);

        g.drawLine(10,50,120,150);
        g.drawLine(60,150,120,260);
        g.drawLine(120,150,60,150);
        g.drawLine(120,260,10,260);
        g.drawLine(10,260,10,50);
        g.drawLine(10,260,10,290);
    }
    public static void main(String[]args){
        new NepalFlag();
    }
}
