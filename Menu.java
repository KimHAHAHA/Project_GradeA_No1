import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener{
    private ProcessPM frameStart;
    private MovingImagesWithBackground Miwb;
    JPanel panelColor = new JPanel();
    JButton StartButtont = new JButton("Start");
    JButton AboutButtont = new JButton("About");
    JButton ExitButtont = new JButton("Exit");

    JLabel labelPm = new JLabel();

    public Menu(){
        setSize(1200, 800);
        setLocation(350, 60);
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
        StartButtont.setSize(350, 50);
        StartButtont.setLocation(420, 430);
        StartButtont.setFont(new Font("Arial", Font.BOLD,30));
        add(StartButtont);
        StartButtont.addActionListener(this);
    }

    //About
    void setAButtont()
    {
        AboutButtont.setSize(350, 50);
        AboutButtont.setLocation(420, 500);
        AboutButtont.setFont(new Font("Arial", Font.BOLD,30));
        add(AboutButtont);
        AboutButtont.addActionListener(this);
    }

    //Eixt
    void setEButtont()
    {
        ExitButtont.setSize(350, 50);
        ExitButtont.setLocation(420, 570);
        ExitButtont.setFont(new Font("Arial", Font.BOLD,30));
        add(ExitButtont);
        ExitButtont.addActionListener(this);
    }
    //Label PM 2.5
    void setlabelPm()
    {
        labelPm.setSize(1200, 300);
        labelPm.setLocation(480, 100);
        labelPm.setText("PM 2.5");
        labelPm.setFont(new Font("Arial",Font.BOLD,80));
    }

    boolean onButton = true;
    boolean offButton = false;
    //การเเสดงผลกดของเเต่ละปุ่ม
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == StartButtont) {
            //ถ้า window มองไม่เห็นจะให้เข้าเงื่อนไข    
            if (frameStart == null || !frameStart.isVisible()) {
                    frameStart = new ProcessPM();
                    frameStart.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    //เช็คปุ่มกำลังออก Start
                    frameStart.addWindowListener(new WindowAdapter() {
                        public void windowClosed(WindowEvent e){
                            StartButtont.setEnabled(onButton);
                        }
                    });
                    frameStart.setVisible(true);
                    StartButtont.setEnabled(offButton);
                }           
        }
        else if (e.getSource() == AboutButtont) {
            JFrame frameAbout = new JFrame();
            Miwb = new MovingImagesWithBackground();
            frameAbout.add(Miwb);
            frameAbout.setSize(1200, 800);
            frameAbout.setLocation(350, 60);
            frameAbout.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            //ถ้า window มองไม่เห็นจะให้เข้าเงื่อนไข 
            if (frameAbout == null || !frameAbout.isVisible()) {
                frameAbout.addWindowListener(new WindowAdapter() {
                    //เช็คปุ่มกำลังออกจาก about
                    public void windowClosed(WindowEvent e){
                        AboutButtont.setEnabled(onButton);
                    }
                });
            }
            frameAbout.setVisible(true);
            AboutButtont.setEnabled(offButton);    
        }
        else if (e.getSource() == ExitButtont) {
            System.exit(0);
        }
    }
    
}


