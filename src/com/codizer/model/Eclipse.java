package com.codizer.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class Eclipse implements Dibujo {

	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#dibujar(javax.swing.JPanel)
	 */
	@Override
	public void dibujar(JPanel panel) {
		Graphics2D papel = (Graphics2D) panel.getGraphics();
		
		papel.setColor(Color.decode("#FFFFFF"));
		papel.fillRect(0, 0, 300, 300);
		
		papel.setColor(Color.decode("#FF9A00"));
		papel.fillOval(17, 30, 240, 240);
		
		papel.setColor(Color.decode("#321956"));
		papel.fillOval(41, 30, 240, 240);
		
		papel.setColor(Color.decode("#4A257D"));
		papel.fillOval(91, 105, 140, 140);
		
		papel.setColor(Color.WHITE);
		papel.fillRect(46, 120, 230, 15);
		
		papel.setColor(Color.WHITE);
		papel.fillRect(41, 149, 240, 15);
		
		papel.setColor(Color.WHITE);
		papel.fillRect(47, 177, 230, 15);
		
		papel.setStroke(new BasicStroke(6));
		papel.setColor(Color.decode("#1A1333"));
		papel.drawOval(43, 30, 237, 237);
		
		papel.setStroke(new BasicStroke(8));
		papel.setColor(Color.WHITE);
		papel.drawOval(38, 24, 248, 248);
		
		papel.setStroke(new BasicStroke(1));
		papel.setColor(Color.decode("#D1D1D1"));
		papel.drawRect(0, 0, 299, 299);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Soy un dibujo de Eclipse.";
	}

}
