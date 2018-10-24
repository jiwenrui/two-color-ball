package gui;

import javax.swing.*;

public class appearance {
        public static void placeComponents(JPanel panel){
        panel.setLayout(null);//make the layout manager empty
        JLabel redLabel = new JLabel("Please choice six red balls with the number between 1 to 33");
        redLabel.setBounds(10,20,390,25);
        panel.add(redLabel);
        JTextField redText = new JTextField(12);
        //Modify this according to the rules of the two-color ball
        redText.setBounds(400,20,165,25);
        panel.add(redText);
        //Enter the number of red chromosphere numbers purchased
        JLabel buleLabel = new JLabel("Please choice two bule balls with the number between 1 to 16");
        buleLabel.setBounds(10,60,390,25);
        panel.add(buleLabel);
        JTextField buleText = new JTextField(12);
        //Modify this according to the rules of the two-color ball
        buleText.setBounds(400,60,165,25);
        panel.add(buleText);
        //Enter the number of bule chromosphere numbers purchased
        JButton beginButton = new JButton("start");
        beginButton.setBounds(190,100,100,25);
        panel.add(beginButton);
        JButton stopButton = new JButton("stop");
        stopButton.setBounds(320,100,100,25);
        panel.add(stopButton);
        JButton aboutButton = new JButton("statement");
        aboutButton.setBounds(450,100,100,25);
        panel.add(aboutButton);
    }
    public static void main(String [] args){
        JFrame.setDefaultLookAndFeelDecorated(true);//java style
        JFrame frame = new JFrame("Two-color ball automatic lottery machine");
        frame.setSize(900,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
}
