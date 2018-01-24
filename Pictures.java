import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Pictures extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		Rectangle rect1 = new Rectangle(100,100,200,200);
		g2.draw(rect1);
	}
}
