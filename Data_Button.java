import java.awt.Color;
import javax.swing.JButton;

public class Data_Button extends JButton {
    int PM;
    int people;
    int row;
    int colum;

    void setPM(int PM) {
        this.PM = PM;
    }

    int getPM() {
        return PM;
    }

    void setpeople(int people) {
        this.people = people;
    }

    int getpeople() {
        return people;
    }

    void setrow(int row) {
        this.row = row;
    }

    int getrow() {
        return row;
    }

    void setcolum(int colum) {
        this.colum = colum;
    }

    int getcolum() {
        return colum;
    }

    void setColorButton() {
        if (PM <= 50) {
            setBackground(new Color(100, 255, 100));
        } else if (PM <= 100) {
            setBackground(new Color(255, 255, 10));
        } else if (PM <= 150) {
            setBackground(new Color(255, 150, 10));
        } else {
            setBackground(new Color(255, 50, 10));
        }
    }
}
