import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menu1 extends JFrame implements ActionListener{

    JPanel panelColor = new JPanel();
    JButton SButtont = new JButton("Start");
    JButton AButtont = new JButton("About");
    JButton EButtont = new JButton("Exit");

    JLabel labelPm = new JLabel();

    public menu1(){
        setSize(1200, 800);
        setLocation(0,0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    
        //kinkong
        ImageIcon kinkong = new ImageIcon("kinkong.png");
        JLabel labelPm2_5 = new JLabel(kinkong);
        labelPm2_5.setSize(350, 400);
        labelPm2_5.setLocation(40, 300);

        //godzira
        ImageIcon godzira = new ImageIcon("godzira.png");
        JLabel labeldino = new JLabel(godzira);
        labeldino.setSize(350, 400);
        labeldino.setLocation(800, 340);

        //PM
        ImageIcon immain = new ImageIcon("PM_2.5.png");
        JLabel main = new JLabel(immain);
        main.setSize(1200, 800);
        main.setLocation(0, 0);
        panelColor.add(main);

        //Background
        panelColor.setSize(1200, 800);
        panelColor.setLocation(0,0);

        setSButtont();
        setAButtont();
        setEButtont();
        setlabelPm();

        add(labelPm);
        add(labelPm2_5);
        add(labeldino);
        add(panelColor);
    }

    //Start
    public void setSButtont()
    {
        SButtont.setSize(350, 50);
        SButtont.setLocation(420, 430);
        SButtont.setFont(new Font("Arial", Font.BOLD,30));
        add(SButtont);
        SButtont.addActionListener(this);
    }

    //About
    void setAButtont()
    {
        AButtont.setSize(350, 50);
        AButtont.setLocation(420, 500);
        AButtont.setFont(new Font("Arial", Font.BOLD,30));
        add(AButtont);
        AButtont.addActionListener(this);
    }

    //Eixt
    void setEButtont()
    {
        EButtont.setSize(350, 50);
        EButtont.setLocation(420, 570);
        EButtont.setFont(new Font("Arial", Font.BOLD,30));
        add(EButtont);
        EButtont.addActionListener(this);
    }

    //Label PM 2.5
    void setlabelPm()
    {
        labelPm.setSize(1200, 300);
        labelPm.setLocation(480, 100);
        labelPm.setText("PM 2.5");
        labelPm.setFont(new Font("Arial",Font.BOLD,80));
    }

    //การเเสดงผลกดของเเต่ละปุ่ม
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SButtont) {
            JFrame frameStart = new JFrame();
            frameStart.setSize(1200, 800);
            frameStart.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frameStart.setVisible(true);
        }
        else if (e.getSource() == AButtont) {
            JFrame frameAbout = new JFrame();
            MovingImagesWithBackground Miwb = new MovingImagesWithBackground();
            frameAbout.add(Miwb);
            frameAbout.setSize(1200, 800);
            frameAbout.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frameAbout.setVisible(true);
            
        }
        else if (e.getSource() == EButtont) {
            System.exit(0);
        }
    }
    
}


