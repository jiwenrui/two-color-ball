package gui;

import javax.swing.*;


public class Appearance extends JFrame{

	//red balls and blue balls to prompt
	private JLabel redLabel = new JLabel("red balls");
	private JLabel blueLabel = new JLabel("bule balls");

	//prompt messages to guide user to enter
	private static JLabel prompt = new JLabel("choose six red ball from 1 to 33:");
	//input'text to let users input messages here
	private static JTextField input = new JTextField("enter number here");
	//prize mount will comes up here
	private JTextField prizeText = new JTextField();

	//three buttons
	private JButton beginButton = new JButton("submit");
	private JButton lotteryButton = new JButton("Lottery");
	private JButton statementButton = new JButton("statement");


	//to record times
	public static int times = 1;

	//seven balls numbers text, but here I defined eight JTextField, because I want to use "1-7" directly!
	public static JTextField[] ballsNumberText ={
			new JTextField(12),
			new JTextField(12),
			new JTextField(12),
			new JTextField(12),
			new JTextField(12),
			new JTextField(12),
			new JTextField(12),
			new JTextField(12),
	};

		//here is constructor
        public Appearance(){

			//serve as subcontainer
			JPanel panel = new JPanel();
			//make the layout manager empty
			panel.setLayout(null);

        	//red and blue labels' locations
	        redLabel.setBounds(10,20,60,55);
	        panel.add(redLabel);													//add it to container
			//Enter the number of red chromosphere numbers purchased
			blueLabel.setBounds(510,20,60,55);
			panel.add(blueLabel);

	        //these six are red balls
			ballsNumberText[1].setBounds(70,20,66,55);
	        panel.add(ballsNumberText[1]);
	        ballsNumberText[1].setEditable(false);									//内容不可更改
			ballsNumberText[2].setBounds(142,20,66,55);
			panel.add(ballsNumberText[2]);
			ballsNumberText[2].setEditable(false);									//内容不可更改
			ballsNumberText[3].setBounds(214,20,66,55);
			panel.add(ballsNumberText[3]);
			ballsNumberText[3].setEditable(false);									//内容不可更改
			ballsNumberText[4].setBounds(286,20,66,55);
			panel.add(ballsNumberText[4]);
			ballsNumberText[4].setEditable(false);									//内容不可更改
			ballsNumberText[5].setBounds(358,20,66,55);
			panel.add(ballsNumberText[5]);
			ballsNumberText[5].setEditable(false);									//内容不可更改
			ballsNumberText[6].setBounds(430,20,66,55);
			panel.add(ballsNumberText[6]);
			ballsNumberText[6].setEditable(false);									//内容不可更改

	        //blue balls
			ballsNumberText[7].setBounds(580,20,88,55);
	        panel.add(ballsNumberText[7]);
			ballsNumberText[7].setEditable(false);
			/*ballsNumberText[8].setBounds(652,20,66,55);
			panel.add(ballsNumberText[8]);
			ballsNumberText[8].setEditable(false);*/

			//here is prompt messages to let users know that you need to enter blue balls numbers
	        prompt.setBounds(10,90,200,35);
	        panel.add(prompt);

	        //importantly! the text to input. It is the soul of whole program
	        input.setBounds(205,90,120,35);
	        panel.add(input);

			//the location settings of prize mount
	        prizeText.setBounds(380,100,240,55);
	        panel.add(prizeText);

	        //three function buttons' locations
	        beginButton.setBounds(190,210,100,25);
	        panel.add(beginButton);
	        lotteryButton.setBounds(320,210,100,25);
	        panel.add(lotteryButton);
	        statementButton.setBounds(450,210,100,25);
	        panel.add(statementButton);

	        //create a window to contain JPanel
	        JFrame frame = this;
	        frame.setTitle("Two-color ball automatic lottery machine");							//title
	        JFrame.setDefaultLookAndFeelDecorated(true);											//java style

	        //make visible, base set
	        frame.setVisible(true);
	        frame.setSize(800,300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);																//can not adjust
			frame.setLocationRelativeTo(null);														//comes up on the center of screen

			//add JPanel
	        frame.add(panel);
    }

        //a set of functions to get units, and some are not used
		//public JPanel getPanel(){ return panel; }
	    public static JLabel getPrompt() {
	    	return prompt;
	    }

	    /*public JTextField getRedText1() { return ballsNumberText[1]; }
		public JTextField getRedText2() { return ballsNumberText[2]; }
		public JTextField getRedText3() { return ballsNumberText[3]; }
		public JTextField getRedText4() { return ballsNumberText[4]; }
		public JTextField getRedText5() { return ballsNumberText[5]; }
		public JTextField getRedText6() { return ballsNumberText[6]; }

	    public JTextField getBlueText1() { return ballsNumberText[1]; }
		public JTextField getBlueText2() { return ballsNumberText[2]; }*/

	    public static JTextField getInput() {
	    	return input;
	    }

	    public JTextField getPrizeText() {
	    	return prizeText;
	    }

	    public JButton getBeginButton() {
	    	return beginButton;
	    }
	    public JButton getLotteryButton() {
	    	return lotteryButton;
	    }
	    public JButton getStatementButton() {
	    	return statementButton;
	    }

}


