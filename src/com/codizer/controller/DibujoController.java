package com.codizer.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.codizer.model.Dibujo;
import com.codizer.model.DibujoFactory;
import com.codizer.view.DibujoView;

public class DibujoController {
	
	private DibujoView dibujoView;
	private DibujoFactory dibujoFactory;
	
	/**
	 * Constructor base de la clase DibujoController
	 * Se inyectan por parametro dibujoView y dibujoFactory
	 * 
	 * @param dibujoView DibujoView
	 * @param dibujoFactory DibujoFactory
	 */
	public DibujoController( DibujoView dibujoView, DibujoFactory dibujoFactory) {
		this.dibujoView = dibujoView;
		this.dibujoFactory = dibujoFactory;
		
		this.dibujoView.addDibujarLister(new DibujoListener());
	}
	
	/**
	 * Clase anónima para los eventos a implementar de ActionListener
	 * @author Adrian Ortiz
	 *
	 */
	class DibujoListener implements ActionListener {

		/**
		 * Evento actionPerformed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Dibujo dibujo;
			
			if (dibujoView.getOptionAButton().isSelected()) {
				dibujo = dibujoFactory.crearObjeto(1);
				
			} else if (dibujoView.getOptionBButton().isSelected()) {
				dibujo = dibujoFactory.crearObjeto(2);
				
			} else if (dibujoView.getOptionCButton().isSelected()) {
				dibujo = dibujoFactory.crearObjeto(3);
				
			} else {
				dibujo = dibujoFactory.crearObjeto(4);
			}
			
			dibujo.dibujar(dibujoView.getPanel());
		}
		
	}
}
