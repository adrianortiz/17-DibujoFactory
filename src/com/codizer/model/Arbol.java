package com.codizer.model;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class Arbol implements Dibujo {

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
		
		// Hojas
		papel.setColor(Color.decode("#9DE84D"));
		papel.fillRect(85, 34, 56, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(85, 34, 56, 49);
		
		papel.setColor(Color.decode("#7DD322"));
		papel.fillRect(140, 21, 46, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(140, 21, 46, 49);
		
		papel.setColor(Color.decode("#7DD322"));
		papel.fillRect(158, 45, 56, 37);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(158, 45, 56, 37);
		
		papel.setColor(Color.decode("#92D648"));
		papel.fillRect(130, 58, 56, 37);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(130, 58, 56, 37);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(113, 82, 56, 92);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(113, 82, 56, 92);
		
		papel.setColor(Color.decode("#A2EE4F"));
		papel.fillRect(198, 69, 56, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(198, 69, 56, 49);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(158, 68, 56, 63);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(158, 68, 56, 63);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(58, 58, 56, 63);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(58, 58, 56, 63);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(74, 113, 56, 37);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(74, 113, 56, 37);
		
		papel.setColor(Color.decode("#96DD48"));
		papel.fillRect(46, 95, 56, 37);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(46, 95, 56, 37);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(198, 107, 46, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(198, 107, 46, 49);
		
		papel.setColor(Color.decode("#94E140"));
		papel.fillRect(140, 107, 46, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(140, 107, 46, 49);
		
		papel.setColor(Color.decode("#72B824"));
		papel.fillRect(90, 133, 46, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(90, 133, 46, 49);
				
		papel.setColor(Color.decode("#7BC42A"));
		papel.fillRect(124, 150, 74, 37);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(124, 150, 74, 37);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(170, 116, 56, 63);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(170, 116, 56, 63);
		
		papel.setColor(Color.decode("#7ED321"));
		papel.fillRect(95, 107, 46, 49);
		papel.setColor(Color.decode("#6EA72D"));
		papel.drawRect(95, 107, 46, 49);
		
		// Tronco
		papel.setColor(Color.decode("#C4854C"));
		papel.fillRect(141, 187, 15, 88);
		papel.setColor(Color.decode("#8B572A"));
		papel.drawRect(141, 187, 15, 88);
		
		papel.setColor(Color.decode("#8B572A"));
		papel.fillRect(141, 187, 15, 22);
		
		// Base
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(94, 273, 112, 10);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(94, 273, 112, 10);
		
		// Big base
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(0, 282, 300, 18);
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(0, 282, 300, 18);
		
		
		papel.setColor(Color.decode("#D1D1D1"));
		papel.drawRect(0, 0, 299, 299);
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Hola, soy un árbol";
	}

}
