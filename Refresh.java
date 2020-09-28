package awake;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class awa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean  flag=false;
		
		 Robot bot = new Robot();

		 while(flag!=true)
		 {
		 
		 int mask = InputEvent.BUTTON3_DOWN_MASK;
		 int mask1 = InputEvent.BUTTON1_DOWN_MASK;
		  bot.mouseMove(100, 100);
		  bot.mousePress(mask);
		  bot.mouseRelease(mask);
		  Thread.sleep(1000);
		  bot.mouseMove(80, 160);
		  bot.mousePress(mask1);
		  bot.mouseRelease(mask1);
		  
		  Thread.sleep(10000);
		 }
		 
	}

}
