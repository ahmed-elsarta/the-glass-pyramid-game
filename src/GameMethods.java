import javax.swing.ImageIcon;

public class GameMethods extends Game {

	public GameMethods(Game game) {

	}

	// this is the script story.
	public static void EventHandler(int position) {
		// the way it works is that your position on the tree is noted by one variable ,
		// when you press
		// start your position is 1 when you click a certain option it changes your
		// position and displays
		// a different output.
		switch (position) {
		case 1: {
			SetFrame("images/title screen.png");
			YourOptionsAre("Start your adventure", "About the game.");
			gPosition = 2;
			break;
		}
		case 3: {
			CharacterSays("the Glass pyramid is an interactive story project created by Ahmed Elsarta\n"
					+ "Directed by : Ahmed ELsarta. " + "Designed by : Ahmed ELsarta.\n"
					+ "Art Direction : Ahmed ELsarta." + " Lead programmer : Ahmed ELsarta.\n"
					+ "Assistant Programmer : Youssef Shaaban.");
			gPosition = 1;
			break;
		}
		case 2: {
			SetFrame("images/2.png");
			CharacterSays("In the end it turned out it's easier to destroy the planet than to destroy capitalism....\n"
					+ "In 2088 , all billionaires fucked off to space , leaving all of us normal folks to fend for"
					+ " ourselves against the Earth's vengeance , most of which they caused mind you , we were a slowly"
					+ " dying civilization on a slowly dying planet.\n");
			gPosition = 4;
			break;
		}
		case 4: {
			SetFrame("images/4.png");
			CharacterSays("You'd think that would make us unite , forget our differences but no ,"
					+ " some people still wanted to feel superior to others , somehow forgetting that"
					+ " they've all been used by the same people nonetheless.\n"
					+ "There's a lot of factions now fighting over what little land is still habitable.\n"
					+ "Soon enough there'll be nothing left to fight for.\n");
			gPosition = 5;
			break;
		}
		case 5: {
			SetFrame("images/5.png");
			CharacterSays("You’re a scavenger looking through old tech-waste that was buried near your home,"
					+ " you find this shiny disk , it looks important , like it's designed to resist being"
					+ " destroyed , it also glows in the dark which is super cool.");
			gPosition = 6;
			break;
		}
		case 6: {
			// there's 3 dialogue branches here , two of them tell you to talk to carlos ,
			// but if you talk
			// to him first he doesn't seem sure that he knows.
			YourOptionsAre("Take it to Carlos the scientist", "Take it to elder Martin", "Take it to elder Blake");
			gPosition = 7;
			break;
		}

		case 9: {
			// this is the elder Blake dialogue tree.
			CharacterSays("Hello there , eldaer Blake at your service , what can i help you with?");
			gPosition = 19;
			break;
		}
		case 19: {
			YourOptionsAre("What can you tell me about this disk?");
			gPosition = 20;
			break;
		}
		case 20: {
			// end of elder Blake dialogue tree (or more like a branch , it's really small).
			CharacterSays("Well , to be honest i'm not really a Science guy , i'm more into old arts,"
					+ " more specifically the old art of movies, a screen where people do all sorts of silly"
					+ " acts, you'd better go talk to Carlos , he would know more about this than me.");
			gPosition = 6;
			break;
		}

		case 8: {
			// elder martin dialogue branch.
			CharacterSays("Hello there , what can elder martin do in this fine day ?");
			gPosition = 17;
			break;
		}
		case 17: {
			YourOptionsAre("What can you tell me about this disk?");
			gPosition = 18;
			break;
		}
		case 18: {
			// end of elder Martin dialogue branch
			CharacterSays("This looks like one of those old devices that were used to store media a long time ago"
					+ " ,that's basically all i know about it , you should talk to Carlos , he would"
					+ " know what to do even if he doesn't seem confident in his abilities\n" + " i have spoken.");
			gPosition = 6;
			break;
		}

		case 7: {
			// this is the Carlos dialogue tree (an actual tree) it's very big.
			CharacterSays("Hello there ,what did you find in that pile of garbage ?\n"
					+ "batteries ? coils ? how about some capacitors ? i could always use a good capacitor"
					+ " you know.");
			gPosition = 10;
			break;
		}
		case 10: {
			YourOptionsAre("well , i found this disk", "What would you use it for?");
			gPosition = 11;
			break;
		}
		case 12: {
			CharacterSays("well , there’s this radio i’ve been trying to fix , the speakers are working and all"
					+ " , it just needs one electrolytic capacitor to fix the receiver mechanism ,\n"
					+ "69 millifarads will do it , it reminds me of the old days when i lived with my parents in nevada.");
			gPosition = 13;
			break;
		}
		case 13: {
			YourOptionsAre("69 millifards , noted.", "And listen to what?");
			gPosition = 15;
			break;
		}
		case 15: {
			CharacterSays("That's really kind of you , now let’s take a look at your disk ….\n");
			gPosition = 11;
			break;
		}
		case 16: {
			CharacterSays("I am not quite sure there's still radio stations on , but it wouldn't hurt"
					+ " to try , no? maybe we will even hear from space , you never know.\n"
					+ "Now , let me take a look at this disk.");
			gPosition = 11;
			break;
		}
		case 11: {
			CharacterSays("Hmmm , interesting , a Flocky disk , haven't seen something like this in real life"
					+ " before , it was used to store data before people had to move into the pyramid , no one"
					+ " under the age of 60 will even remember anything related to this thing.");
			gPosition = 14;
			break;
		}
		case 14: {
			CharacterSays("We’ll need to find a working disk reader to access it, there's one at the Sun-sons"
					+ " fort and one at the constructors’ bunker, but since you don’t want to die we "
					+ "should probably head to the constructor’s bunker and play it safe.");
			gPosition = 22;
			break;
		}
		case 22: { // info screen ,
			YourOptionsAre("Tell me about those ... Sun-sons.", "Tell me about the constructors.",
					"What if i want to die?");
			gPosition = 23;
			break;
		}
		case 23: {
			// the sun-sons lore exposition (23 and 26)
			CharacterSays("The Sun-sons think of themselves as descendants of the sun god Ra’a , they"
					+ " think of the climate apocalypse was the sun’s wrath against the sinners , they"
					+ " also do a lot of weird cult shit like sacrificing people to the sun and stuff"
					+ " like that , and also they enslave people for some reason.");
			gPosition = 26;
			break;
		}
		case 26: {
			CharacterSays("That’s not even the main issue with them , the main issue is that they don’t"
					+ " accept outsiders wandering into their territory , so there’s an 85% chance they’ll"
					+ " kill us on sight , but that leaves a 15% chance they won’t and even then they could"
					+ " still kill us if they think of us as “sinners”.");
			gPosition = 28;
			break;
		}
		case 24: {
			// the constructors lore exposition (24 and 27)
			CharacterSays("The constructors are the remnants of the old world’s working class, they banded"
					+ " together after the world’s economies collapsed and vowed to rebuild the world in a"
					+ " way that would not cause another crisis , except that maybe they won’t have time to"
					+ " do that before we all die. I’m optimistic tho");
			gPosition = 27;
			break;
		}
		case 27: {
			CharacterSays("Getting them to let you use their disk reader is complex  , you’d have"
					+ " to to convince their leader that this disk isn’t some dangerous technology , which won’t"
					+ " be easy since they’re very strict about what sort of technology is ‘dangerous’ .");
			gPosition = 28;
			break;
		}
		case 25: {
			// mental health psa during climate change.
			CharacterSays(" Look , i’m sure living in the apocalypse is really affecting your mental health"
					+ " in a negative way and you should take a break from the whole thing if you feel like it."
					+ " Remember , it's not your fault that the world ended, it’s the oil companies fault and"
					+ " also -partially- the sun-sons fault .");
			gPosition = 22;
			break;
		}
		case 28: {
			YourOptionsAre("Let's go to the constructors.", "Let's head towards the Sun-sons.",
					"There's more i want to know");// the third option goes back one step in the tree.
			gPosition = 29;
			break;
		}
		case 31: {
			CharacterSays("Okay , what would you like to know ?");
			gPosition = 22;
			break;
		}
		case 30: {
			// confirm message for sun-sons route.
			CharacterSays("Are you sure you want to head to the crazy cultists? there’s still an 85%"
					+ " chance they’ll shoot to kill us on SIGHT , you know .");
			gPosition = 32;
			break;
		}
		case 32: {
			YourOptionsAre("Yes, let's go!!", "Let me think about it for a bit.");
			gPosition = 33;
			break;
		}
		case 34: {// you go back and can choose a different screen.
			CharacterSays("Sure , no problem , those cultists are going to turn us into Shawermas if "
					+ "they feel like it.");
			gPosition = 28;
			break;
		}
		case 33: {
			int sunSonsProb = (int) ((Math.random() * (100 - 0)) + 0);
			if (sunSonsProb <= 10) {
				CharacterSays("As you approach the walls of the Sun-sons camp you hear a loud scream"
						+ " in an unintelligable language , then you get shot by a poisoned arrow and"
						+ " die immediately.... GAME OVER.");
				gPosition = 1;
			} else {
				// sun-sons fort character tree.
				CharacterSays(
						"Hold there shadow, my name is Gunther , what are you doing here " + "on this fine sunny day?");
				gPosition = 35;
			}
			break;
		}
		case 35: {
			YourOptionsAre("I come in peace ,seeking only knowledge.", "I'm only here to use your disk reader.",
					"What do you mean by shadow?");
			gPosition = 36;
			break;
		}
		case 38: {
			CharacterSays("that’s what we call people who haven’t been enlightened by Ra’a the sun-god"
					+ " , destined to live in darkness and ignorance for all eternity. Sorry if that"
					+ " offends you but it's just the truth unfortunately .");
			gPosition = 35;
			break;
		}
		case 36: {
			CharacterSays("Well then rejoice shadow , for the sun enlightens our world with knowledge "
					+ "and wisdom today , and so I'm forbidden to pierce your heads with this sun-gun "
					+ "and ordered to help you.");
			gPosition = 39;
			break;
		}
		case 37: {
			CharacterSays("In any other day i would have pierced your heads with this Sun-gun , but today is "
					+ "the day of enlightenment where Ra'a blesses the earth , so I'm obligated to help you "
					+ "on your quest for knowledge");
			gPosition = 39;
			break;
		}
		case 39: {
			CharacterSays("I am not entirely sure who would be using the disk reader right now , but it’s"
					+ " either Senior Scribe Amenhotep or Ra’man, they’re both always looking for new disks"
					+ " to read , good luck , shadow.");
			gPosition = 40;
			break;
		}
		case 40: {
			// dialogue tree root (sun-sons fort)
			YourOptionsAre("Talk to Amenhotep.", "Talk to Ra'man.");
			gPosition = 41;
			break;
		}
		case 41: {
			CharacterSays("Hello there , my name is Amenhotep , Son of the great sun-god Ra’a , who blesses"
					+ " our world with knowledge today , don’t you agree , shadow?");
			gPosition = 43;
			break;
		}
		case 43: {
			YourOptionsAre("Can i just use your disk reader ?", "Why do you call yourself Amenhotep?");
			gPosition = 44;
			break;
		}

		case 44: {
			CharacterSays("well , of course you can , it’ the day of enlightenment after all , would"
					+ " you like to be enlightened about anything before using it ?");
			gPosition = 46;
			break;
		}
		case 46 :{
			YourOptionsAre("No,thanks , i'll just use it and be on my way"," i wanna know more, actually");
			gPosition = 47;
			break;
		}
		case 48 :{
			CharacterSays(" what would enlighten the shadow ?");
			gPosition=43;
			break;
		}
		
		case 42 : {//Ra'man dialogue tree
			CharacterSays("Hello there Shadow , what can great Elder Ra’man do for you on this"
					+ " great day of knowledge ?");
			gPosition=49;
			break;
		}
		case 49 :{
			YourOptionsAre("Can i use your disk reader ?","Why are you named Ra'man ?");
			gPosition = 50;
			break;
		}
		case 50 :{
			CharacterSays("Sure you can , on this blessed day all quests for knowledge must be aided"
					+ " , all our help must be given to anyone whether it be a shadow or a light.");
			gPosition = 47;
			break;
		}
		case 51 :{
			CharacterSays("Well , i’m glad you asked shadow , you see , when i was born the sun disappeared"
					+ " from the sky for a few minutes until i screamed my first cries in this world , which"
					+ " is how the tribe knew i was a son of Ra’a ");
			gPosition=52;
			break;
		}
		case 52 :{
			CharacterSays(" And then they looked at me closely and saw that i was to be a man so they"
					+ " decided to name me Ra’aman.");
			gPosition=53;
			break;
		}
		case 53 :{
			CharacterSays("........");
			gPosition=54;
			break;
		}
		case 54 :{
			CharacterSays(" And then i became an army commander at age sixteen and started the crusade to"
					+ " free this earth from sinners and shadows. And Oh was it glorious! "
					+ "We were fighting like 2 tribes per month , just completely cleansing the earth of "
					+ "them !");
			gPosition=55;
			break;
		}
		case 55 :{//end of Ra'man dialogue tree.
			CharacterSays("Sorry , i got carried away with the glories of my past , is there anything else"
					+ " you’d like to know ?");
			gPosition=49;
			break;
		}
		case 45 : {
			CharacterSays("Well , as you probably guessed by now we consider ourselves as descendants"
					+ " of the egyptian gods , each of us is named after a great deity from the era ,"
					+ " i was named after the great scientist Amenhotep , who was a really good car"
					+ " mechanic , and so was I.");
			gPosition=56;
			break;
		}
		case 56 : {
			CharacterSays("That was until we ran out of fuel and had to resort to riding slave-carriages"
					+ "...Oh , i forgot you’re a shadow for a moment ! slave-carriages are big cars powered"
					+ " by the concentrated power of slaves , but for some reason all the saddles"
					+ " were designed to fit much bigger people than us.");
			gPosition=57;
			break;
		}
		case 57 : {//end of Amenhotep branch
			CharacterSays("And for some reason they all had 4 legs , well , i guess we will never know…."
					+ " Anyways , is there anything else you want to know ?");
			gPosition=43;
			break;
		}
		
		case 29 :{//start of the constructors branch.
			CharacterSays("Okay so the good news is that they won’t shoot us on sight , the bad news"
					+ " is that they aren’t exactly friendly to outsiders , last i’ve heard .");
			break;
		}
		
		}
	}

	public static void CharacterSays(String speech) {
		// we start by clearing the textarea , i think.
		npcTalk.setText("");
		// First we hide the buttons
		charB1.setVisible(false);
		charB1T.setVisible(false);
		charB2T.setVisible(false);
		charB2.setVisible(false);
		charB3T.setVisible(false);
		charB3.setVisible(false);
		charB4T.setVisible(false);
		charB4.setVisible(false);
		// then we show the character speech panels and add
		charPT.setVisible(true);
		charP.setVisible(true);
		String con = " <click to continue>";
		typeWriter = new TypeWriter(npcTalk, speech + con);
		typeWriter.start();

	}

	// this method changes the screen frame.
	public static void SetFrame(String frameLocation) {
		// this method sets the frame on the screen to a certain frame
		// used to change scenes , maybe start with the title screen
		charImgFrame.setIcon(null);
		ImageIcon currentFrame = new ImageIcon(frameLocation);
		charImgFrame.setIcon(currentFrame);
	}

}
