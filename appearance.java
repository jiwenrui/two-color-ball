package gui;

import javax.swing.*;


public class Appearance {

	private JLabel redLabel = new JLabel("red balls");
	private JLabel blueLabel = new JLabel("bule balls");
    private static JTextField redText1 = new JTextField(12);			//这里的两个static是没办法了，笑哭
	private static JTextField redText2 = new JTextField(12);
	private static JTextField redText3 = new JTextField(12);
	private static JTextField redText4 = new JTextField(12);
	private static JTextField redText5 = new JTextField(12);
	private static JTextField redText6 = new JTextField(12);

	private static JTextField blueText1 = new JTextField(12);
	private static JTextField blueText2 = new JTextField(12);

	private  JLabel prompt = new JLabel("choose six red ball from 1 to 33:");
	private static JTextField input = new JTextField("enter number here");
	//private JLabel Prompt = new JLabel("choose two blue ball from 1 to 16:");
	private JTextField prizeText = new JTextField();

	private JButton beginButton = new JButton("start");
	private JButton stopButton = new JButton("stop");
	private JButton aboutButton = new JButton("statement");

		//这里我把构造方法重写了
        public Appearance(){

        	JPanel panel = new JPanel();
        	panel.setLayout(null);						//make the layout manager empty

	        redLabel.setBounds(10,20,60,55);
	        panel.add(redLabel);
			//Enter the number of red chromosphere numbers purchased
			blueLabel.setBounds(510,20,60,55);
			panel.add(blueLabel);

	        //Modify this according to the rules of the two-color ball
	        redText1.setBounds(70,20,66,55);
	        panel.add(redText1);
	        redText1.setEditable(false);			//内容不可更改
			redText2.setBounds(142,20,66,55);
			panel.add(redText2);
			redText2.setEditable(false);			//内容不可更改
			redText3.setBounds(214,20,66,55);
			panel.add(redText3);
			redText3.setEditable(false);			//内容不可更改
			redText4.setBounds(286,20,66,55);
			panel.add(redText4);
			redText4.setEditable(false);			//内容不可更改
			redText5.setBounds(358,20,66,55);
			panel.add(redText5);
			redText5.setEditable(false);			//内容不可更改
			redText6.setBounds(430,20,66,55);
			panel.add(redText6);
			redText6.setEditable(false);			//内容不可更改

	        //Modify this according to the rules of the two-color ball
	        blueText1.setBounds(580,20,66,55);
	        panel.add(blueText1);
	        blueText1.setEditable(false);
			blueText2.setBounds(652,20,66,55);
			panel.add(blueText2);
			blueText2.setEditable(false);

	        prompt.setBounds(10,90,200,35);
	        panel.add(prompt);

	        input.setBounds(205,90,120,35);
	        panel.add(input);

	        prizeText.setBounds(380,100,240,55);
	        panel.add(prizeText);
	        //funcTest.prizeShow(prizeText);

	        //Enter the number of bule chromosphere numbers purchased
	        beginButton.setBounds(190,210,100,25);
	        panel.add(beginButton);
	        stopButton.setBounds(320,210,100,25);
	        panel.add(stopButton);
	        aboutButton.setBounds(450,210,100,25);
	        panel.add(aboutButton);

	        JFrame frame = new JFrame("Two-color ball automatic lottery machine");
	        JFrame.setDefaultLookAndFeelDecorated(true);//java style

	        //make visible,base set
	        frame.setVisible(true);
	        frame.setSize(800,300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        frame.add(panel);
    }

        //得到组件的函数组
	    public  JLabel getPrompt() {
	    	return prompt;
	    }

	    public static JTextField getRedText1() {
	    	return redText1;
	    }
		public static JTextField getRedText2() {
			return redText2;
		}
		public static JTextField getRedText3() {
			return redText3;
		}
		public static JTextField getRedText4() { return redText4; }
		public static JTextField getRedText5() {
			return redText5;
		}
		public static JTextField getRedText6() {
			return redText6;
		}

	    public static JTextField getBlueText1() {
	    	return blueText1;
	    }
		public static JTextField getBlueText2() {
			return blueText2;
		}

	    public static JTextField getInput() {
	    	return input;
	    }



	    public JTextField getPrizeText() {
	    	return prizeText;
	    }

	    public JButton getBeginButton() {
	    	return beginButton;
	    }
	    public JButton getStopButton() {
	    	return stopButton;
	    }
	    public JButton getAboutButton() {
	    	return aboutButton;
	    }

}
