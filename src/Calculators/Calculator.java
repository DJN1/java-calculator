package Calculators;

import java.awt.EventQueue;

import javax.swing.*;
import javafx.scene.Group;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.BLUE);
		frame.setBounds(100, 100, 303, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 280, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);

		//Group buttons = new Group();

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(70, 310, 70, 60);
		frame.getContentPane().add(btn0);
		//btn0.setBackground(Color.BLUE);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber );
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(0, 250, 70, 60);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 250, 70, 60);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(140, 250, 70, 60);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(0, 190, 70, 60);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber );}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 190, 70, 60);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(140, 190, 70, 60);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(0, 130, 70, 60);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 130, 70, 60);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(140, 130, 70, 60);
		frame.getContentPane().add(btn9);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(210, 250, 70, 60);
		frame.getContentPane().add(btnAdd);
		//btnAdd.setBackground(Color.RED);

		JButton btnSub = new JButton("\u2212");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(210, 190, 70, 60);
		frame.getContentPane().add(btnSub);
		//btnSub.setBackground(Color.BLUE);

		JButton btnMult = new JButton("\u00D7");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(210, 130, 70, 60);
		frame.getContentPane().add(btnMult);
		//btnMult.setBackground(Color.YELLOW);

		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";

			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(210, 70, 70, 60);
		frame.getContentPane().add(btnDiv);
		//btnDiv.setBackground(Color.MAGENTA);

		/**
		 * I moved your button for the percent up here inside the main algorithms
		 * with your other buttons. I also had to add the code so that the program
		 * "listens" to when the button is pressed.
		 */
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPerc.setBounds(0, 70, 70, 60);
		frame.getContentPane().add(btnPerc);



		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber );}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(140, 310, 70, 60);
		frame.getContentPane().add(btnDot);

		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops *= -1;// ops = ops * -1
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(0, 310, 70, 60);
		frame.getContentPane().add(btnPM);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				//I placed an if statement here because percents only require 1 number.
				if(!textField.getText().equals("")){
					secondNum = Double.parseDouble(textField.getText());
				}
				if(operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				//I also changed how your percent algorithm works.
				else if(operations == "%") {
					result = ((firstNum * 0.01) * secondNum);
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				if(!textField.getText().contains(".")) {
					textField.setText(textField.getText() + btnDot.getText());
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(210, 310, 70, 60);
		frame.getContentPane().add(btnEqual);

		JButton btnBS = new JButton("\uF0E7");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					textField.setText(backSpace);
				}
			}
		});
		btnBS.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBS.setBounds(140, 70, 70, 60);
		frame.getContentPane().add(btnBS);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null );
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(70, 70, 70, 60);
		frame.getContentPane().add(btnClear);


	}
}
