package Checking5_sdwive4_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.*;

public class Checking5_sdwive4_Cal {

	private JFrame frame;
	private JTextField textField;
	double a,b,c;
	String operator;
	String Solution;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checking5_sdwive4_Cal window = new Checking5_sdwive4_Cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Checking5_sdwive4_Cal() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 270, 100);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton(".");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton.getText();
				textField.setText(n);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(0, 301, 70, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_1.getText();
				textField.setText(n);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(0, 269, 70, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_2.getText();
				textField.setText(n);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(0, 236, 70, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_3.getText();
				textField.setText(n);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(0, 202, 70, 34);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="%";
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(0, 171, 70, 34);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("0");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_4_1.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1.setBounds(68, 301, 70, 34);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+bt2.getText();
				textField.setText(n);
			}
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt2.setBounds(68, 269, 70, 34);
		frame.getContentPane().add(bt2);
		
		JButton btnNewButton_4_3 = new JButton("5");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_4_3.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_3.setBounds(68, 236, 70, 34);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("8");
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_4_4.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_4.setBounds(68, 202, 70, 34);
		frame.getContentPane().add(btnNewButton_4_4);
		
		JButton btnNewButton_4_5 = new JButton("AC");
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_4_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_5.setBounds(68, 171, 70, 34);
		frame.getContentPane().add(btnNewButton_4_5);
		
		JButton btnNewButton_4_6 = new JButton("00");
		btnNewButton_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_4_6.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_6.setBounds(137, 301, 70, 34);
		frame.getContentPane().add(btnNewButton_4_6);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+bt3.getText();
				textField.setText(n);
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt3.setBounds(137, 269, 70, 34);
		frame.getContentPane().add(bt3);
		
		JButton btnNewButton_4_8 = new JButton("6");
		btnNewButton_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_4_8.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_8.setBounds(137, 236, 70, 34);
		frame.getContentPane().add(btnNewButton_4_8);
		
		JButton btnNewButton_4_9 = new JButton("9");
		btnNewButton_4_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n= textField.getText()+btnNewButton_4_9.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_9.setBounds(137, 202, 70, 34);
		frame.getContentPane().add(btnNewButton_4_9);
		
		JButton btnNewButton_4_10 = new JButton("\uF0E7");
		btnNewButton_4_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Bac=null;
				StringBuilder text= new StringBuilder(textField.getText());
				text.deleteCharAt(textField.getText().length()-1);
				Bac=text.toString();
				textField.setText(Bac);
			}
		});
		btnNewButton_4_10.setFont(new Font("Windings", Font.BOLD, 15));
		btnNewButton_4_10.setBounds(137, 171, 70, 34);
		frame.getContentPane().add(btnNewButton_4_10);
		
		JButton btnNewButton_4_11 = new JButton("=");
		btnNewButton_4_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result;
				b=Double.parseDouble(textField.getText()); 
				switch(operator) {
				case "+":
					c=a+b;
					result=String.format("%.2f", c);
					textField.setText(result);
					break;
				case "-":
					c=a-b;
					result=String.format("%.2f", c);
					textField.setText(result);
					break;
				case "*":
					c=a*b;
					result=String.format("%.2f", c);
					textField.setText(result);
					break; 	
				case "/":
					c=a/b;
					result=String.format("%.2f", c);
					textField.setText(result);
					break; 
				case "%":
					c=a%b;
					result=String.format("%.2f", c);
					textField.setText(result);
					break; 	
				}
				
			}
		});
		btnNewButton_4_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_11.setBounds(205, 301, 70, 34);
		frame.getContentPane().add(btnNewButton_4_11);
		
		JButton btnNewButton_4_12 = new JButton("+");
		btnNewButton_4_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="+";
			}
		});
		btnNewButton_4_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_12.setBounds(205, 269, 70, 34);
		frame.getContentPane().add(btnNewButton_4_12);
		
		JButton btnNewButton_4_13 = new JButton("-");
		btnNewButton_4_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="-";
			}
		});
		btnNewButton_4_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_13.setBounds(205, 236, 70, 34);
		frame.getContentPane().add(btnNewButton_4_13);
		
		JButton btnNewButton_4_14 = new JButton("*");
		btnNewButton_4_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="*";
			}
		});
		btnNewButton_4_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_14.setBounds(205, 202, 70, 34);
		frame.getContentPane().add(btnNewButton_4_14);
		
		JButton btnNewButton_4_15 = new JButton("/");
		btnNewButton_4_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="/";
			}
		});
		btnNewButton_4_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_15.setBounds(205, 171, 70, 34);
		frame.getContentPane().add(btnNewButton_4_15);
		
		JButton btnNewButton_4_16 = new JButton("BG Green");
		btnNewButton_4_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            frame.getContentPane().setBackground(Color.GREEN);
				 //btnNewButton_4_16.setBackground(Color.green);
			}
		});
		btnNewButton_4_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_16.setBounds(10, 122, 128, 34);
		frame.getContentPane().add(btnNewButton_4_16);
		
		JButton btnNewButton_4_16_1 = new JButton("BG White");
		btnNewButton_4_16_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.WHITE);
			}
		});
		btnNewButton_4_16_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_16_1.setBounds(148, 122, 129, 34);
		frame.getContentPane().add(btnNewButton_4_16_1);
	}
}

