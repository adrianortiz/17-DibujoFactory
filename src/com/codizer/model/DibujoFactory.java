package com.codizer.model;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class DibujoFactory {
	/**
	 * Fabrica de objetos que devulve un objeto
	 * especifico Dibujo
	 * 
	 * @param tipo int
	 * @return Dibujo
	 */
	public static Dibujo crearObjeto(int tipo) 
	{
		switch (tipo) {
			case Dibujo.HOUSE:		return new House();
			case Dibujo.CAMION:		return new Camion();
			case Dibujo.ARBOL:		return new Arbol();
			case Dibujo.ECLIPSE: 	return new Eclipse();
			default: return null;
		}
	}
}
