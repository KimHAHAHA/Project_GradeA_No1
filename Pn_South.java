import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Pn_South {
    JPanel panelSouth = new JPanel();

    public JPanel Panel_South() {

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

        icon();
        return panelSouth;
    }

    void icon() {
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

        panelSouth.add(em);
        panelSouth.add(BtnWt_Real);
        panelSouth.add(BtnWt_Fake);
    }
}
