import com.sun.javafx.scene.control.TableColumnSortTypeWrapper;

import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.FlavorEvent;
import java.awt.event.*;

public class  H8simpleButton extends Applet {

    Button knop1;
    Button knop2;
    TextField tekstvak;
    Label label;
    String s;


    public void init(){
        tekstvak = new TextField("",30);
        add(tekstvak);
        knop1 = new Button("Ok");
        add(knop1);
        knop2 = new Button("Reset");
        add(knop2);
        label= new Label("Type iets in het tekstvak en druk op enter");
        add(label);
        knop1.addActionListener(new OkButtonActionListener());
        knop2.addActionListener(new resetKnopactionListener());
    }

    public void paint(Graphics graphics){

    }
    class resetKnopactionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            label.setText("");
            repaint();

        }
    }

    class OkButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            label.setText(s);
            repaint();
        }
    }
}
