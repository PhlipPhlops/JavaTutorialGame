package com.phlippglops.src.objects;

import com.phlipphlops.src.GlobalPosition;
import com.phlipphlops.src.input.Controller;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.LinkedList;

public class Player extends GlobalPosition {

    private String playerimage = "/Images/player.jpg";

    int velX = 0;
    int velY = 0;

    private LinkedList<Enemy> e = Controller.getEnemyBounds();

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

        Collision();
    }

    public void Collision() {

        for (int i = 0; i < e.size(); i++) {

            if (getBounds().intersects(e.get(i).getBounds())) {

                System.out.println("COLLISION");
            }
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
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
