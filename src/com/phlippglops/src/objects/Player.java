package com.phlippglops.src.objects;

import com.phlipphlops.src.GlobalPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Player extends GlobalPosition {

    private String playerimage = "/Images/player.jpg";

    int velX = 0;
    int velY = 0;

    public Player(int x, int y) {
        super(x, y);
    }

    public void update() {
        x += velX;
        y += velY;

        if (x < 1) {
            x = 1;
        }
        if (y < 0) {
            y = 0;
        }
        if (x > 608) {
            x = 608;
        }
        if (y > 448) {
            y = 448;
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getPlayerImage(), x, y, null);
    }

    public Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            velX = 5;
        } else if (key == KeyEvent.VK_LEFT) {
            velX = -5;
        } else if (key == KeyEvent.VK_DOWN) {
            velY = 5;
        } else if (key == KeyEvent.VK_UP) {
            velY = -5;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT) {
            velX = 0;
        } else if (key == KeyEvent.VK_LEFT) {
            velX = 0;
        } else if (key == KeyEvent.VK_DOWN) {
            velY = 0;
        } else if (key == KeyEvent.VK_UP) {
            velY = 0;
        }
    }

}
