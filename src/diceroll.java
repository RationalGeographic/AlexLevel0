

	package learning_random;

	import java.awt.Dimension;
	import java.awt.image.BufferedImage;
	import java.io.IOException;
	import java.util.Random;

	import javax.imageio.ImageIO;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class diceroll{
		JFrame window = new JFrame("Roll the Dice!");
		JPanel panel = new JPanel();
		JButton rollButton = new JButton("CLICK HERE TO ROLL");
		JLabel label = new JLabel();
		
		BufferedImage oneImg;
		BufferedImage twoImg;
		BufferedImage threeImg;
		BufferedImage fourImg;
		BufferedImage fiveImg;
		BufferedImage sixImg;
		
		public void run(){
			try {
				oneImg = ImageIO.read(this.getClass().getResourceAsStream("http://www.kidsmathgamesonline.com/images/pictures/numbers600/number1.jpg"));
				twoImg = ImageIO.read(this.getClass().getResourceAsStream("http://pngimg.com/uploads/number2/Number%202%20PNG%20images%20free%20download_PNG14949.png"));
				threeImg = ImageIO.read(this.getClass().getResourceAsStream("http://www.clker.com/cliparts/x/B/x/Y/R/L/number-3-hi.png"));
				fourImg = ImageIO.read(this.getClass().getResourceAsStream("https://www.brainz.org/wp-content/uploads/2017/06/4-1.png"));
				fiveImg = ImageIO.read(this.getClass().getResourceAsStream("http://www.clker.com/cliparts/D/T/x/K/i/d/orange-5-md.png"));
				sixImg = ImageIO.read(this.getClass().getResourceAsStream("https://thetomatos.com/wp-content/uploads/2016/05/6-cliparts-2.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			label.setIcon(new ImageIcon(oneImg));
			
			rollButton.addActionListener((e)->{
				
				//1. Make randomChoice equal to a random number between 1 and 6
				int randomChoice = 0;
				
				
				//2. Fix the code below so that it displays the correct image
				if(randomChoice == 0){
					label.setIcon(new ImageIcon(oneImg));
				}else if(randomChoice == 0){
					label.setIcon(new ImageIcon(twoImg));
				}else if(randomChoice == 0){
					label.setIcon(new ImageIcon(threeImg));
				}
				else if(randomChoice == 0){
					label.setIcon(new ImageIcon(fourImg));
				}
				else if(randomChoice == 0){
					label.setIcon(new ImageIcon(fiveImg));
				}
				else{
					label.setIcon(new ImageIcon(sixImg));
				}
			});
			
			panel.setPreferredSize(new Dimension(700, 700));
			panel.add(rollButton);
			panel.add(label);
			window.add(panel);
			window.setVisible(true);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
		}
		
		public static void main(String[] args) {
			new diceroll().run();
		}
	}

