import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Pictures extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		Rectangle rect1 = new Rectangle(100,100,200,200);
		Rectangle rect2 = new Rectangle(150,150, 100,100);
		Rectangle rect3 = new Rectangle(175,175, 50,50);
		Rectangle rect4 = new Rectangle(125,125, 150,150);

		g2.draw(rect1);
		g2.draw(rect2);
		g2.draw(rect3);
		g2.draw(rect4);


	}
}