package designpatternssimple.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * 真实主题：婺源特产
 */
public class WySpecialty extends JFrame implements Specialty{

    public WySpecialty() {
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("src/designpatternssimple/proxy/WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void display() {
        this.setVisible(true);
    }
}
