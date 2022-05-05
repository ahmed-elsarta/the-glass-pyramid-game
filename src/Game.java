import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Game {
	public JFrame mainF;
	// panels for stuff
	public JPanel titleP;

	public static JPanel charP;// these 2 for npc dialogue
	public static JPanel charPT;
	public static JPanel charImg; // this is for big image frame

	public static JPanel charB1;// these 2 for player dialogue
	public static JPanel charB1T;// first button
	public static JPanel charB2;// these 2 for player dialogue
	public static JPanel charB2T;// 2nd button
	public static JPanel charB3;// these 2 for npc dialogue
	public static JPanel charB3T;// third button
	public static JPanel charB4;// these 2 for npc dialogue
	public static JPanel charB4T;// third button
	// images are added to these labels
	public static JLabel backG; // the background image
	public static JLabel charSpeachFrame;// image for npc dialogue panel

	public static JLabel charImgFrame;// the big frame where the characters/events show

	public static JLabel buttonIcon;// img for the button icon

	public static JTextArea npcTalk;// text area where the npc speaks to the player.
	public static TypeWriter typeWriter;

	public static JTextArea opt1Text;// text area of the first button
	public static JTextArea opt2Text;// text area of the second button
	public static JTextArea opt3Text;// text area of the third button
	public static JTextArea opt4Text;// text area of the fourth button
	// Strings for button options
	public static String charFrameLocation;
	public static int gPosition = 1;

//this is the constructor for the game.
	public Game() {
		// creating the main frame , sizing it and also titling it .
		mainF = new JFrame("cool game , wow , so cool."); // game name
		mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainF.setSize(859, 757);
		mainF.setBackground(Color.black);
		mainF.setResizable(false);
		mainF.setLocation(350, 0); // location of frame on screen during first run.
		mainF.setLayout(null);
		mainF.setVisible(true);

		// the way the panels will work is that there's always 2 panels at all times .
		// one for when the players is speaking/choosing and one for when the character
		// speaks and the logic controller / script will run through a child class of
		// this
		// so we should prpbably make all the fields public .

		// the title panel , which holds only the background image .
		// this is the basic background that will exist for all screens / levels.
		ImageIcon mtFrame = new ImageIcon("images/845x720 blank f.png");
		backG = new JLabel("", mtFrame, JLabel.CENTER);
		backG.setBounds(0, 0, 845, 720);
		// (the image and stuff will be added to this panel).
		titleP = new JPanel();
		titleP.setSize(845, 780);
		titleP.setBackground(Color.black);
		titleP.add(backG);

		// character dialogue panel (background)
		// this should be added when the character is saying sth to the
		// just the background and not the text.
		charP = new JPanel();
		charP.setVisible(false);// this is the panel where the character's dialogue appears.
		charP.setOpaque(false);
		// here we load the image link .
		ImageIcon charFrame1 = new ImageIcon("images/722x176 character dialogue frame.png");
		charSpeachFrame = new JLabel("", charFrame1, JLabel.CENTER);
		charP.setBounds(61, 480, 722, 176);
		charP.add(charSpeachFrame);

		// this panel holds the text when the npc talks
		// text area called "npcTalk" and is located on top of the panel with the text
		// bg.

		npcTalk = new JTextArea(8, 45);
		npcTalk.setEditable(false);
		npcTalk.setOpaque(false);
		npcTalk.setForeground(Color.decode("#4dd16c"));
		npcTalk.append("");
		Font font = new Font("Myriad Pro", Font.PLAIN, 18);
		npcTalk.setFont(font);
		npcTalk.setLineWrap(true);
		npcTalk.setWrapStyleWord(true);
		// the block above is the text area which will be displayed .
		charPT = new JPanel();
		charPT.setVisible(false);// this is the panel where the character's dialogue appears.
		charPT.setOpaque(false);
		charPT.setBounds(61, 500, 722, 166);
		charPT.add(npcTalk);

		// this is a placeholder frame for the character's image and stuff
		// this should always be visible , maybe we could just switch the images during
		// runtime
		charFrameLocation = "images/674x393char img+ frm.png";
		charImg = new JPanel();
		charImg.setVisible(true);// this is the panel where the character's dialogue appears.
		ImageIcon charframe = new ImageIcon(charFrameLocation);
		charImgFrame = new JLabel("", charframe, JLabel.CENTER);
		charImg.setBounds(86, 55, 674, 405);
		charImg.setOpaque(false);
		charImg.add(charImgFrame);
		npcTalk.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// code for 1st button.
				typeWriter.stop();
				GameMethods.EventHandler(gPosition);
			}});

		// the four buttons here will be the four choices , during runtime the script
		// class
		// will modify their texts according to the story .

// FIRST OPTION/BUTTON (first row) .(it'll basically be a clickable panel.)

		// this panel holds the background icon(Jlabel buttonIcon1)
		charB1 = new JPanel();
		charB1.setVisible(false);// this is the panel where the character's dialogue appears.
		charB1.setOpaque(false);
		// here we load the image link .
		ImageIcon buttonImg = new ImageIcon("images/344x96 button icon.png");
		buttonIcon = new JLabel("", buttonImg, JLabel.CENTER);
		charB1.setBounds(61, 480, 344, 100);
		charB1.add(buttonIcon);

		// this panel holds the text for the first button.
		// text area called "opt1Text" and is located on top of the background panel
		opt1Text = new JTextArea(2, 23);
		opt1Text.setLineWrap(true);
		opt1Text.setEditable(false);
		opt1Text.setOpaque(false);
		opt1Text.setLineWrap(true);
		opt1Text.setWrapStyleWord(true);
		opt1Text.setForeground(Color.decode("#4dd16c"));
		opt1Text.append("");
		Font font2 = new Font("Myriad Pro", Font.PLAIN, 17);
		opt1Text.setFont(font2);
		// the block above is the text area which will be displayed .
		charB1T = new JPanel();
		charB1T.setVisible(false);// this is the panel where the character's dialogue appears.
		charB1T.setOpaque(false);
		charB1T.setBounds(61, 495, 330, 100);
		charB1T.add(opt1Text);
		opt1Text.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// code for 1st button.
				GameMethods.EventHandler(gPosition);
			}});

// SECOND BUTTON (top right button)

		// this panel holds the background icon(Jlabel buttonIcon)
		charB2 = new JPanel();
		charB2.setVisible(false);// this is the panel where the character's dialogue appears.
		charB2.setOpaque(false);
		// we'll just use the
		buttonIcon = new JLabel("", buttonImg, JLabel.CENTER);
		charB2.setBounds(440, 480, 344, 100);
		charB2.add(buttonIcon);
		// this panel holds the text for the first button.
		// text area called "opt1Text" and is located on top of the background panel
		opt2Text = new JTextArea(2, 23);
		opt2Text.setLineWrap(true);
		opt2Text.setEditable(false);
		opt2Text.setOpaque(false);
		opt2Text.setLineWrap(true);
		opt2Text.setWrapStyleWord(true);
		opt2Text.setForeground(Color.decode("#4dd16c"));
		opt2Text.append("");
		// we'll also use the same font as the other button.
		opt2Text.setFont(font2);
		// the block above is the text area which will be displayed .
		charB2T = new JPanel();
		charB2T.setVisible(false);// this is the panel where the character's dialogue appears.
		charB2T.setOpaque(false);
		charB2T.setBounds(440, 495, 330, 100);
		charB2T.add(opt2Text);
		opt2Text.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// code for 2nd button.
				GameMethods.EventHandler(gPosition + 1);
				}});

// THIRD BUTTON (BOTTOM LEFT BUTTON)
		// this panel holds the background icon(Jlabel buttonIcon)
		charB3 = new JPanel();
		charB3.setVisible(false);// this is the panel where the character's dialogue appears.
		charB3.setOpaque(false);
		// we'll just use the
		buttonIcon = new JLabel("", buttonImg, JLabel.CENTER);
		charB3.setBounds(61, 580, 344, 100);
		charB3.add(buttonIcon);
		// this panel holds the text for the first button.
		// text area called "opt1Text" and is located on top of the background panel
		opt3Text = new JTextArea(2, 23);
		opt3Text.setLineWrap(true);
		opt3Text.setEditable(false);
		opt3Text.setOpaque(false);
		opt3Text.setLineWrap(true);
		opt3Text.setWrapStyleWord(true);
		opt3Text.setForeground(Color.decode("#4dd16c"));
		opt3Text.append("");
		// we'll also use the same font as the other button.
		opt3Text.setFont(font2);
		// the block above is the text area which will be displayed .
		charB3T = new JPanel();
		charB3T.setVisible(false);// this is the panel where the character's dialogue appears.
		charB3T.setOpaque(false);
		charB3T.setBounds(61, 595, 330, 100);
		charB3T.add(opt3Text);
		opt3Text.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// code for 3rd button.
				GameMethods.EventHandler(gPosition + 2);
				}});

//FOURTH BUTTON (BOTTOM RIGHT BUTTON) 

		// this panel holds the background icon(Jlabel buttonIcon)
		charB4 = new JPanel();
		charB4.setVisible(false);// this is the panel where the character's dialogue appears.
		charB4.setOpaque(false);
		// we'll just use the
		buttonIcon = new JLabel("", buttonImg, JLabel.CENTER);
		charB4.setBounds(440, 580, 344, 100);
		charB4.add(buttonIcon);
		// this panel holds the text for the first button.
		// text area called "opt1Text" and is located on top of the background panel
		opt4Text = new JTextArea(2, 23);
		opt4Text.setLineWrap(true);
		opt4Text.setEditable(false);
		opt4Text.setOpaque(false);
		opt4Text.setLineWrap(true);
		opt4Text.setWrapStyleWord(true);
		opt4Text.setForeground(Color.decode("#4dd16c"));
		opt4Text.append("");
		// we'll also use the same font as the other button.
		opt4Text.setFont(font2);
		// the block above is the text area which will be displayed .
		charB4T = new JPanel();
		charB4T.setVisible(false);// this is the panel where the character's dialogue appears.
		charB4T.setOpaque(false);
		charB4T.setBounds(440, 595, 330, 100);
		charB4T.add(opt4Text);
		opt4Text.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// code for 4th button.
				GameMethods.EventHandler(gPosition + 3);
			}});

		// layout stuff the way it works is that we add the stuff at the top first , final thing is
		// the background , the buttons and npc dialgoue box are hidden by default
		// and are only shown when they're being used.

		// this line is the frame where characters appear
		mainF.add(charImg);
		// these 2 lines are the npc text bubble/frame
		mainF.add(charPT);
		mainF.add(charP);

		// this is the buttons
		mainF.add(charB1T);// the text layer (panel)
		mainF.add(charB1);// the icon layer(panel)

		mainF.add(charB2T);// the text layer (panel)
		mainF.add(charB2);// the icon layer(panel)

		mainF.add(charB3T);// the text layer (panel)
		mainF.add(charB3);// the icon layer(panel)

		mainF.add(charB4T);// the text layer (panel)
		mainF.add(charB4);// the icon layer(panel)
		// this line shows the background at the very bottom , must be the last layout
		// line,
		mainF.add(titleP);

		System.out.println("Game has launched , yay.");
	}
	
	// for when we wanna show 4 options
	public static void YourOptionsAre(String op1, String op2, String op3, String op4) {
		// we hide the character speech panel
		charPT.setVisible(false);
		charP.setVisible(false);
		// then we show the buttons
		charB1T.setVisible(true);
		charB1.setVisible(true);
		charB2T.setVisible(true);
		charB2.setVisible(true);
		charB3T.setVisible(true);
		charB3.setVisible(true);
		charB4T.setVisible(true);
		charB4.setVisible(true);
		// then we set the options accordingly .
		opt1Text.setText(" " + op1);
		opt2Text.setText(" " + op2);
		opt3Text.setText(" " + op3);
		opt4Text.setText(" " + op4);
	}

    //for when we wanna show 3
	public static void YourOptionsAre(String op1, String op2, String op3) {
		// we hide the character speech panel
		charPT.setVisible(false);
		charP.setVisible(false);
		// then we show the buttons
		charB1T.setVisible(true);
		charB1.setVisible(true);
		charB2T.setVisible(true);
		charB2.setVisible(true);
		charB3T.setVisible(true);
		charB3.setVisible(true);

		// then we set the options accordingly .
		opt1Text.setText(" " + op1);
		opt2Text.setText(" " + op2);
		opt3Text.setText(" " + op3);
	}
    //for when we wanna show 2 options 
	public static void YourOptionsAre(String op1, String op2) {
		// we hide the character speech panel
		charPT.setVisible(false);
		charP.setVisible(false);
		// then we show the buttons
		charB1T.setVisible(true);
		charB1.setVisible(true);
		charB2T.setVisible(true);
		charB2.setVisible(true);
		// then we set the options accordingly .
		opt1Text.setText(" " + op1);
		opt2Text.setText(" " + op2);
	}
    // i think you get the point by now.
	public static void YourOptionsAre(String op1) {
		// we hide the character speech panel
		charPT.setVisible(false);
		charP.setVisible(false);
		// then we show the buttons
		charB1T.setVisible(true);
		charB1.setVisible(true);
		// then we set the options accordingly .
		opt1Text.setText(" " + op1);
	}

	// this method works now !!!
	public void FirstScreen() {
			// okay this is the script for the game , we'll just do it this way because why not?
			GameMethods.SetFrame("images/title screen.png");
			GameMethods.CharacterSays("Welcome to the Glass pyramid.");

		}
	
}
