import functions.BallsNumberDisplay;
import functions.StatementButton;
import functions.TextFunctions;
import functions.lotteryButton;
import gui.Appearance;

public class Main {
    public static void main(String [] args){
        //create a object of  class TextFunctions
        TextFunctions funcTest = new TextFunctions();

        //create a object of Appearance
        Appearance app = new Appearance();
        //listener and handler
        BallsNumberDisplay displayer = new BallsNumberDisplay();

        //show up prize mount
        funcTest.prizeShow(app.getPrizeText());

        //listen Lottery and statement
        app.getStatementButton().addActionListener(new StatementButton());
        app.getLotteryButton().addActionListener(new lotteryButton());

        //listen input text
        Appearance.getInput().addActionListener(displayer);
    }
}
