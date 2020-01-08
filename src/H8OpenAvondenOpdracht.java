import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8OpenAvondenOpdracht extends Applet{
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int teller1;
    int teller2;
    int teller3;
    int teller4;
    int teller5;
    String schermtekst1;
    String schermtekst2;
    String schermtekst3;
    String schermtekst4;
    String schermtekst5;


    public void init() {
        setSize(400, 400);
        knop1 = new Button(" man  ");
        ManKnopListener ManKnopListener = new ManKnopListener();
        knop1.addActionListener( ManKnopListener );
        add(knop1);
        knop2 = new Button("vrouw ");
        VrouwKnopListener VrouwKnopListener = new VrouwKnopListener();
        knop2.addActionListener( VrouwKnopListener );
        add(knop2);
        knop3 = new Button("jongen");
        JongenKnopListener JongenKnopListener = new JongenKnopListener();
        knop3.addActionListener( JongenKnopListener );
        add(knop3);
        knop4 = new Button("meisje");
        MeisjeKnopListener MeisjeKnopListener = new MeisjeKnopListener();
        knop4.addActionListener( MeisjeKnopListener );
        add(knop4);
        teller1 = 0;
        teller2 = 0;
        teller3 = 0;
        teller4 = 0;
        teller5 = 0;
        schermtekst1= "";
        schermtekst2= "";
        schermtekst3= "";
        schermtekst4= "";
        schermtekst5= "";
    }
    public void paint(Graphics g) {
        g.drawString("Aantal mannen:" + teller1,50, 100);
        g.drawString("Aantal vrouwen:" + teller2,50, 150);
        g.drawString("aantal jongens:" + teller3,50, 200);
        g.drawString("Aantel meisjes:" + teller4,50, 250);
        g.drawString("Aantel mensen:" + teller5,50, 300);

    }
    class ManKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst1 = ""+ teller1++;
            schermtekst5 = ""+ teller5++;
            repaint();
        }
    }
    class VrouwKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst2 = ""+ teller2++;
            schermtekst5 = ""+ teller5++;
            repaint();
        }
    }
    class JongenKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst3 = ""+ teller3++;
            schermtekst5 = ""+ teller5++;
            repaint();
        }
    }
    class MeisjeKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst4 = ""+ teller4++;
            schermtekst5 = ""+ teller5++;
            repaint();
        }
    }
}