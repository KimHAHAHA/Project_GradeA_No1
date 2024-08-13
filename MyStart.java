
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

        MyPanel();
        MyButton_Center();
        MyIcon();
        MyButton_South();
        Mypanel_Rigth();
    }

    public void MyPanel() {
        panelCenter.setLayout(null);
        panelCenter.setBackground(new Color(211, 211, 211));

        panelButtonCenter.setSize(800, 500);
        panelButtonCenter.setLocation(0, 0);
        panelButtonCenter.setLayout(new GridLayout(10, 20));
        panelButtonCenter.setBackground(new Color(170, 170, 170));

        panelSouth.setSize(1200, 390);
        panelSouth.setLocation(0, 510);
        panelSouth.setLayout(null);
        panelSouth.setBackground(new Color(170, 170, 170));

        panelRigth.setSize(390, 500);
        panelRigth.setLocation(810, 0);
        panelRigth.setLayout(null);
        panelRigth.setBackground(new Color(170, 170, 170));

        panelCenter.add(panelRigth);
        panelCenter.add(panelSouth);
        panelCenter.add(panelButtonCenter);
        add(panelCenter, BorderLayout.CENTER);
    }

    public void MyButton_Center() {
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
        BtnWt_Real.setLocation(750, 70);
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
        BtnWt_Fake.setLocation(950, 70);
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

    public void MyButton_South() {
        JButton BtnFile = new JButton("FILE");
        JButton BtnRandom = new JButton("RANDOM");
        JButton BtnSetInput = new JButton("SETINPUT");
        TextField textInput = new TextField();
        TextField textNameFile = new TextField();

        BtnFile.setSize(200, 50);
        BtnFile.setLocation(80, 130);
        BtnFile.setFont(new Font("Arial", Font.BOLD, 14));
        BtnFile.setBackground(new Color(211, 211, 211));

        BtnRandom.setSize(100, 110);
        BtnRandom.setLocation(580, 70);
        BtnRandom.setFont(new Font("Arial", Font.BOLD, 14));
        BtnRandom.setBackground(new Color(211, 211, 211));

        BtnSetInput.setSize(200, 50);
        BtnSetInput.setLocation(330, 130);
        BtnSetInput.setFont(new Font("Arial", Font.BOLD, 14));
        BtnSetInput.setBackground(new Color(211, 211, 211));

        textInput.setSize(200, 50);
        textInput.setFont(new Font("Arial", Font.BOLD, 18));
        textInput.setLocation(330, 70);
        textInput.setBackground(new Color(211, 211, 211));

        textNameFile.setSize(200, 50);
        textNameFile.setFont(new Font("Arial", Font.BOLD, 18));
        textNameFile.setLocation(80, 70);
        textNameFile.setBackground(new Color(211, 211, 211));

        panelSouth.add(BtnFile);
        panelSouth.add(BtnSetInput);
        panelSouth.add(BtnRandom);
        panelSouth.add(textInput);
        panelSouth.add(textNameFile);
    }

    public void Mypanel_Rigth() {
        JPanel panelColorCenter = new JPanel();
        JPanel panelColorG = new JPanel();
        JPanel panelColorY = new JPanel();
        JPanel panelColorO = new JPanel();
        JPanel panelColorR = new JPanel();

        JLabel textColorG = new JLabel("Patients ranging from 0-9%");
        JLabel textColorY = new JLabel("Patients ranging from 10-19%");
        JLabel textColorO = new JLabel("Patients ranging from 20-29%");
        JLabel textColorR = new JLabel("Patients exceed 30%");

        panelColorCenter.setSize(320, 200);
        panelColorCenter.setLocation(30, 20);
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

        textColorY.setSize(200, 50);
        textColorY.setLocation(105, 310);

        textColorO.setSize(200, 50);
        textColorO.setLocation(105, 370);

        textColorR.setSize(200, 50);
        textColorR.setLocation(105, 430);

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
