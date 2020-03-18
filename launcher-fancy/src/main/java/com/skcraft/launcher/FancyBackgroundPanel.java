/*
 * SKCraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FancyBackgroundPanel extends JPanel {

    private Image background;
    private Image borders;
    private Image logo;
    
    public FancyBackgroundPanel() {
        try {
            background = ImageIO.read(FancyBackgroundPanel.class.getResourceAsStream("launcher_bg.png"));
        } catch (IOException e) {
            background = null;
        }
        
        try {
            borders = ImageIO.read(FancyBackgroundPanel.class.getResourceAsStream("borders.png"));
        } catch (IOException e) {
            borders = null;
        }
        
        try {
        	logo = ImageIO.read(FancyBackgroundPanel.class.getResourceAsStream("logo.png"));
        } catch (IOException e) {
        	logo = null;
        }
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null) {
            g.drawImage(background, 212, -103, null);
        }
        
        if(borders != null){
        	g.drawImage(borders, 0, 0, null);
        }
        
        if(logo != null) {
        	g.drawImage(logo, 431, 38, null);
        }
    }

}
