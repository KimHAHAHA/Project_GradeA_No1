import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ProcessPM extends JFrame implements ActionListener {
    JButton BtnWt_Real = new JButton(); // ฝนจริง
    JButton BtnWt_Fake = new JButton(); // ฝนเทียม
    int[][] DataButton = new int[10][20]; // ข้อมูลที่อ่านมาจากไฟล์
    String filepath = "filepath"; // ตำแหน่งไฟล์
    Boolean fonfake = false; // เช็คการกดปุ่มฝนเทียม

    JPanel panelCenter = new JPanel(); // สร้าง panel หลักรับทุก panel
    JPanel panelButtonCenter = new JPanel(); // สร้าง panel ปุ่ม
    JPanel panelRigth = new JPanel(); // สร้าง panel ด้านขวา
    JPanel panelColorCenter = new JPanel(); // สร้าง panel สีแสดงข้อมูลใน panel ขวา
    Data_Button[][] BtnCenter = new Data_Button[10][20]; // สร้าง con เป็น array ไว้เก็บข้อมูลในปุ่ม

    JPanel panelSouth = new JPanel(); // สร้าง panel ด้านล่าง
    JButton BtnFile = new JButton("SELECT"); // ปุ่มอ่านข้อมูลไฟล์
    JButton BtnRandom = new JButton("RANDOM"); // ปุ่มยืนยันแบบสุ่ม
    JButton BtnSetInput = new JButton("CONFIRM"); // ปุ่มยืนยันค่าคงที่

    TextField textInput = new TextField(); // รับข้อมูลค่าคงที่
    TextField textNameFile = new TextField(); // แสดงต่ำแหน่งไฟล์
    TextField textRandom1 = new TextField(); // สุ่มตั้งแต่...
    TextField textRandom2 = new TextField(); // สุ่มถึง...

    JLabel textData0 = new JLabel(); // แสดงข้อมูลปริมาณฝุ่น
    JLabel textData1 = new JLabel(); // แสดงข้อมูลปริมาณคน
    JLabel textData2 = new JLabel(); // แสดงข้อมูลประชาการที่สุขภาพดี
    JLabel textData3 = new JLabel(); // แสดงข้อมูลประชาการที่ป่วย
    JLabel textData4 = new JLabel(); // แสดงข้อมูลร้อยละประชาการที่ป่วย

    public ProcessPM() {
        setLocation(350, 60);
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setTitle("MENU");

        panelCenter.setLayout(null);
        panelCenter.setBackground(new Color(211, 211, 211));

        panelCenter.add(Panel_South());
        // panelCenter.add(PnBtnCenter());
        panelCenter.add(Panel_Rigth());
        add(panelCenter, BorderLayout.CENTER);
    }

    public JPanel Panel_Rigth() { // method setPanel ด้านข้าง
        JPanel panelColorG = new JPanel();
        JPanel panelColorY = new JPanel();
        JPanel panelColorO = new JPanel();
        JPanel panelColorR = new JPanel();
        JLabel textColorG = new JLabel("<html>มีคนป่วย 0-9%<br>ของประชากรในพื้นที่<html>");
        JLabel textColorY = new JLabel("<html>มีคนป่วย 10-19%<br>ของประชากรในพื้นที่<html>");
        JLabel textColorO = new JLabel("<html>มีคนป่วย 20-29%<br>ของประชากรในพื้นที่<html>");
        JLabel textColorR = new JLabel("<html>มีคนป่วยเกิน 30%<br>ของประชากรในพื้นที่<html>");

        panelRigth.setSize(390, 505);
        panelRigth.setLocation(810, 0);
        panelRigth.setLayout(null);
        panelRigth.setBackground(new Color(190, 190, 190));

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

        icon_Rigth();
        return panelRigth;
    }

    void icon_Rigth() { // method setemoji ในpanel ด้านข้าง
        ImageIcon emoji0 = new ImageIcon("Screenshot 2024-07-26 191313.png");
        JLabel em1 = new JLabel(emoji0);
        em1.setSize(100, 50);
        em1.setLocation(270, 460);
        panelRigth.add(em1);
    }

    public JPanel PnBtnCenter() { // method setPanel ปุ่ม10*20

        panelButtonCenter.setSize(800, 500);
        panelButtonCenter.setLocation(5, 5);
        panelButtonCenter.setLayout(new GridLayout(10, 20));
        panelButtonCenter.setBackground(new Color(170, 170, 170));

        for (int i = 0; i < BtnCenter.length; i++) {
            for (int j = 0; j < BtnCenter[i].length; j++) {
                BtnCenter[i][j] = new Data_Button();
                panelButtonCenter.add(BtnCenter[i][j]);
            }
        }
        return panelButtonCenter;
    }

    JLabel textF = new JLabel("INPUT FILE");
    JLabel textS = new JLabel("INPUT PROPULATION");
    JLabel textR = new JLabel("INPUT NUMBER RANDOM");

    public JPanel Panel_South() { // method setPanel ด้านล่าง
        panelSouth.setSize(1200, 390);
        panelSouth.setLocation(0, 510);
        panelSouth.setLayout(null);
        panelSouth.setBackground(new Color(190, 190, 190));

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

        BtnFile.addActionListener(this);
        BtnSetInput.addActionListener(this);
        BtnRandom.addActionListener(this);
        BtnWt_Real.addActionListener(this);
        BtnWt_Fake.addActionListener(this);
        icon_Sounth();

        return panelSouth;
    }

    boolean OnButton = true;

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == BtnSetInput) {
                String People = textInput.getText();
                int people = Integer.parseInt(People);
                if (people >= 1) {
                    if (OnButton) {
                        panelCenter.add(PnBtnCenter());
                        panelCenter.revalidate();
                        setDataButton();
                        textS.setText("INPUT PROPULATION");
                        OnButton = false;
                    }
                    for (int i = 0; i < BtnCenter.length; i++) {
                        for (int j = 0; j < BtnCenter[i].length; j++) {
                            BtnCenter[i][j].setpeople(people);
                        }
                    }
                } else {
                    textS.setText("TRY AGAIN!!");
                }
            } else if (e.getSource() == BtnRandom) {
                String Peopleramdom1 = textRandom1.getText();
                String Peopleramdom2 = textRandom2.getText();
                int peoplerandom1 = Integer.parseInt(Peopleramdom1);
                int peoplerandom2 = Integer.parseInt(Peopleramdom2);
                if (peoplerandom1 <= peoplerandom2 && peoplerandom1 >= 1) {
                    if (OnButton) {
                        panelCenter.add(PnBtnCenter());
                        panelCenter.revalidate();
                        setDataButton();
                        OnButton = false;
                        textR.setText("INPUT NUMBER RANDOM");
                    }
                    for (int i = 0; i < BtnCenter.length; i++) {
                        for (int j = 0; j < BtnCenter[i].length; j++) {
                            int dispeople = peoplerandom2 - peoplerandom1;
                            BtnCenter[i][j].setpeople((int) (Math.random() * dispeople + peoplerandom1));
                        }
                    }
                } else {
                    textR.setText("TRY AGAIN!!");
                }
            } else if (e.getSource() == BtnFile) {
                JFileChooser fileChooser = new JFileChooser();
                int chackdata = fileChooser.showOpenDialog(null);

                if (chackdata == JFileChooser.APPROVE_OPTION) {
                    filepath = fileChooser.getSelectedFile().getAbsolutePath();
                    textNameFile.setText(filepath);
                    setDataButton();
                } else {
                    textNameFile.setText("No file");
                }
            } else if (e.getSource() == BtnWt_Real) {
                for (int i = 0; i < BtnCenter.length; i++) {
                    for (int j = 0; j < BtnCenter[i].length; j++) {
                        int disPM = BtnCenter[i][j].getPM();
                        disPM = disPM - 50;
                        if (disPM < 0) {
                            disPM = 0;
                        }
                        BtnCenter[i][j].setPM(disPM);
                        BtnCenter[i][j].setColorButton();
                        setColorpanel(disPM);
                        showDatatext(disPM, BtnCenter[i][j].getpeople());
                    }
                }
            } else if (e.getSource() == BtnWt_Fake) {
                fonfake = true;
            }
        } catch (Exception eee) {

        }

    }

    public int[][] setDataButton() {
        String[] splitData;

        try (BufferedReader Read = new BufferedReader(new FileReader(filepath))) {

            String ReadText;
            for (int i = 0; (ReadText = Read.readLine()) != null; i++) {
                splitData = ReadText.split("\\s+");
                for (int j = 0; j < splitData.length; j++) {
                    DataButton[i][j] = Integer.parseInt(splitData[j]);
                    System.out.print(DataButton[i][j] + "\t");
                }
                System.out.println();
            }
            setColor();

        } catch (FileNotFoundException e) {
            // TODO: handle exception
        } catch (IOException ee) {
        }
        return DataButton;
    }

    public void setColor() {
        for (int i = 0; i < BtnCenter.length; i++) {
            for (int j = 0; j < BtnCenter[i].length; j++) {

                BtnCenter[i][j].setPM(DataButton[i][j]);
                BtnCenter[i][j].setColorButton();
                BtnCenter[i][j].setrow(i);
                BtnCenter[i][j].setcolum(j);
                final int o = i;
                final int x = j;

                BtnCenter[i][j].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int Npeople = BtnCenter[o][x].getpeople();
                        showDatatext(BtnCenter[o][x].getPM(), Npeople);
                        setColorpanel(BtnCenter[o][x].getPM());
                        if (fonfake) {
                            try {
                                int B = o, C = x;
                                int[][] fon = { { B - 1, C - 1 }, { B - 1, C }, { B - 1, C + 1 }, { B, C - 1 },
                                        { B, C + 1 }, { B + 1, C - 1 }, { B + 1, C }, { B + 1, C + 1 } };
                                for (int k = 0, l = 0; k < fon.length; k++) {
                                    int row = BtnCenter[fon[k][l]][fon[k][l + 1]].getrow();
                                    int colum = BtnCenter[fon[k][l]][fon[k][l + 1]].getcolum();
                                    setRainfake(row, colum);
                                }
                                float disPM = (float) BtnCenter[B][C].getPM();
                                disPM = disPM - (disPM * ((float) 50 / 100));
                                if (disPM < 0) {
                                    disPM = 0;
                                }
                                BtnCenter[B][C].setPM((int) disPM);
                                BtnCenter[B][C].setColorButton();
                                fonfake = false;
                            } catch (ArrayIndexOutOfBoundsException ee) {
                                // TODO: handle exception
                            }

                        }
                    }

                });
            }
        }
    }

    void setRainfake(int row, int colum) {
        try {
            float disPM = (float) BtnCenter[row][colum].getPM();
            disPM = disPM - (disPM * ((float) 30 / 100));
            if (disPM < 0) {
                disPM = 0;
            }
            BtnCenter[row][colum].setPM((int) disPM);
            BtnCenter[row][colum].setColorButton();
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
        }

    }

    void setColorpanel(int data) {
        if (data <= 50) {
            panelColorCenter.setBackground(new Color(100, 255, 100));
        } else if (data <= 100) {
            panelColorCenter.setBackground(new Color(255, 255, 10));
        } else if (data <= 150) {
            panelColorCenter.setBackground(new Color(255, 150, 10));
        } else {
            panelColorCenter.setBackground(new Color(255, 50, 10));
        }
    }

    void showDatatext(int DataButton, int pepo) {
        int PercantPatient = DataButton / 5;
        float Patiant = pepo * ((float) PercantPatient / 100);
        int Healthy = pepo - (int) Patiant;

        textData0.setText("Dust :" + DataButton);
        textData1.setText("Population :" + pepo);
        textData2.setText("Healthy :" + Healthy);
        textData3.setText("Patiant :" + (int) Patiant);
        textData4.setText("PercantPatient :" + PercantPatient);

    }

    void icon_Sounth() {
        ImageIcon icon0 = new ImageIcon("Screenshot 2024-07-26 165047.png");// เครื่องบิน
        BtnWt_Real.setIcon(icon0);

        BtnWt_Real.setSize(150, 100);
        BtnWt_Real.setLocation(800, 70);
        BtnWt_Real.setBorderPainted(false);// ตั้งค่าไม่ให้แสดงพื้นหลัง
        BtnWt_Real.setContentAreaFilled(false);
        BtnWt_Real.setFocusPainted(false);

        ImageIcon icon1 = new ImageIcon("Screenshot 2024-07-26 183342.png");// เมฆ
        BtnWt_Fake.setIcon(icon1);
        BtnWt_Fake.setSize(160, 100);
        BtnWt_Fake.setLocation(970, 70);
        BtnWt_Fake.setBorderPainted(false);// ตั้งค่าไม่ให้แสดงพื้นหลัง
        BtnWt_Fake.setContentAreaFilled(false);
        BtnWt_Fake.setFocusPainted(false);

        ImageIcon emoji0 = new ImageIcon("Screenshot 2024-07-26 191313.png");// อิโมจิ
        JLabel em = new JLabel(emoji0);
        em.setSize(100, 50);
        em.setLocation(0, 205);

        panelSouth.add(em);
        panelSouth.add(BtnWt_Real);
        panelSouth.add(BtnWt_Fake);
    }
}