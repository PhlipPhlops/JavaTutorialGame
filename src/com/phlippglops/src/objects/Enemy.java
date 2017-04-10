package com.phlippglops.src.objects;

import com.phlipphlops.src.GlobalPosition;
import com.phlipphlops.src.MainClass;

import javax.swing.*;
import java.awt.*;

public class Enemy extends GlobalPosition {

    private String image = "/Images/enemy.jpg";

    int speed = 5;

    public Enemy(int x, int y) {
        super(x, y);
    }

    public void update() {
        x += speed;
        if (x > MainClass.WIDTH - 32) {
            speed = -5;
        }
        if (x < 0) {
            speed = 5;
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getEnemyImage(), x, y, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public Image getEnemyImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(image));
        return i.getImage();
    }
}
