package com.phlipphlops.src;

import com.phlippglops.src.objects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener {


    private static final long serialVersionUID = -7658845659359462557L;

    Timer gamelooptimer;
    Player p;

    public Game() {
        setFocusable(true);
        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();

        p = new Player(100, 100);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        p.draw(g2d);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        repaint();
    }

}
