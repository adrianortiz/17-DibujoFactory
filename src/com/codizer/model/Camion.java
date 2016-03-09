package com.codizer.model;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class Camion implements Dibujo {

	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#dibujar(javax.swing.JPanel)
	 */
	@Override
	public void dibujar(JPanel panel) {
		Graphics2D papel = (Graphics2D) panel.getGraphics();
		
		// Base 
		papel.setColor(Color.decode("#EBF2FA"));
		papel.fillRect(0, 0, 300, 300);
		
		papel.setColor(Color.decode("#E8E8E8"));
		papel.fillRect(0, 183, 300, 117);
		
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillOval(4, 204, 288, 29);
		
		papel.setColor(Color.decode("#2D2D2D"));
		papel.fillRect(19, 176, 4, 15);
		
		papel.setColor(Color.decode("#262626"));
		papel.fillRect(46, 161, 145, 30);
		
		papel.setColor(Color.decode("#2D2D2D"));
		papel.fillRect(23, 168, 119, 31);
		
		papel.setColor(Color.decode("#2D2D2D"));
		papel.fillRect(182, 159, 97, 42);
		
		papel.setColor(Color.decode("#333333"));
		papel.fillRect(274, 165, 8, 14);
		
		papel.setColor(Color.decode("#333333"));
		papel.fillRect(274, 183, 8, 14);
		
		// Gas
		papel.setColor(Color.decode("#7B7B7B"));
		papel.fillRect(147, 178, 53, 31);
		
		papel.setColor(Color.decode("#BDBDBD"));
		papel.fillRect(158, 177, 8, 33);
		
		papel.setColor(Color.decode("#BDBDBD"));
		papel.fillRect(180, 177, 8, 33);
		
		// Llantas
		papel.setColor(Color.decode("#464646"));
		papel.fillOval(20, 170, 53, 53);
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillOval(31, 182, 30, 30);
		
		papel.setColor(Color.decode("#464646"));
		papel.fillOval(82, 170, 53, 53);
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillOval(93, 182, 30, 30);
		
		papel.setColor(Color.decode("#464646"));
		papel.fillOval(219, 170, 53, 53);
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillOval(226, 177, 38, 38);
		
		// Caja
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(20, 90, 154, 70);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(20, 90, 154, 70);
		
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(16, 90, 162, 15);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(16, 90, 162, 15);
		
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(19, 105, 12, 59);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(19, 105, 12, 59);
		
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(72, 105, 12, 59);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(72, 105, 12, 59);
		
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(130, 105, 12, 59);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(130, 105, 12, 59);
		
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(166, 118, 11, 37);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(166, 118, 11, 37);
		
		// Cabina
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(187, 75, 86, 85);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(187, 75, 86, 85);
		
		papel.setColor(Color.decode("#F2F2F2"));
		papel.fillRect(185, 72, 92, 7);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(185, 72, 92, 7);
		
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(192, 83, 35, 72);
		
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(233, 122, 29, 32);
		
		papel.setColor(Color.decode("#8A9198"));
		papel.fillRect(232, 83, 47, 34);
		papel.setColor(Color.decode("#6F7276"));
		papel.drawRect(232, 83, 47, 34);
		
		papel.setColor(Color.decode("#9A9A9A"));
		papel.fillRect(272, 120, 7, 38);
		papel.setColor(Color.decode("#5D5D5D"));
		papel.drawRect(272, 120, 7, 38);
		
		// Humo
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(185, 66, 12, 25);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(185, 66, 12, 25);
		
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(182, 90, 18, 60);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(182, 90, 18, 60);
		
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(183, 61, 16, 6);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(183, 61, 16, 6);
		
		papel.setColor(Color.decode("#D1D1D1"));
		papel.drawRect(0, 0, 299, 299);
		
		
	}
	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Hola, soy un Camión";
	}

}
