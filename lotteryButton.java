package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lotteryButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextFunctions tf = new TextFunctions();
        tf.lotteryButton();
    }
}
