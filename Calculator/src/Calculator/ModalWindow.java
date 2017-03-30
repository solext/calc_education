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
	JLabel result, calcResult;
	JTextField calcField;
	
	EventHandler handler = new EventHandler();
	
	public ModalWindow (String s) {
		super(s);
		createGUI();
	}
	public void createGUI() {
		setLayout(null);
			bNumber7 = new JButton("7");
			bNumber7.setBounds(5,60,60,60);
			add(bNumber7);
			bNumber7.addActionListener(handler);
		
			bNumber8 = new JButton("8");
			bNumber8.setBounds(70, 60, 60, 60);
			add(bNumber8);
			bNumber8.addActionListener(handler);
			
			bNumber9 = new JButton("9");
			bNumber9.setBounds(135, 60, 60, 60);
			add(bNumber9);
			bNumber9.addActionListener(handler);
			
			bNumber4 = new JButton("4");
			bNumber4.setBounds(5, 125, 60, 60);
			add(bNumber4);
			bNumber4.addActionListener(handler);
			
			bNumber5 = new JButton("5");
			bNumber5.setBounds(70, 125, 60, 60);
			add(bNumber5);
			bNumber5.addActionListener(handler);

			bNumber6 = new JButton("6");
			bNumber6.setBounds(135, 125, 60, 60);
			add(bNumber6);
			bNumber6.addActionListener(handler);
			
			bNumber1 = new JButton("1");
			bNumber1.setBounds(5, 190, 60, 60);
			add(bNumber1);
			bNumber1.addActionListener(handler);
			
			bNumber2 = new JButton("2");
			bNumber2.setBounds(70, 190, 60, 60);
			add(bNumber2);
			bNumber2.addActionListener(handler);
			
			bNumber3 = new JButton("3");
			bNumber3.setBounds(135, 190, 60, 60);
			add(bNumber3);
			bNumber3.addActionListener(handler);
			
			bNumber0 = new JButton("0");
			bNumber0.setBounds(5, 255, 60, 60);
			add(bNumber0);
			bNumber0.addActionListener(handler);
			
			bClear = new JButton("C");
			bClear.setBounds(70, 255, 60, 60);
			add(bClear);
			bClear.addActionListener(handler);
			
			bCount = new JButton("=");
			bCount.setBounds(135, 255, 60, 60);
			add(bCount);
			bCount.addActionListener(handler);
						
			bPlus = new JButton("+");
			bPlus.setBounds(200, 60, 60, 60);
			add(bPlus);
			bPlus.addActionListener(handler);
		
			bMinus = new JButton("-");
			bMinus.setBounds(200, 125, 60, 60);
			add(bMinus);
			bMinus.addActionListener(handler);
			
			bMultiply = new JButton("*");
			bMultiply.setBounds(200, 190, 60, 60);
			add(bMultiply);
			bMultiply.addActionListener(handler);
			
			bDivide = new JButton("/");
			bDivide.setBounds(200, 255, 60, 60);
			add(bDivide);
			bDivide.addActionListener(handler);

			result = new JLabel("Результат:");
			result.setBounds(5, 320, 100, 40);
			add(result);
			
			calcField = new JTextField(40);
			calcField.setBounds(5, 5, 255, 40);
			add(calcField);
			calcField.setEditable(false);
			calcField.setBackground(Color.white);
			
			calcResult = new JLabel("");
			calcResult.setBounds(50, 320, 200, 40);
			add(calcResult);
 	}
	
	public class EventHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == bNumber1) {
				
			}			
			
		}
		
	}

	
}
