package com.phlipphlops.src;

import com.phlippglops.src.objects.Enemy;
import com.phlippglops.src.objects.Player;
import com.phlipphlops.src.input.KeyInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener {


    private static final long serialVersionUID = -7658845659359462557L;

    private String background = "/Images/background.jpg";

    Timer gamelooptimer;
    Player p;
    Enemy en;

    public Game() {
        setFocusable(true);
        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();

        p = new Player(100, 100);
        en = new Enemy(200,200);

        addKeyListener(new KeyInput(p));
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(),0,0,this);

        p.draw(g2d);
        en.draw(g2d);
    }

    public Image getBackgroundImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        p.update();
        en.update();
        repaint();
    }

}
