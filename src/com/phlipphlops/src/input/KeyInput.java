package com.phlipphlops.src.input;

import com.phlippglops.src.objects.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    Player p;

    public KeyInput(Player p) {
        this.p = p;
    }

    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }
}
