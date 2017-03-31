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
	JTextField calcField;
	int firstValue, secondValue;
	String operation;
	
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
			
			calcField = new JTextField(40);
			calcField.setBounds(5, 5, 255, 40);
			add(calcField);
			calcField.setEditable(false);
			calcField.setBackground(Color.white);

 	}
	
	public class EventHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == bNumber0) {
				calcField.setText(calcField.getText()+"0");
			}	
			if (e.getSource() == bNumber1) {
				calcField.setText(calcField.getText()+"1");
			}	
			if (e.getSource() == bNumber2) {
				calcField.setText(calcField.getText()+"2");
			}	
			if (e.getSource() == bNumber3) {
				calcField.setText(calcField.getText()+"3");
			}	
			if (e.getSource() == bNumber4) {
				calcField.setText(calcField.getText()+"4");
			}	
			if (e.getSource() == bNumber5) {
				calcField.setText(calcField.getText()+"5");
			}	
			if (e.getSource() == bNumber6) {
				calcField.setText(calcField.getText()+"6");
			}	
			if (e.getSource() == bNumber7) {
				calcField.setText(calcField.getText()+"7");
			}	
			if (e.getSource() == bNumber8) {
				calcField.setText(calcField.getText()+"8");
			}	
			if (e.getSource() == bNumber9) {
				calcField.setText(calcField.getText()+"9");
			}	
			if (e.getSource() == bCount) {
				secondValue = Integer.valueOf(calcField.getText());
				if("+".equals(operation)) {
					calcField.setText((firstValue+secondValue)+"");
				}
				if("-".equals(operation)) {
					calcField.setText((firstValue-secondValue)+"");
				}
				if("*".equals(operation)) {
					calcField.setText((firstValue*secondValue)+"");
				}
				if("/".equals(operation)) {
					calcField.setText((firstValue/secondValue)+"");
				}
				firstValue = 0;
				operation = "+";
				//calcField.setText(null);
			}	
			if (e.getSource() == bClear) {
				calcField.setText(null);
			}	
			if (e.getSource() == bPlus) {
				firstValue = Integer.valueOf(calcField.getText());
				calcField.setText("");
				operation = "+";
			}	
			if (e.getSource() == bMinus) {
				firstValue = Integer.valueOf(calcField.getText());
				calcField.setText("");
				operation = "-";
			}	
			if (e.getSource() == bMultiply) {
				firstValue = Integer.valueOf(calcField.getText());
				calcField.setText("");
				operation = "*";
			}	
			if (e.getSource() == bDivide) {
				firstValue = Integer.valueOf(calcField.getText());
				calcField.setText("");
				operation = "/";
			}	

		}
		
	}

	
}
