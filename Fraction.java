import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Fraction  implements ActionListener   {

	SimplifyFrac sf;
	public JFrame frmFractionCalculator = new JFrame();
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,label,lblResult;
	public JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,exit;

	public Fraction() {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setSize(450, 300);
		
		frmFractionCalculator.setTitle("FractionCalculator");
		frmFractionCalculator.setBounds(100, 100, 450, 300);
		frmFractionCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmFractionCalculator.setLayout(null);
		frmFractionCalculator.setResizable(false);
	
		textField = new JTextField(null);
		textField.setBounds(42, 44, 100, 20);      
		textField.setText("0");
		panel.add(textField);
		
		textField_1 = new JTextField(null);
		textField_1.setBounds(164, 44, 100, 20);
		textField_1.setText("0");
		
		panel.add(textField_1);
		
		textField_2 = new JTextField(null);
		textField_2.setBounds(42, 117, 108, 20);
		panel.add(textField_2);
		textField_2.setText("0");
		
		textField_3 = new JTextField(null);
		textField_3.setBounds(164, 117, 108, 20);
		panel.add(textField_3);
		textField_3.setText("0");
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(294, 60, 70, 60);
		panel.add(textField_4);
		textField_4.setText(null);
		
		lblNewLabel = new JLabel("____________");
		lblNewLabel.setBounds(164, 85, 96, 14);
		panel.add(lblNewLabel);
		
		label = new JLabel("____________");
		label.setBounds(42, 75, 96, 33);
		panel.add(label);
		
		lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setBounds(260, 85, 46, 14);
		panel.add(lblNewLabel_2);
		
		
		btnNewButton = new JButton("+");
		btnNewButton.setBounds(39, 160, 120, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(39, 194, 120, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBounds(187, 160, 119, 23);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(187, 194, 119, 23);
		panel.add(btnNewButton_3);
		
		lblResult = new JLabel("Result");
		lblResult.setBounds(314, 11, 46, 14);
	    panel.add(lblResult);
		
		btnNewButton_4 = new JButton("Clear");
		btnNewButton_4.setBounds(187, 227, 119, 23);
		panel.add(btnNewButton_4);
		
		exit = new JButton("exit");
		exit.setBounds(42, 227, 119, 23);
		panel.add(exit);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
		exit.addActionListener(this);
		
		frmFractionCalculator.getContentPane().add(panel);
		
		JLabel lblNumerator = new JLabel("Numerator");
		lblNumerator.setBounds(10, 19, 88, 14);
		panel.add(lblNumerator);
		
		JLabel lblDenominator = new JLabel("Denominator");
		lblDenominator.setBounds(10, 101, 88, 14);
		panel.add(lblDenominator);
		
		frmFractionCalculator.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		int num =Integer.parseInt(textField.getText());
		int deno=Integer.parseInt(textField_2.getText());
		int num1=Integer.parseInt(textField_1.getText());
		int deno1=Integer.parseInt(textField_3.getText());
		int res=0;
		int res1=0;
        if(e.getSource()==btnNewButton)
        {
        	if((deno!=0)&&(deno1!=0))
        	{
                	res=num*deno1+num1*deno;
                	res1=deno*deno1;
                	textField_4.setText(sf.asFraction(res, res1));
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, "Denominator shouldn't be zero!",
        			      "Hey!", JOptionPane.ERROR_MESSAGE);
        	}
        }
        if(e.getSource()==btnNewButton_1)
        {
        	if((deno!=0)&&(deno1!=0))
        	{
                	res=num*deno1-num1*deno;
                	res1=deno*deno1;
                	textField_4.setText(sf.asFraction(res, res1));
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, "Denominator shouldn't be zero!",
        			      "Hey!", JOptionPane.ERROR_MESSAGE);
        	}
        }
       if(e.getSource()==btnNewButton_2)
        {
    	   if((deno!=0)&&(deno1!=0))
       	{
        	res=num*num1;
        	res1=deno*deno1;
        	textField_4.setText(sf.asFraction(res,res1));
        }
    	   else
    		  {
    		   JOptionPane.showMessageDialog(null, "Denominator shouldn't be zero!",
     			      "Hey!", JOptionPane.ERROR_MESSAGE);
    		  }
        }
       if(e.getSource()==btnNewButton_3)
       {
       	if((deno!=0)&&(deno1!=0))
       	{
               	res=num*deno1;
               	res1=num1*deno;
               	textField_4.setText(sf.asFraction(res, res1));
       	}
       	else
       	{
       		JOptionPane.showMessageDialog(null, "Denominator shouldn't be zero!",
       			      "Hey!", JOptionPane.ERROR_MESSAGE);
       	}
       }
       if(e.getSource()==btnNewButton_4)
       {
    	   
    	   textField.setText(" ");
    	   textField_1.setText(" ");
    	   textField_2.setText(" ");
    	   textField_3.setText(" ");
    	   textField_4.setText(" ");
       }
       if(e.getSource()==exit)
       {
    	   frmFractionCalculator.dispose();
       }
	}
}
