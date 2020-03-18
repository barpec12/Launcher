package com.skcraft.launcher.swing;

import java.awt.event.MouseAdapter;

import javax.swing.Icon;
import javax.swing.JButton;

public class CustomImageButton extends JButton {

	CustomImageButton instance = this;
	Icon defaultIcon;
	Icon hoverIcon;
	
	public CustomImageButton(Icon icon){
		super(null, icon);
		defaultIcon = icon;
		this.setOpaque(false);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
	}
	
	public CustomImageButton(Icon icon, Icon hover){
		super(null, icon);
		defaultIcon = icon;
		hoverIcon = hover;
		this.setOpaque(false);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.addMouseListener(new MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	instance.setIcon(hoverIcon);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	instance.setIcon(defaultIcon);
		    }
		});
	}
}
