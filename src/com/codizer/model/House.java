package com.codizer.model;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class House implements Dibujo {

	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#dibujar(javax.swing.JPanel)
	 */
	@Override
	public void dibujar(JPanel panel) {
		Graphics2D papel = (Graphics2D) panel.getGraphics();
		
		papel.setColor(Color.decode("#EBF2FA"));
		papel.fillRect(0, 0, 300, 300);
		
		papel.setColor(Color.decode("#D0D0D0"));
		papel.fillRect(0, 160, 300, 140);
		
		papel.setColor(Color.decode("#F3F3F3"));
		papel.fillRect(12, 104, 34, 57);
		papel.setColor(Color.decode("#BFBFBF"));
		papel.drawRect(12, 104, 34, 57);
		
		papel.setColor(Color.decode("#D8DCDE"));
		papel.fillRect(45, 90, 106, 71);
		
		papel.setColor(Color.decode("#D8D8D8"));
		papel.fillRect(46, 132, 45, 29);
		
		papel.setColor(Color.decode("#979797"));
		papel.drawRect(46, 132, 45, 29);
		
		papel.drawLine(67, 134, 67, 160);
		
		papel.setColor(Color.decode("#E2E7ED"));
		papel.fillRect(23, 72, 101, 55);
		papel.setColor(Color.decode("#C1C1C1"));
		papel.drawRect(23, 72, 101, 55);
		
		papel.setColor(Color.decode("#ACC5C9"));
		papel.fillRect(30, 82, 89, 38);
		papel.setColor(Color.decode("#899DA0"));
		papel.drawRect(30, 82, 89, 38);
		
		papel.setColor(Color.decode("#F0F0F0"));
		papel.fillRect(0, 160, 150, 29);
		papel.setColor(Color.decode("#BBBBBB"));
		papel.drawRect(0, 160, 150, 29);
		
		papel.setColor(Color.decode("#F9F9F9"));
		papel.fillRect(145, 26, 155, 174);
		papel.setColor(Color.decode("#CCCCCC"));
		papel.drawRect(145, 26, 155, 174);
		
		papel.setColor(Color.decode("#A3B8BB"));
		papel.fillRect(183, 104, 117, 87);
		papel.setColor(Color.decode("#77848C"));
		papel.drawRect(183, 104, 117, 87);
		
		papel.setColor(Color.decode("#F5A623"));
		papel.fillRect(0, 226, 300, 10);
		papel.setColor(Color.decode("#B77C1C"));
		papel.drawRect(0, 226, 300, 10);
		
		papel.setColor(Color.decode("#6B6B6B"));
		papel.fillRect(0, 236, 300, 65);
		papel.setColor(Color.decode("#505050"));
		papel.drawRect(0, 236, 300, 65);
		
		papel.setColor(Color.decode("#D1D1D1"));
		papel.drawRect(0, 0, 299, 299);
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.codizer.model.Dibujo#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Hola, soy una casa.";
	}

}
