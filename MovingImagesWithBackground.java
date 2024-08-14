import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingImagesWithBackground extends JPanel implements ActionListener {

    int[] x = {0, 200, 400}; // ตำแหน่งเริ่มต้น x
    int[] y = {0, 200, 400}; // ตำแหน่งเริ่มต้น y
    int[] xDirection = {1, 1, 1};
    int[] yDirection = {1, 1, 1};
    Timer timer;
    int FRAME_WIDTH = 1200;
    int FRAME_HEIGHT = 800;
    int IMAGE_SIZE = 50; // ขนาดของรูปภาพ (ปรับตามขนาดจริง)
    String backgroundImagePath = "PM_2.5.png"; // เส้นทางรูปภาพพื้นหลัง
    String[] imagePaths = {
        "Theerapat.png",
        "Teeranai.png",
        "Ronnakit.png"
    };

    public MovingImagesWithBackground() {

        timer = new Timer(1, this); // เรียก ActionListener ทุก ๆ 10 มิลลิวินาที
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // วาดพื้นหลัง
        Image backgroundImg = Toolkit.getDefaultToolkit().getImage(backgroundImagePath);
        g.drawImage(backgroundImg, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, this);
        
        // วาดรูปภาพที่เคลื่อนไหว
        for (int i = 0; i < imagePaths.length; i++) {
            Image img = Toolkit.getDefaultToolkit().getImage(imagePaths[i]); // ระบุเส้นทางรูปภาพ
            g.drawImage(img, x[i], y[i], this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < imagePaths.length; i++) {
            x[i] += xDirection[i];
            y[i] += yDirection[i];
            
            // เปลี่ยนทิศทางเมื่อชนขอบของกรอบ 1200x800
            if (x[i] < 0 || x[i] > 1000 - IMAGE_SIZE) {
                xDirection[i] *= -1;
            }
            if (y[i] < 0 || y[i] > 500 - IMAGE_SIZE) {
                yDirection[i] *= -1;
            }
        }
        repaint();
    }  
}

class BackMenu extends JFrame{

    public BackMenu() {
        MovingImagesWithBackground miwb = new MovingImagesWithBackground();
        JButton BackButton = new JButton();
        BackButton.setSize(50, 50);
        add(miwb);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(1200, 800);
                setVisible(true);
            }
            
        });
    }
    
}
