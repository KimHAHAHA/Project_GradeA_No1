import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;

class Pn_ButtonCenter {
    JPanel panelButtonCenter = new JPanel();
    JButton[][] BtnCenter = new JButton[10][20];

    public JPanel PanelButton_Center() {

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
        return panelButtonCenter;
    }
}
