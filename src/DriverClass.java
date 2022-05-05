import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DriverClass extends Game{
	public static Game game = new Game();

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// this runs the GUI
				// i don't know why exactly i implemented the whole invoke later thing but some
				// guys said it helps with stability (and he was right) 
				game.FirstScreen();

			 //these lines are made to test methods that show the text and buttons and stuff.
//				game.SetFrame("images/633x393 alt frame.png");
//				game.CharacterSays("patrolling the mojave almost makes you wish for a nuclear winter.");
//				game.YourOptionsAre("patrolling the mojave almost makes you wish for a nuclear winter.");

			}
		});
	}

}
