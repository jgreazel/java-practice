import java.awt.Rectangle;

public class ReplaceDemo{
	public static void main(String[] args){
		String river = "Mississippi";
		int yes=0;
		Rectangle rect = new Rectangle(5,5);
		System.out.println(river.replace("i","x"));
		if(yes==1){
			System.out.println(yes+5);
		}
		System.out.println("Hello World!");
		System.out.println(new Rectangle(5,5,5,5));
		rect.translate(6,6);
		System.out.println(rect + "Hi");
	}
}