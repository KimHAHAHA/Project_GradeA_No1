import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Pn_Rigth {
    JPanel panelRigth = new JPanel();
    ProcessPM ProCess = new ProcessPM();

    public JPanel Panel_Rigth() {

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

        panelRigth.add(ProCess.panelColorSide());
        panelRigth.add(panelColorG);
        panelRigth.add(panelColorY);
        panelRigth.add(panelColorO);
        panelRigth.add(panelColorR);

        panelRigth.add(textColorG);
        panelRigth.add(textColorY);
        panelRigth.add(textColorO);
        panelRigth.add(textColorR);

        icon_Rigth();
        return panelRigth;
    }

    void icon_Rigth() {
        ImageIcon emoji0 = new ImageIcon("Screenshot 2024-07-26 191313.png");
        JLabel em1 = new JLabel(emoji0);
        em1.setSize(100, 50);
        em1.setLocation(270, 460);
        panelRigth.add(em1);
    }
}
