package com.codizer.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author Adrian Ortiz Martinez
 *
 */
public final class DibujoView extends JFrame {
	
	public static DibujoView dibujoView = new DibujoView();
	
	private static final long serialVersionUID = -1169605933217026563L;
	
	private Container c = getContentPane();
	private JPanel panel = new JPanel();
	private JRadioButton optionAButton = new JRadioButton("Opción A");
	private JRadioButton optionBButton = new JRadioButton("Opción B");
	private JRadioButton optionCButton = new JRadioButton("Opción C");
	private JRadioButton optionDButton = new JRadioButton("Opción D");
	private ButtonGroup group = new ButtonGroup();
	private Button btnCambiar = new Button("Cambiar");
	
	/**
	 * Contructor general y privado de la clase DibujoView
	 */
	private DibujoView() {
		
		super.setTitle("Factory");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(true);
		controlesUI();
	}
	
	/**
	 * Controles principales de la GUI
	 */
	private void controlesUI() {
		
		c.setLayout(null);
		panel.setBackground(Color.decode("#D1D1D1"));
		panel.setSize(new Dimension(300, 300));
		panel.setBounds(10, 10, 300, 300);
		c.add(panel);
		
		optionAButton.setBounds(10, 320, 100, 36);
		c.add(optionAButton);
		
		optionBButton.setBounds(200, 320, 100, 36);
		c.add(optionBButton);
		
		optionCButton.setBounds(10, 356, 100, 36);
		c.add(optionCButton);
		
		optionDButton.setBounds(200, 356, 100, 36);
		c.add(optionDButton);
		
		group.add(optionAButton);
		group.add(optionBButton);
		group.add(optionCButton);
		group.add(optionDButton);
		
		btnCambiar.setBounds(10, 410, 300, 36);
		c.add(btnCambiar);
		
	}
	

	/**
	 * Getter para panel
	 * @return panle de tipo JPanel
	 */
	public JPanel getPanel() {
		return panel;
	}
	
	/**
	 * Getter para el JRadioButton optionAButton
	 * @return optionAButton JRadioButton
	 */
	public JRadioButton getOptionAButton() {
		return optionAButton;
	}

	/**
	 * Getter para el JRadioButton optionBButton
	 * @return optionBButton JRadioButton
	 */
	public JRadioButton getOptionBButton() {
		return optionBButton;
	}

	/**
	 * Getter para el JRadioButton optionCButton
	 * @return optionCButton JRadioButton
	 */
	public JRadioButton getOptionCButton() {
		return optionCButton;
	}

	/**
	 * Getter para el JRadioButton optionDButton
	 * @return optionDButton JRadioButton
	 */
	public JRadioButton getOptionDButton() {
		return optionDButton;
	}

	/**
	 * Si btnCambiar es precionado se ejecuta el método
	 * en el controlador se llama actionPerformed 
	 * @param listenForBtnCambiar
	 */
	public void addDibujarLister( ActionListener listenForBtnCambiar) {
		btnCambiar.addActionListener(listenForBtnCambiar);
	}
	
	/**
	 * Instancia Singleton para DibujoView
	 * @return dibujoView DibujoView
	 */
	public static DibujoView getInstance() {
		return dibujoView;
	}

}
