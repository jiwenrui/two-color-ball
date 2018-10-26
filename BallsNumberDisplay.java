package functions;

import gui.Alerm;
import gui.Appearance;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is the soul of the whole program
public class BallsNumberDisplay implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        //create a object of TextFunctions
        TextFunctions tf = new TextFunctions();

        //to save the data users input
        String input =  ae.getActionCommand().toString();

        //set the balls numbers text
        tf.setInputData( Appearance.ballsNumberText[Appearance.times], input);

        //initialize the input text
        tf.resetInput(Appearance.getInput());

        //display the red and blue ball numbers dynamically
        while (true) {
            if (Appearance.ballsNumberText[Appearance.times].getText().matches("[0-9]+")) {
                int digit = Integer.parseInt(Appearance.ballsNumberText[Appearance.times].getText());
                if(Appearance.times <= 7) {
                    if (digit < 0 || digit > 33){
                        new Alerm();
                        break;
                    }
                }
                if(Appearance.times >= 7){
                    if (digit < 0 || digit > 16){
                        new Alerm();
                        break;
                    }
                }
                Appearance.times++;
                break;
            } else {
                //if users do not input digit, prompt him/her to input again
                new Alerm();
                break;
            }
        }
        //red balls input over, begin to input blue balls, and then prompt label converts
        if(Appearance.times == 7)
            TextFunctions.changePrompt(Appearance.getPrompt());
        //all the balls numbers are input, locked the input text in case that users operate by mistake
        if(Appearance.times == 8)
            TextFunctions.setInputLocked(Appearance.getInput());
    }
}

