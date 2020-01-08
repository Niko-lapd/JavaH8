import sun.util.resources.cldr.teo.CalendarData_teo_KE;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H8BTWOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    double a;
    double b;
    double uitkomst;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        a= 100;
        b= 121;


    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+ (getal/a) * b, 50, 50 );

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}