package gui;

import javax.swing.*;

import functions.*;

public class Appearance {
	JLabel redLabel = new JLabel("red balls");
    static JTextField redText = new JTextField();			//这里的两个static是没办法了，笑哭
	JLabel blueLabel = new JLabel("bule balls");
	JTextField blueText = new JTextField(12);
	JLabel redPrompt = new JLabel("choose six red ball from 1 to 33:");
	static JTextField input = new JTextField("enter number here");
	JLabel bluePrompt = new JLabel("choose two blue ball from 1 to 16:");
	JTextField prizeText = new JTextField();
	 
	JButton beginButton = new JButton("start");
	JButton stopButton = new JButton("stop");
	JButton aboutButton = new JButton("statement");
	
		//这里我把构造方法重写了
        public Appearance(){				
        	
        	JPanel panel = new JPanel();
        	panel.setLayout(null);						//make the layout manager empty
	        
	        redLabel.setBounds(10,20,60,55);
	        panel.add(redLabel);
	        
	        //Modify this according to the rules of the two-color ball
	        redText.setBounds(80,20,410,55);
	        panel.add(redText);
	        redText.setEditable(false);			//内容不可更改
	        
	        //funcTest.displayBallNumbers(redText);
	        
	        //Enter the number of red chromosphere numbers purchased
	        blueLabel.setBounds(510,20,60,55);
	        panel.add(blueLabel);
	        
	        //Modify this according to the rules of the two-color ball
	        blueText.setBounds(580,20,160,55);
	        panel.add(blueText);
	        blueText.setEditable(false);
	        
	        redPrompt.setBounds(10,90,200,35);
	        panel.add(redPrompt);
	        //the one visible, the another one is not visible
	        redPrompt.setVisible(true);
	        
	        input.setBounds(205,90,120,35);
	        panel.add(input);
	        //add listener
	       //input.addActionListener(new JtextHandler());
	        // funcTest.getInputData(input);
	        
	        bluePrompt.setBounds(10,90,200,35);
	        panel.add(bluePrompt);
	        bluePrompt.setVisible(false);
	        
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
	    public JLabel getRedPrompt() {
	    	return redPrompt;
	    }
	    public JLabel getBluePrompt() {
	    	return bluePrompt;
	    }
	    
	    public static JTextField getRedText() {
	    	return redText;
	    }
	    public JTextField getBlueText() {
	    	return blueText;
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
	    
	    //测试的主函数
	    public static void main(String [] args){
	    	TextFunctions funcTest = new TextFunctions();
	    	
	        Appearance app = new Appearance();
	        
	        JtextHandler testHandler = new JtextHandler();
	        
	        //监听两个text，不过现在运行会报错，函数在我这边，所以我把这两个注释了
	        //app.getInput().addActionListener(testHandler);
	        //app.getRedText().addActionListener(testHandler);
	        //funcTest.prizeShow(myJtext);
	        
	        
	        //app.placeComponents(panel);
	        //test
	        //System.out.println(testHandler.getInputData());
	        
	    }
}



