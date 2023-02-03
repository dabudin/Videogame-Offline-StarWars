package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class InputHandler implements KeyListener {

	//En esta clase creas los m�todos asociados
	//a eventos de teclado y rat�n.
	
	
	Boolean[] keys = new Boolean[256];
	
	//CONSTRUCTOR
	
	public InputHandler(JPanel panel) {
		super();
		
		//A�adimos los listener de esta clase al JPanel.
		panel.addKeyListener(this);
		
		//Establecemos que el focus del teclado
		//lo reciba el JPanel en espec�fico.
		panel.setFocusable(true);
		
		//Ponemos todas las teclas en false (= sin pulsar).
		for (int i = 0; i < keys.length; i++) {
			keys[i] = false;
		}
		
	}	
	
	
	//METODOS TECLADO
	
	public boolean isKeyDown(int keyCode) {
		if (keyCode > 0 && keyCode < 256) {
			return keys[keyCode];
		}
		return false;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() > 0 && e.getKeyCode() < 256) {
			keys[e.getKeyCode()] = true;
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() > 0 && e.getKeyCode() < 256) {
			keys[e.getKeyCode()] = false;
		}	
	}

	public void keyTyped(KeyEvent e) {	
	}
	
}
