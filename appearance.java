package gui;

import javax.swing.*;

import functions.*;

public class Appearance {
	//instance objects
	TextFunctions g = new TextFunctions();
	JLabel redLabel = new JLabel("red balls");
    JTextField redText = new JTextField(12);
	JLabel buleLabel = new JLabel("bule balls");
	JTextField buleText = new JTextField(12);
	JLabel redPrompt = new JLabel("choose six red ball from 1 to 33:");
	JTextField input = new JTextField("enter number here");
	JLabel bluePrompt = new JLabel("choose two blue ball from 1 to 16:");
	JTextField prizeText = new JTextField();
	 
	JButton beginButton = new JButton("start");
	JButton stopButton = new JButton("stop");
	JButton aboutButton = new JButton("statement");
        public Appearance(JPanel panel){
        	panel.setLayout(null);						//make the layout manager empty
	        
	        redLabel.setBounds(10,20,60,55);
	        panel.add(redLabel);
	        
	        //Modify this according to the rules of the two-color ball
	        redText.setBounds(80,20,410,55);
	        panel.add(redText);
	        //g.displayBallNumbers(redText);
	        
	        //Enter the number of red chromosphere numbers purchased
	        buleLabel.setBounds(510,20,60,55);
	        panel.add(buleLabel);
	        
	        //Modify this according to the rules of the two-color ball
	        buleText.setBounds(580,20,160,55);
	        panel.add(buleText);
	        
	        redPrompt.setBounds(10,90,200,35);
	        panel.add(redPrompt);
	        redPrompt.setVisible(true);
	        
	        input.setBounds(205,90,120,35);
	        panel.add(input);
	        input.addActionListener(new JtextHandler());
	        // g.getInputData(input);
	        
	        bluePrompt.setBounds(10,90,200,35);
	        panel.add(bluePrompt);
	        bluePrompt.setVisible(false);
	        
	        prizeText.setBounds(380,100,240,55);
	        panel.add(prizeText);
	        g.prizeShow(prizeText);
	        	                	        	        
	        //Enter the number of bule chromosphere numbers purchased
	        beginButton.setBounds(190,210,100,25);
	        panel.add(beginButton);
	        
	        stopButton.setBounds(320,210,100,25);
	        panel.add(stopButton);
	        
	        aboutButton.setBounds(450,210,100,25);
	        panel.add(aboutButton);
	        
	        JFrame.setDefaultLookAndFeelDecorated(true);//java style
	        JFrame frame = new JFrame("Two-color ball automatic lottery machine");
	        
	        //make visible,base set
	        frame.setVisible(true);
	        frame.setSize(800,300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        
	        frame.add(panel);
    }
    public static void main(String [] args){
    	JPanel panel = new JPanel();
        Appearance app = new Appearance(panel);
        
        JtextHandler testHandler = new JtextHandler();
        //app.placeComponents(panel);
        //test
        //System.out.println(testHandler.getInputData());
        
    }
}
