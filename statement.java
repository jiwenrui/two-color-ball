package gui;

import javax.swing.*;
import java.awt.*;

public class statement {
    public void developers(JPanel panel){
        JLabel label = new JLabel("<html><body><p>developers: B17080513 jwr B17080522 sql B17080529 clf</p><br><p>time：2018-10-24</p><br><p>Contact information:824845410@qq.com<body></html>");
        label.setBounds(10,20,1000,1000);
        panel.add(label);
        //need a listener to make it connect with the button named statement
    }
}