

import com.codizer.controller.DibujoController;
import com.codizer.model.DibujoFactory;
import com.codizer.view.DibujoView;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class Main {
	
	/**
	 * Aplicación que implementa el patron de diseño
	 * Factory Method para la creación de objetos
	 * con gráficos.
	 * @param args
	 */
	public static void main(String[] args) {
		
		DibujoView dibujoView = DibujoView.getInstance();
		DibujoFactory dibujoFactory = new DibujoFactory();
		DibujoController controller = new DibujoController(dibujoView, dibujoFactory);
		
		dibujoView.setVisible(true);
	}
}
