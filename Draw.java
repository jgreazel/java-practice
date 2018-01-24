import javax.swing.JFrame;
import java.awt.Rectangle;

public class Draw{
	public static void main(String[] args){
		JFrame window = new JFrame();
		window.setSize(640,640);
		window.setTitle("The Easel");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

		Pictures box = new Pictures();
		window.add(box);

	}
}