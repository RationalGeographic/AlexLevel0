

	import java.util.Random;

	import javax.swing.JOptionPane;

	public class Validation {
		public static void main(String[] args) {

			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
			int randomNumber = new Random().nextInt(6);
			// 2. On paper, write all the numbers that get printed when you run this class
			System.out.println(randomNumber);

			// 3. Use the randomNumber to give the user a random compliment.
if(randomNumber == 0)
{
	JOptionPane.showMessageDialog(null, "Your face is the most original thing in the world");
}
else if(randomNumber == 1)
{
	JOptionPane.showMessageDialog(null, "You are a work of art");
}
else if(randomNumber == 2)
{
	JOptionPane.showMessageDialog( null, "Have you been working out?");
}
else if(randomNumber == 3)
{
	JOptionPane.showMessageDialog(null, "You are special and there is no one like you");
}
else if(randomNumber == 4)
{
	JOptionPane.showMessageDialog(null, "How did you get your eyes so ensnaring?");
}
else if(randomNumber == 5)
{
	JOptionPane.showMessageDialog(null, "Is your face hurting? 'Cause it's killing me!");
}
			// 4. Repeat all the code above 10 times
			// I think 5 is a good amount of compliments. After all we do not need them walking around like they're so special
			// 5. Find someone to test out your program. They will like it :)
		}
	}



