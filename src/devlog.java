import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class devlog {

	public devlog() {
		/*
		 * okay so basically i'm trying to make the main frame have the same background at all times 
		 * while we shift the smaller elements like buttons and titles and stuff over it 
		 * i got the main background to appear correctly on the frame 
		 * but i can't display any panel on top of it , gonna try sth different tomorrow.
		 * i got everything to display correctly , now i just gotta make it interactive 
		 * and also figure out a way to write the dynamic story without losing my mind.
		 * 
		 * end Day 1 
		 * 
		 * Day 2 
		 * trying to set up the buttons locations and functions
		 * okay so i set up the button's icon , location and hover effects .
		 * now i'm gonna add 3 more with the same icon 
		 * note to self : the items which won't change image (the buttons and background for
		 * example) are hard coded , while the other elements will be changed with a method 
		 * setIcon(ImageIcon) is a method which takes an argument of icon.
		 * the way switching images will work is that there's a child class called "script"
		 * which controls the visibility of the elements in the game class 
		 * (the game class is basically the game elements all in one place , the script will handle
		 * their visibility) .
		 * okay so the buttons don't show the text properly , however the hover functionality works
		 * gonna have to change these buttons into panels with click funcionality 
		 * bruh 
		 * end of Day 2 
		 * 
		 * Day 3 
		 * let's goooo.
		 * okay so so far i've got the four buttons in place and responding to clicks
		 * i had to remove the hovering functionality tho , which is not ideal , but we all have to 
		 * make sacrifices , don't we ?
		 * okay so everything so far is working fine , i still have to figure out where the click
		 * info is going to go (and how the script class will work)
		 * most likely gonna do some writing and brainstorming tonight , hopefully 
		 * god of war is really really good 
		 * end of day3
		 * 
		 * Day4 
		 * let's .... whatever 
		 * i did some good writing yesterday using this app called twine which is really good 
		 * to be honest , i made a playable text only version of the game for the first few choices 
		 * or so and it's actually working really well ,i tried to some object oriented shit to try to run 
		 * a script onto the game object but it 
		 * didn't work .
		 * BUT , i god a method that takes the image location and displays it onto the main frame 
		 * which worked on the second time 
		 * [GOOD IDEA] okay so since there could be less than 4 options we should make a method 
		 * that only shows 2 or 3 or one button so we don't just have dumb empty buttons like a
		 * stupid unprofessional game.
		 * never mind that i still don't know how to handle player choice , 
		 * HOLY SHIT , i got the typing animation thingy to work , aaaaaaaaaaaaaaaa
		 * on a seperate note i used polymorphism to implement the bit about the options thingy 
		 * end of day 4 
		 * 
		 * Day5 
		 * let's go 
		 * okay so i got the images to be a part of the project file and this way i can send it to 
		 * people without worrying about the image paths , hey , at least i solved one problem.
		 * and i added an action listener on the panel which displays the text , and the typewriter
		 * method thingy is readable inside it 
		 * now i just gotta figure out how to set off the initial screen and then handle player
		 * choice , you know , the actual "game" part.
		 * i fuckin hate this tbh.
		 * i think i figured it out , the way it works is that every button will pass a variable
		 * into a method , this method has a switch case with the story mapped inside of it 
		 * and everytime you make a move (press a button) it sends you into the method and then 
		 * shows you a screen and then the gui is modified in accordance to that number , then we 
		 * incriment the number .
		 * HOLY SHIT IT WORKS AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		 * it actually displays the buttons then displays a different screen when you press sth 
		 * and i can control what it shows .
		 * i can't believe it works.
		 * HOW THE EVENT HANDLER WORKS 
		 * it's a big switch case , and you start at 1 which shows you the 2 buttons 
		 * then when you press the button you either 
		 * send a 2 or a 3 to the method , the 2 shows a different screen than 3 , 
		 * button 1 --> gPosition
		 * button 2 --> gPosition+1
		 * button 3 --> gPosititon+2
		 * button 4 --> gPosition+3
		 * and so the options should work accordingly . 
		 * 
		 * end of day 5.
		 * 
		 * Day 6 
		 * okay so i spent like a few minutes trying to figure out why buttons don't display correctly 
		 * the reason is that if you don't type the break for a case it just keeps going so it displays 
		 * a lot of stuff at once.
		 * end of day6 
		 * 
		 * Day 7
		 * i implemented the first branching decision tree , i think i should just use a different method that
		 * factors position into account.
		 * yeah , in the meantime i'll develop the story a bit more.
		 * end of day 7 
		 * 
		 * Day 8 
		 * okay so now i developed some blocks of the story and i'm gonna implement it 
		 * the main lines and diagrams are on a huge sheet of paper while the detailed stuff is in a doc 
		 * online
		 * i'm gonna implement the first bit and test it , hopefully it works.
		 * it works surprisingly well , all the images display properly and it's very responsive.
		 * i wrote 2 small dialogue branches .
		 * end of day8
		 * 
		 * Day 9 
		 * so i know that the project works on different machines with minimal issues , now it's time for
		 * the hardest part of this whooole thing : ART , seriously tho i don't even know how i'm gonna make 
		 * that much art , i mean there's optimisations that i know in photoshop to speed things up a bit
		 * but even then it could take months .
		 * let's just do the sketches of the first cutscene , hopefully it doesn't look like garbage.
		 * but even if it does , i'm fine with that , disney had the courage to release star wars ep9 
		 * why shouldn't i have the courage to release this game ???
		 * end of day 9
		 * 
		 * Day 10 
		 * so it's more like .. i drew and implemented ONE screen , but it looks good , so i can't complain 
		 * it's also like , significantly harder than i thought to draw sci-fi stuff 
		 * i'm really proud of the billionaires rocket that i drew , it looks rad .
		 * i'm gonna start laying out the rough work for the main factions today , maybe even consider 
		 * straight up killing the player in some encounters if they say the wrong thing .
		 * not just reduce their health , the player can always be killed with one hit .
		 * maybe i can even add a save functionality so the player can resume from where they stopped 
		 * but i don't think the game will be THAT long . 
		 * end of day 10.
		 * 
		 * Day 11 
		 * i implemented a few screens which included the first ending (the one where the sun-sons kill you
		 * instantly OR you keep going into their territory and finish the game early)
		 * the screen which determines this uses a randomly generated number and either returns you to the 
		 * beginning of the game or you start talking your way with the guard )
		 * i finished god of war's main story and holy shit , 10/10.
		 * initially i was going to make the odds actually 85% but tbh , it would mean the majority of the
		 * players won't experience the ending for the cult .
		 * end of day 11 
		 * 
		 * Day 12 
		 * i'm thinking of making the cult death ending less likely than 50% , to increase the chance of
		 * people going this route , finished drawing 2 screens gonna implement a few cult speeches
		 * and see what happens .
		 * well , i implemented like six screns or so and finished up two arties 
		 * that's what i'm calling my shitty digital drawings now.
		 * my amazing assistant programmer helped me fix a very stupid bug , THANK YOU .
		 * end of day 12
		 * 
		 * Day 13 
		 * i can't do this today , sorry , gonna binge youtube till my brain stops spinning.
		 * end of day 13
		 * 
		 * Day 14 
		 * so after a lot of tugging and pulling i found a way to store the methods for controlling the game 
		 * (except the ones that change player options) in a different class , it helps because now when 
		 * i see something wrong with the game i'll know exactly which method did it , it's much easier to work 
		 * on now all the method had to be static , because it makes calling them easier (also because there won't
		 * be an instance where you're running 2 versions of the same method 
		 * THE WAY IT WORKS , there's a class called GameMethods , its constructor recieves the Game object
		 * which is the main frame displaying content , and then when you click a button on the frame 
		 * it calls a method from the class GameMethods called EventHandler , it gives it an integer 
		 * indicating your position on the story grid and the method uses a switch case which has all 
		 * the scenarios and displays the one corresponding to the position you're in right now.
		 * SIMPLE VERSION OF EVENTHANDLER : you're on screen one which says 1111 , you click on it so you
		 * enter the method and give it the number 1 , case 1 displays 2222 and changes your current 
		 * position to 2 , so when you click the screen (which has 2222 on it) you go into the same 
		 * Eventhandler method and give it the number 2 , so it goes the case corresponding to 2 and 
		 * displays 3333 and so on and so forth . 
		 * 
		 * i'll try to implement the stuff i wrote today , test it real quick and go to sleep.
		 * 
		 * 
		 * 
		 * 
		 */
		//redundant code , some blocks could be useful in other contexts tho 
		/* opt1 = new JButton(new ImageIcon("E:\\Ahmed 2\\stories\\drawings\\game project\\344x96 button icon.png"));
		opt1.setVisible(false);
		opt1.setBorder(null);
		opt1.setContentAreaFilled(false);
		opt1.setBounds(61, 480, 344, 96);
		// this block changes the border colour when you hover over the button .
		// it basically adds a border and then removes it .
		opt1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				opt1.setBorder(new LineBorder(Color.decode("#4dd17c"), 4));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				opt1.setBorder(null);
			}
		});
		opt1Text = new JTextArea(8, 25);
		opt1Text.setEditable(true);
		opt1Text.setOpaque(true);
		opt1Text.setForeground(Color.decode("#4dd17c"));
//		opt1Text.append("is this working ?");
		Font optfont = new Font("Myriad Pro", Font.PLAIN, 5);
		opt1Text.setFont(optfont);
		opt1.setBounds(61, 480, 344, 96);
		opt1.add(opt1Text); 
		//
		//System.out.print("press 1 to hide the colorful frame.");
//Scanner inp = new Scanner(System.in);
//int i = inp.nextInt();
//if (i==5) {
//	charP.setVisible(false);
//}
//inp.close();
// this is a small piece of code to test that you can hide stuff from the panel 
// only problem is the frame doesn't load until you decide to hide it , but 
// now i know i can hide panels during runtime with events and stuff , hopefully this isn't stupid.
 * okay so this was stupid , but i got it working now 
 * 
 * this is the old start of the game (in the first screen method) , 
 * CharacterSays("You're looking Through a garbage can full of discarded disks \r\n"
				+ "At the bottom of the garbage can you find a copy of The Glass Pyramid.");
		SetFrame("images/blank screen.png");
 
 this code is a few dialogue trees (from the Eventhandler method).
 	switch (position) {
		case 1: {
			YourOptionsAre("play the game.", "throw it back into the garbage.");
			gPosition = 2;
			break;
		}
		case 2: {
//			SetFrame("images/title screen.png"); this is a line to test if buttons change the frame.
			CharacterSays("welcome to the glass pyramid\nBy : Ahmed ELsarta.");
			gPosition = 4;
			break;
		}
		case 3: {
			CharacterSays("To be honest you made a good decision , go make a better use of your time.\n"
					+ " you could go back and play it tho " + "or don't , it's a free country .");
			break;
		}
		case 4: {
			YourOptionsAre("Start a new game", "About the glass pyramid.");
			gPosition = 5;
			break;
		}

		case 6: {
			// this is the about section
			CharacterSays("the Glass pyramid is an interactive story project created by Ahmed Elsarta\n"
					+ "Directed by : Ahmed ELsarta. " + "Designed by : Ahmed ELsarta.\n"
					+ "Art Direction : Ahmed ELsarta." + "Lead programmer : Ahmed ELsarta.\n"
					+ "Assistant Programmer : Youseff Shaban.");
			gPosition = 7;
			break;
		}
		case 5: {
			CharacterSays("In the end it turned out it's easier to destroy the planet that to destroy capitalsim....\n"
					+ "In 2088 , all billionaires fucked off to space , leaving all of us normal folks"
					+ " to fend for ourselves against the Earth's vengeance , most of which they caused"
					+ " mind you , we were slowly dying civilization on a slowly dying planet.");
			gPosition = 7;
			break;
		}

		case 7: {
			CharacterSays("You'd think that would make us unite , forget our differences but no , some people"
					+ " still wanted to feel superior to others , somehow forgetting that they've all been used"
					+ " by the same people nonetheless."
					+ " There's a lot of factions now fighting over what little land is still habitable .\n"
					+ "Soon enough there'll be nothing left to fight for.");
			gPosition = 8;
			break;
		}
		case 8: {
			YourOptionsAre("Start your journey.");
			gPosition = 9;
			break;
		}
		case 9: {
			CharacterSays("You're a scavenger looking through a bin of discarded disks looking for something useful\n"
					+ "you find a shiny disk that has mysterious engravings on it .");
			gPosition = 10;
			break;
		}
		case 10: {
			YourOptionsAre("(Science) investigate the disk closer");
			gPosition = 11;
			break;
		}
		case 11: {
			CharacterSays("The disk looks important , like it's designed to resist being destroyed.\n"
					+ "it also glows in the dark which is super cool.");
			gPosition = 12;
			break;
		}
		case 12: {
			// choose which character to talk to.
			YourOptionsAre("go to elder Martin and show him the disk", "go to elder Blake and show him the disk",
					"go to Carlos (the scientist guy)");
			gPosition = 13;
			break;
		}

		case 13: {
			// talking to elder Martin (1)
			CharacterSays("Hello there , youngling , how can elder Martin help you Today ?");
			gPosition = 18;
			break;
		}
		case 18: {
			// talking to elder Martin (2)
			YourOptionsAre("can you tell me anything about this disk? <show cool disk>");
			gPosition = 19;
			break;
		}
		case 19: {
			// talking to elder Martin (3)
			CharacterSays("Hmm , yes , this Flocky disk was probably used to store some important stuff ,"
					+ " maybe there's technological information on this , yes."
					+ "You have to find a device that can read the contents of this disk.");
			gPosition = 20;
			break;
		}
		case 20: {
			// talking to elder Martin (4)
			YourOptionsAre("Talk : And where would a device like that be ?");
			gPosition = 21;
			break;
		}
		case 21: {
			// talking to elder Martin (5).
			CharacterSays("I really have no idea , you should probably talk to carlos , he would know "
					+ ", even tho he lacks confidence in his abilities. I have spoken.");
			gPosition = 22;
			break;
		}
		case 22: {
			// talking to elder Martin (6).
			YourOptionsAre("Go back to Carlos (the scientist guy)");
			gPosition = 15;
			break;
		}

		case 14: {
			// talking to elder Blake (1)
			CharacterSays("Hey there youngster , what can elder Blake do for you today?");
			gPosition = 23;
			break;
		}

		case 15: {
			// talking to carlos (1)
			CharacterSays("Hello there , find anything interesting?");
			gPosition = 16;
			break;
		}
		case 16: {
			// talking to carlos (2)
			YourOptionsAre("(Charisma) Talk : yeah , do you know anything about this disk?");
			gPosition = 17;
			break;
		}
		case 17: {
			// talking to Carlos (3)
			CharacterSays(
					"Hmmm , interesting , a Flocky disk , haven't seen something like this in real life before , it was used to store data before people had to move into the pyramid , no one under the age of 60 will even remember anything related to this thing , you should go talk to elder Blake or Elder Martin about it .");
			break;
		}
		}
		*/
	}

}
