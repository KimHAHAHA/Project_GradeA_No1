
//package ProjectOOP;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyStart {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
        System.out.println("888");
    }
}

class MyFrame extends JFrame {
    JPanel panelCenter = new JPanel();
    JPanel panelButtonCenter = new JPanel();
    JPanel panelRigth = new JPanel();
    JPanel panelSouth = new JPanel();
    JButton[][] BtnCenter = new JButton[10][20];

    public MyFrame() {
        setLocation(350, 60);
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("MENU");

        panelCenter.setLayout(null);
        panelCenter.setBackground(new Color(211, 211, 211));

        panelCenter.add(panelRigth);
        panelCenter.add(panelSouth);
        panelCenter.add(panelButtonCenter);
        add(panelCenter, BorderLayout.CENTER);

        PanelButton_Center();
        MyIcon();
        Panel_South();
        Panel_Rigth();

    }

    public void PanelButton_Center() {

        panelButtonCenter.setSize(800, 500);
        panelButtonCenter.setLocation(5, 5);
        panelButtonCenter.setLayout(new GridLayout(10, 20));
        panelButtonCenter.setBackground(new Color(170, 170, 170));

        for (int i = 0; i < BtnCenter.length; i++) {
            for (int j = 0; j < BtnCenter[i].length; j++) {
                BtnCenter[i][j] = new JButton();
                panelButtonCenter.add(BtnCenter[i][j]);
            }
        }
    }

    public void MyIcon() {

        ImageIcon icon0 = new ImageIcon("Screenshot 2024-07-26 165047.png");
        JButton BtnWt_Real = new JButton(icon0) {
            protected void paintComponent(Graphics g) {
                g.drawImage(icon0.getImage(), 0, 0, 150, 100, this);
            }
        };
        BtnWt_Real.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Real");
            }
        });
        BtnWt_Real.setSize(150, 100);
        BtnWt_Real.setLocation(800, 70);
        BtnWt_Real.setBorderPainted(false);// ตั้งค่าไม่ให้แสดงพื้นหลัง
        BtnWt_Real.setContentAreaFilled(false);
        BtnWt_Real.setFocusPainted(false);

        ImageIcon icon1 = new ImageIcon("Screenshot 2024-07-26 183342.png");
        JButton BtnWt_Fake = new JButton(icon1);
        BtnWt_Fake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                System.out.println("Fake");
            }
        });
        BtnWt_Fake.setSize(160, 100);
        BtnWt_Fake.setLocation(970, 70);
        BtnWt_Fake.setBorderPainted(false);// ตั้งค่าไม่ให้แสดงพื้นหลัง
        BtnWt_Fake.setContentAreaFilled(false);
        BtnWt_Fake.setFocusPainted(false);

        ImageIcon emoji0 = new ImageIcon("Screenshot 2024-07-26 191313.png");
        JLabel em = new JLabel(emoji0);
        em.setSize(100, 50);
        em.setLocation(0, 205);
        JLabel em1 = new JLabel(emoji0);
        em1.setSize(100, 50);
        em1.setLocation(270, 460);

        panelSouth.add(BtnWt_Real);
        panelSouth.add(BtnWt_Fake);
        panelSouth.add(em);
        panelRigth.add(em1);
    }

    public void Panel_South() {

        panelSouth.setSize(1200, 390);
        panelSouth.setLocation(0, 510);
        panelSouth.setLayout(null);
        panelSouth.setBackground(new Color(190, 190, 190));

        JButton BtnFile = new JButton("SELECT");
        JButton BtnRandom = new JButton("RANDOM");
        JButton BtnSetInput = new JButton("CONFIRM");
        TextField textInput = new TextField();
        TextField textNameFile = new TextField();
        TextField textRandom1 = new TextField();
        TextField textRandom2 = new TextField();

        JLabel textF = new JLabel("INPUT FILE");
        JLabel textS = new JLabel("INPUT PROPULATION");
        JLabel textR = new JLabel("INPUT NUMBER RANDOM");

        BtnFile.setSize(200, 50);
        BtnFile.setLocation(50, 130);
        BtnFile.setFont(new Font("Tahoma", Font.BOLD, 14));
        BtnFile.setBackground(new Color(211, 211, 211));

        BtnRandom.setSize(200, 50);
        BtnRandom.setLocation(550, 130);
        BtnRandom.setFont(new Font("Tahoma", Font.BOLD, 14));
        BtnRandom.setBackground(new Color(211, 211, 211));

        BtnSetInput.setSize(200, 50);
        BtnSetInput.setLocation(300, 130);
        BtnSetInput.setFont(new Font("Tahoma", Font.BOLD, 14));
        BtnSetInput.setBackground(new Color(211, 211, 211));

        textInput.setSize(200, 50);
        textInput.setFont(new Font("Tahoma", Font.BOLD, 18));
        textInput.setLocation(300, 70);
        textInput.setBackground(new Color(211, 211, 211));

        textNameFile.setSize(200, 50);
        textNameFile.setFont(new Font("Tahoma", Font.BOLD, 18));
        textNameFile.setLocation(50, 70);
        textNameFile.setBackground(new Color(211, 211, 211));

        textRandom1.setSize(95, 50);
        textRandom1.setFont(new Font("Tahoma", Font.BOLD, 18));
        textRandom1.setLocation(550, 70);
        textRandom1.setBackground(new Color(211, 211, 211));

        textRandom2.setSize(95, 50);
        textRandom2.setFont(new Font("Tahoma", Font.BOLD, 18));
        textRandom2.setLocation(655, 70);
        textRandom2.setBackground(new Color(211, 211, 211));

        textF.setSize(200, 50);
        textF.setFont(new Font("Tahoma", Font.BOLD, 15));
        textF.setForeground(new Color(240, 240, 240));
        textF.setLocation(111, 30);

        textS.setSize(200, 50);
        textS.setFont(new Font("Tahoma", Font.BOLD, 15));
        textS.setForeground(new Color(240, 240, 240));
        textS.setLocation(316, 30);

        textR.setSize(200, 50);
        textR.setFont(new Font("Tahoma", Font.BOLD, 15));
        textR.setForeground(new Color(240, 240, 240));
        textR.setLocation(550, 30);

        panelSouth.add(BtnFile);
        panelSouth.add(BtnSetInput);
        panelSouth.add(BtnRandom);
        panelSouth.add(textInput);
        panelSouth.add(textNameFile);
        panelSouth.add(textRandom1);
        panelSouth.add(textRandom2);
        panelSouth.add(textF);
        panelSouth.add(textS);
        panelSouth.add(textR);
    }

    public void Panel_Rigth() {

        panelRigth.setSize(390, 505);
        panelRigth.setLocation(810, 0);
        panelRigth.setLayout(null);
        panelRigth.setBackground(new Color(190, 190, 190));

        JPanel panelColorCenter = new JPanel();
        JPanel panelColorG = new JPanel();
        JPanel panelColorY = new JPanel();
        JPanel panelColorO = new JPanel();
        JPanel panelColorR = new JPanel();

        JLabel textColorG = new JLabel("<html>มีคนป่วย 0-9%<br>ของประชากรในพื้นที่<html>");
        JLabel textColorY = new JLabel("<html>มีคนป่วย 10-19%<br>ของประชากรในพื้นที่<html>");
        JLabel textColorO = new JLabel("<html>มีคนป่วย 20-29%<br>ของประชากรในพื้นที่<html>");
        JLabel textColorR = new JLabel("<html>มีคนป่วยเกิน 30%<br>ของประชากรในพื้นที่<html>");
        JLabel textData0 = new JLabel("Dust : 90");
        JLabel textData1 = new JLabel("Population : 4000");
        JLabel textData2 = new JLabel("Healthy : 1000");
        JLabel textData3 = new JLabel("Patiant : 900");
        JLabel textData4 = new JLabel("PercantPatient : 10%");

        panelColorCenter.setSize(320, 200);
        panelColorCenter.setLocation(30, 20);
        panelColorCenter.setLayout(null);
        panelColorCenter.setBackground(new Color(211, 211, 211));

        panelColorG.setSize(50, 50);
        panelColorG.setLocation(50, 250);
        panelColorG.setBackground(new Color(100, 255, 100));

        panelColorY.setSize(50, 50);
        panelColorY.setLocation(50, 310);
        panelColorY.setBackground(new Color(255, 255, 10));

        panelColorO.setSize(50, 50);
        panelColorO.setLocation(50, 370);
        panelColorO.setBackground(new Color(255, 150, 10));

        panelColorR.setSize(50, 50);
        panelColorR.setLocation(50, 430);
        panelColorR.setBackground(new Color(255, 50, 10));

        textColorG.setSize(200, 50);
        textColorG.setLocation(105, 250);
        textColorG.setFont(new Font("Tahoma", Font.BOLD, 14));

        textColorY.setSize(200, 50);
        textColorY.setLocation(105, 310);
        textColorY.setFont(new Font("Tahoma", Font.BOLD, 14));

        textColorO.setSize(200, 50);
        textColorO.setLocation(105, 370);
        textColorO.setFont(new Font("Tahoma", Font.BOLD, 14));

        textColorR.setSize(200, 50);
        textColorR.setLocation(105, 430);
        textColorR.setFont(new Font("Tahoma", Font.BOLD, 14));

        textData0.setSize(300, 50);
        textData0.setFont(new Font("Tahoma", Font.BOLD, 16));
        textData0.setLocation(5, 40);

        textData1.setSize(300, 50);
        textData1.setFont(new Font("Tahoma", Font.BOLD, 16));
        textData1.setLocation(5, 70);

        textData2.setSize(300, 50);
        textData2.setFont(new Font("Tahoma", Font.BOLD, 16));
        textData2.setLocation(5, 100);

        textData3.setSize(300, 50);
        textData3.setFont(new Font("Tahoma", Font.BOLD, 16));
        textData3.setLocation(5, 130);

        textData4.setSize(300, 50);
        textData4.setFont(new Font("Tahoma", Font.BOLD, 16));
        textData4.setLocation(5, 160);

        panelColorCenter.add(textData0);
        panelColorCenter.add(textData1);
        panelColorCenter.add(textData2);
        panelColorCenter.add(textData3);
        panelColorCenter.add(textData4);

        panelRigth.add(panelColorCenter);
        panelRigth.add(panelColorG);
        panelRigth.add(panelColorY);
        panelRigth.add(panelColorO);
        panelRigth.add(panelColorR);

        panelRigth.add(textColorG);
        panelRigth.add(textColorY);
        panelRigth.add(textColorO);
        panelRigth.add(textColorR);

    }
}
