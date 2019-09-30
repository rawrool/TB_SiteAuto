import java.awt.event.KeyEvent;

//import org.apache.log4j.chainsaw.Main;
import org.sikuli.script.*;

public class Order{
	
	//private static final Pattern menu = new Pattern(Main.class.getResource("/site_Images/menu.png"));
	//private static final Pattern newItems = new Pattern(Main.class.getResource("/site_Images/new.png"));
	
	public static void main(String[] args) throws FindFailed{

		Screen screen = new Screen(0);
		
		run(screen);
		
		screen.type("chrome ta.co");
		screen.keyDown(Key.ENTER);
		
		//screen.wait(menu.similar((float) 0.90),2).click();
		//screen.wait(newItems.similar((float) 0.90),5).click();
	}
	
	public static void run(Screen s) {
		s.keyDown(Key.WIN);
		s.keyDown(KeyEvent.VK_R);
		s.keyUp(Key.WIN);
		s.keyUp(KeyEvent.VK_R);
	}
}