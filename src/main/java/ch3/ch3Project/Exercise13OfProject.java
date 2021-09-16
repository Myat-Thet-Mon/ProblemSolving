package ch3.ch3Project;

import javax.swing.*;
import java.awt.*;

public class Exercise13OfProject extends JPanel {
    public void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);
        int hc = getHeight() / 2;
        int wc = getWidth() / 2;
        int width = 200;
        int height = 200;
        int x = wc - (width / 2);
        int y = hc - (height / 2);
        int xC = wc - (width / 4);
        int yC = hc - (height / 4);
        canvas.drawOval(x, y, width, height);
        canvas.fillOval(xC, yC, width / 2, height / 2);
        canvas.drawArc(x, y - (height / 2), width, height / 2, 0, -180);
        canvas.drawArc(x - (width / 2), y, width / 2, height, 90, -180);
        canvas.drawArc(wc + (width / 2), y, width / 2, height, 90, 180);
        canvas.drawArc(x - (width / 2) + width / 2, y + height, width, height / 2, 0, 180);
    }

    public static void main(String[] args) {
        Exercise13OfProject watchPanel = new Exercise13OfProject();
        JFrame frame = new JFrame();
        frame.setContentPane(watchPanel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}