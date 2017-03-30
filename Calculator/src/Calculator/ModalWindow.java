package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSetMetaData;

public class ModalWindow extends JFrame {
	JButton bNumber1, bNumber2, bNumber3, bNumber4, bNumber5,
	        bNumber6, bNumber7, bNumber8, bNumber9, bNumber0,
	        bPlus, bMinus, bMultiply, bDivide,
	        bCount, bClear;
	JLabel result;
	JTextField calcField, resultField;
	
	public ModalWindow (String s) {
		super(s);
		createGUI();
	}
	public void createGUI() {
		setLayout(null);
			bNumber1 = new JButton("1");
			bNumber1.setBounds(5,5,50,50);
			add(bNumber1);
		
			bNumber2 = new JButton("2");
			bNumber2.setBounds(60, 5, 50, 50);
			add(bNumber2);
			
			bNumber3 = new JButton("3");
			bNumber3.setBounds(115, 5, 50, 50);
			add(bNumber3);
		bNumber4 = new JButton("4");
		bNumber5 = new JButton("5");
		bNumber6 = new JButton("6");
		bNumber7 = new JButton("7");
		bNumber8 = new JButton("8");
		bNumber9 = new JButton("9");
		bNumber0 = new JButton("0");
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMultiply = new JButton("*");
		bDivide = new JButton("/");
		bCount = new JButton("=");
		bClear = new JButton("Clear");
		result = new JLabel("Результат");
		calcField = new JTextField(40);
		resultField = new JTextField(20);
		add(calcField);
		//add(bNumber7); 
		add(bNumber8); add(bNumber9); add(bPlus); 
		add(bNumber4); add(bNumber5); add(bNumber6); add(bMinus);
		add(bNumber1); add(bNumber2); add(bNumber3); add(bMultiply);
		add(bDivide); add(bClear); add(bCount);
		add(resultField);
 	}
	public void setSizeButton () {
		bNumber1.setBounds(30, 30, 100, 100);
	}
	
}
