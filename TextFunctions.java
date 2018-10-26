package functions;

import gui.PrizePrompt;
import javax.swing.*;

public class TextFunctions {

	public void prizeShow(JTextField myJtext) {
		// TODO Auto-generated method stub
		//here use "Double" class, to make it more humanize
		Double prize = Math.random() *1e10;
		myJtext.setText("now prize is " +"￥" + prize.longValue());
		//no editable
		myJtext.setEditable(false);
	}

	public void lotteryButton() {
		// TODO Auto-generated method stub
		new PrizePrompt();
	}

	public void stopButton() {
		// TODO Auto-generated method stub
	}

	public void setInputData(JTextField myJtext,String input) {
		// TODO Auto-generated method stub
			myJtext.setText(input);
	}
	
	public void resetInput(JTextField myJtext) {
		myJtext.setText("");
	}

	public static void setInputLocked(JTextField myJtext){
		myJtext.setEnabled(false);
		myJtext.setText("finish");
	}

	public static void changePrompt(JLabel prompt) {
		prompt.setText("choose two blue ball from 1 to 16:");
	}

}
