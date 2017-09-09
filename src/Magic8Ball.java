
import java.util.Random;

import javax.swing.JOptionPane;
public class Magic8Ball {
	// Copyright Wintriss Technical Schools 2013
	


		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randy = new Random();
		// 3. Print out this variable
int Random = randy.nextInt(4);
		// 4. Get the user to enter a question for the 8 ball
String answer = JOptionPane.showInputDialog("Enter a question");
		// 5. If the random number is 0
if(Random == 0)
{
JOptionPane.showMessageDialog(null, "Yeah boi!");	
}
		// -- tell the user "Yes"

		// 6. If the random number is 1
if(Random == 1 )
{
	JOptionPane.showMessageDialog(null, "Naw");
}
		// -- tell the user "No"

		// 7. If the random number is 2
if(Random == 2)
{
	JOptionPane.showMessageDialog(null, "Ask Googly eyes");
}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
if(Random == 3)
{
	JOptionPane.showMessageDialog(null, "Ya have a brain, dontcha? whadda ya think?");
}
		// -- write your own answer

	}
}

