package com.phlipphlops.src;

import com.phlippglops.src.objects.Enemy;
import com.phlippglops.src.objects.Player;
import com.phlipphlops.src.input.Controller;
import com.phlipphlops.src.input.KeyInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener {


    private static final long serialVersionUID = -7658845659359462557L;

    //Variables
    private String background = "/Images/background.jpg";

    //Objects
    Timer gamelooptimer;
    Player p;
    Enemy e;
    Controller c;

    public Game() {
        setFocusable(true);
        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();

        p = new Player(100, 100);
        c = new Controller();

        addKeyListener(new KeyInput(p));
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(),0,0,this);


        p.draw(g2d);
        c.draw(g2d);
    }

    public Image getBackgroundImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent ee){
        p.update();
        c.update();
        repaint();
    }

}
