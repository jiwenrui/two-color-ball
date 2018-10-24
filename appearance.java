package gui;

import javax.swing.*;
import java.awt.*;
import functions.*;

public class Appearance {
	
        public  void placeComponents(JPanel panel){
        	//instance objects
	        TextFunctions g = new TextFunctions();
	        
	        panel.setLayout(null);						//make the layout manager empty
	        
	        
	        JLabel redLabel = new JLabel("red balls");
	        redLabel.setBounds(10,20,60,55);
	        panel.add(redLabel);
	        
	        JTextField redText = new JTextField(12);
	        //Modify this according to the rules of the two-color ball
	        redText.setBounds(80,20,410,55);
	        panel.add(redText);
	        
	        //Enter the number of red chromosphere numbers purchased
	        JLabel buleLabel = new JLabel("bule balls");
	        buleLabel.setBounds(510,20,60,55);
	        panel.add(buleLabel);
	        
	        JTextField buleText = new JTextField(12);
	        //Modify this according to the rules of the two-color ball
	        buleText.setBounds(580,20,160,55);
	        panel.add(buleText);
	        
	        JLabel redPrompt = new JLabel("choose six red ball from 1 to 33:"); 
	        redPrompt.setBounds(10,90,200,35);
	        panel.add(redPrompt);
	        redPrompt.setVisible(true);
	        
	        JTextField input = new JTextField("enter number here");
	        input.setBounds(205,90,120,35);
	        panel.add(input);
	        
	        JLabel bluePrompt = new JLabel("choose two blue ball from 1 to 16:");
	        bluePrompt.setBounds(10,90,200,35);
	        panel.add(bluePrompt);
	        bluePrompt.setVisible(false);
	        
	        
	        JTextField prizeText = new JTextField();
	        prizeText.setBounds(380,100,240,55);
	        panel.add(prizeText);
	        //g.prizeShow(prizeText);
	        
	        	                	        	        
	        //Enter the number of bule chromosphere numbers purchased
	        JButton beginButton = new JButton("start");
	        beginButton.setBounds(190,210,100,25);
	        panel.add(beginButton);
	        JButton stopButton = new JButton("stop");
	        stopButton.setBounds(320,210,100,25);
	        panel.add(stopButton);
	        JButton aboutButton = new JButton("statement");
	        aboutButton.setBounds(450,210,100,25);
	        panel.add(aboutButton);
    }
    public static void main(String [] args){
        JFrame.setDefaultLookAndFeelDecorated(true);//java style
        JFrame frame = new JFrame("Two-color ball automatic lottery machine");
        //make visible,base set
        frame.setVisible(true);
        frame.setSize(800,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        Appearance app = new Appearance();
        frame.add(panel);
        app.placeComponents(panel);
        
    }
}
