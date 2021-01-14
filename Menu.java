import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComplexNo implements ActionListener {

	private JFrame ComplexnoCal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton plus,minus,mul,clear,exit;
	private JButton div;
	public ComplexNo() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ComplexnoCal = new JFrame();
		ComplexnoCal.setTitle("ComplexNo Calculator");
		ComplexnoCal.setBounds(100, 100, 550, 350);
		ComplexnoCal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ComplexnoCal.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Enter real part");
		lblNewLabel.setBounds(35, 38, 100, 14);
		panel.add(lblNewLabel);
		
		JLabel lblEnterImagPart = new JLabel("Enter imag part");
		lblEnterImagPart.setBounds(157, 38, 130, 14);
		panel.add(lblEnterImagPart);
		
		textField = new JTextField();
		textField.setBounds(24, 63, 86, 20);
		panel.add(textField);
		textField.setText("0");
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 63, 86, 20);
		panel.add(textField_1);
		textField_1.setText("0");
		
		textField_2 = new JTextField();
		textField_2.setBounds(25, 125, 86, 20);
		panel.add(textField_2);
		textField_2.setText("0");
		
		textField_3 = new JTextField();
		textField_3.setBounds(157, 125, 86, 20);
		panel.add(textField_3);
		textField_3.setText("0");
		
		JLabel label = new JLabel("Enter real part");
		label.setBounds(35, 100, 100, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Enter imag part");
		label_1.setBounds(157, 100, 130, 14);
		panel.add(label_1);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(320, 38, 46, 14);
		panel.add(lblResult);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 74, 86, 40);
		panel.add(textField_4);
		textField_4.setText("0");
		
		plus= new JButton("+");
		plus.setBounds(35, 175, 89, 23);
		panel.add(plus);
		
	    minus = new JButton("-");
		minus.setBounds(157, 175, 89, 23);
		panel.add(minus);
		
	    mul = new JButton("*");
		mul.setBounds(35, 209, 89, 23);
		panel.add(mul);
		
		 clear= new JButton("clear");
		clear.setBounds(400, 209, 89, 23);
		panel.add(clear);
		
		div = new JButton("/");
		div.setBounds(157, 209, 89, 23);
		panel.add(div);
		
		exit = new JButton("Exit");
		exit.setBounds(298, 209, 89, 23);
		panel.add(exit);
		
		plus.addActionListener(this);
		minus.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		clear.addActionListener(this);
		exit.addActionListener(this);
		
		ComplexnoCal.add(panel);
		ComplexnoCal.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		int r=Integer.parseInt(textField.getText());
		int i=Integer.parseInt(textField_1.getText());
		int r1=Integer.parseInt(textField_2.getText());
		int i1=Integer.parseInt(textField_3.getText());
		int res,res1;
		if(e.getSource()==plus)
		{
			res=r+r1;
			res1=i+i1;
			textField_4.setText(res+  "+"  +res1+ "i") ;
		}
		if(e.getSource()==minus)
		{
			res=r-r1;
			res1=i-i1;
			textField_4.setText(res+  "+"  +res1+ "i") ;
		}
		if(e.getSource()==mul) {
			res = r * r1 - i * i1;
		     res1 = r *i1 + i * r1;
		textField_4.setText(res+  "+"  +"("+res1+ "i"+")") ;
		}
		if(e.getSource()==clear)
		{
			   textField.setText("");
	    	   textField_1.setText("");
	    	   textField_2.setText("");
	    	   textField_3.setText("");
	    	   textField_4.setText("");
		}
		if(e.getSource()==exit)
		{
			ComplexnoCal.dispose();
		}
		if(e.getSource()==div){ 
			int a=r * r1+ i * i1;
			int b=r *i1 -i * r1;
			int a1=r1*r1+i1*i1;
			int b1=r1*i1-i1*r1;
		textField_4.setText(a+"/"+a1+"+"+"("+b+"/"+a1+"i"+")");
		}
	}
}
