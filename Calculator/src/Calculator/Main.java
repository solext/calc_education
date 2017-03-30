package Calculator;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] arg) {
		
		ModalWindow modalWindow = new ModalWindow("Калькулятор");
		modalWindow.setVisible(true);
		modalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modalWindow.setBackground(Color.black);
		modalWindow.setSize(500, 500);
		modalWindow.setResizable(false);
		modalWindow.setLocationRelativeTo(null);
		modalWindow.setAlwaysOnTop(false);

	}
}
