
//package ProjectOOP;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyStartmain {

    public static void main(String[] args) {

        MyStart myStart = new MyStart();
        myStart.setVisible(true);
    }
}

class MyStart extends JFrame {
    JPanel panelCenter = new JPanel();
    Pn_Rigth PnSide = new Pn_Rigth();
    Pn_South PnSouth = new Pn_South();
    Pn_ButtonCenter PnButton = new Pn_ButtonCenter();

    public MyStart() {
        setLocation(350, 60);
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setTitle("MENU");

        panelCenter.setLayout(null);
        panelCenter.setBackground(new Color(211, 211, 211));

        panelCenter.add(PnSouth.Panel_South());
        panelCenter.add(PnButton.PanelButton_Center());
        panelCenter.add(PnSide.Panel_Rigth());
        add(panelCenter, BorderLayout.CENTER);
    }
}