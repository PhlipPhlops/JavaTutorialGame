package com.phlipphlops.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener {


    private static final long serialVersionUID = -7658845659359462557L;

    Timer gamelooptimer;

    public Game() {
        setFocusable(true);
        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();

    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        repaint();
    }

}
