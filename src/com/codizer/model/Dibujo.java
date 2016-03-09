package com.codizer.model;

import javax.swing.JPanel;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public interface Dibujo {
	
	public static final int HOUSE = 1;
	public static final int CAMION= 2;
	public static final int ARBOL = 3;
	public static final int ECLIPSE = 4;
	
	/**
	 * Dibujar una figura en un JPanel
	 * @param panel
	 */
	public void dibujar(JPanel panel);
	
	/**
	 * Getter para la descripción del objeto generado
	 * @return String description
	 */
	public String getDescription();
}
