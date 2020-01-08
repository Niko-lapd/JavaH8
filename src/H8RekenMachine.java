import javax.lang.model.element.NestingKind;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H8RekenMachine extends Applet{
    TextField eertsegetal;
    TextField tweedegetal;
    Button plus;
    Button min;
    Button delen;
    Button keer;
    Label label;




    @Override
    public void init() {
        setSize(500,300);
        eertsegetal = new TextField("", 20);
        tweedegetal = new TextField("", 20);
        plus = new Button("+");
        min = new Button("-");
        delen = new Button("/");
        keer = new Button("*");
        label= new Label("antwoord");
        add(eertsegetal);
        add(tweedegetal);
        add(plus);
        add(min);
        add(delen);
        add(keer);
        add(label);
        plus.addActionListener(new PlusActionlistener());
        min.addActionListener(new MinActionlistener());
        keer.addActionListener(new KeerActionlistener());
        delen.addActionListener(new DelenActionlistener());


    }
    @Override
    public void paint(Graphics g) {

    }
    class PlusActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String Numberone = eertsegetal.getText();
            String Numbertwo = tweedegetal.getText();
            Double result= Double.parseDouble(Numberone) + Double.parseDouble(Numbertwo);
            label.setText(""+ result);
            repaint();
        }
    }
    class MinActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String Numberone = eertsegetal.getText();
            String Numbertwo = tweedegetal.getText();
            Double result= Double.parseDouble(Numberone) - Double.parseDouble(Numbertwo);
            label.setText(""+ result);
            repaint();
        }
    }
    class KeerActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String Numberone = eertsegetal.getText();
            String Numbertwo = tweedegetal.getText();
            Double result= Double.parseDouble(Numberone) * Double.parseDouble(Numbertwo);
            label.setText(""+ result);
            repaint();
        }
    }
    class DelenActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String Numberone = eertsegetal.getText();
            String Numbertwo = tweedegetal.getText();
            Double result= Double.parseDouble(Numberone) / Double.parseDouble(Numbertwo);
            label.setText(""+ result);
            repaint();
        }
    }

}