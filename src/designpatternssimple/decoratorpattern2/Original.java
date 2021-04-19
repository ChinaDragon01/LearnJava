package designpatternssimple.decoratorpattern2;

import javax.swing.*;
import java.awt.*;

/**
 * http://c.biancheng.net/view/1366.html
 * 具体构件角色：原身
 */
public class Original extends JFrame implements Morrigan {

    private String t = "Morrigan0.jpg";

    public Original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel l1 = new JLabel(new ImageIcon("src/decorator/" + t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
