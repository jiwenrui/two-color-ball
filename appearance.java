package gui;

import javax.swing.*;
import java.awt.*;

public class Appearance {
        public static void placeComponents(JPanel panel){
        panel.setLayout(null);//make the layout manager empty
        
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
        frame.add(panel);
        placeComponents(panel);
        
    }
}
