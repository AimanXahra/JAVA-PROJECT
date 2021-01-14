// Aiman Zahra 3909-FBAS/BSCS/F18
//Marwa Tahir 3896-FBAS/BSCS/F18
//Khansa Azam 3905-FBAS/BSCS/F18


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Matrix implements ActionListener {

	private JFrame frame= new JFrame();
	private JTextField m1c;
	private JTextField m12;
	private JTextField m13;
	private JTextField m21;
	private JTextField m22;
	private JTextField m23;
	private JTextField m31;
	private JTextField m32;
	private JTextField m33;
	private JTextField M11;
	private JTextField M21;
	private JTextField M31;
	private JTextField M12;
	private JTextField M22;
	private JTextField M32;
	private JTextField M13;
	private JTextField M23;
	private JTextField M33;
	private JLabel lblResult ;
	private JButton add,minus,clear,exit;
	public Matrix() {
		frame=new JFrame("3x3 Matrix Calculator");
		frame.setBounds(100, 100, 583, 328);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matrix A");
		lblNewLabel.setBounds(49, 11, 63, 14);
		panel.add(lblNewLabel);
		
		JLabel lblMatrixB = new JLabel("Matrix B");
		lblMatrixB.setBounds(279, 11, 63, 14);
		panel.add(lblMatrixB);
		
		m1c = new JTextField();
		m1c.setBounds(10, 36, 33, 20);
		panel.add(m1c);
		m1c.setText("0");
		m12 = new JTextField();
		m12.setText("0");
		m12.setBounds(53, 36, 33, 20);
		panel.add(m12);
		
		m13 = new JTextField();
		m13.setText("0");
		m13.setBounds(102, 36, 33, 20);
		panel.add(m13);
		
		m21 = new JTextField();
		m21.setText("0");
		m21.setBounds(10, 76, 33, 20);
		panel.add(m21);
		
		m22 = new JTextField();
		m22.setText("0");
		m22.setBounds(53, 76, 33, 20);
		panel.add(m22);
		
		m23 = new JTextField();
		m23.setText("0");
		m23.setBounds(102, 76, 33, 20);
		panel.add(m23);
		
		m31 = new JTextField();
		m31.setText("0");
		m31.setBounds(10, 120, 33, 20);
		panel.add(m31);
		
		m32 = new JTextField();
		m32.setText("0");
		m32.setBounds(53, 120, 33, 20);
		panel.add(m32);
		
		m33 = new JTextField();
		m33.setText("0");
		m33.setBounds(102, 120, 33, 20);
		panel.add(m33);;;
		
		M11 = new JTextField();
		M11.setText("0");
		M11.setBounds(246, 36, 33, 20);
		panel.add(M11);
		
		M21 = new JTextField();
		M21.setText("0");
		M21.setBounds(246, 76, 33, 20);
		panel.add(M21);
		
		M31 = new JTextField();
		M31.setText("0");
		M31.setBounds(246, 120, 33, 20);
		panel.add(M31);
		
		M12 = new JTextField();
		M12.setText("0");
		M12.setBounds(289, 36, 33, 20);
		panel.add(M12);
		
		M22 = new JTextField();
		M22.setText("0");
		M22.setBounds(289, 76, 33, 20);
		panel.add(M22);
		
		M32 = new JTextField();
		M32.setText("0");
		M32.setBounds(289, 120, 33, 20);
		panel.add(M32);
		
		M13 = new JTextField();
		M13.setText("0");
		M13.setBounds(332, 36, 33, 20);
		panel.add(M13);
		
		M23 = new JTextField();
		M23.setText("0");
		M23.setBounds(332, 76, 33, 20);
		panel.add(M23);
		
		M33 = new JTextField();
		M33.setText("0");
		M33.setBounds(332, 120, 33, 20);
		panel.add(M33);
		
		lblResult = new JLabel();
		lblResult.setBounds(429, 36, 103, 104);
		panel.add(lblResult);
		
		add= new JButton("A+B");
		add.setBounds(10, 193, 89, 23);
		panel.add(add);
		
	    minus = new JButton("A-B");
		minus.setBounds(10, 236, 89, 23);
		panel.add(minus);
		
		 clear = new JButton("clear");
		 clear .setBounds(112, 193, 89, 23);
		panel.add(clear );
		
		exit = new JButton("exit");
		exit.setBounds(112, 236, 89, 23);
		panel.add(exit);
		
		frame.getContentPane().add(panel);
		
		JLabel Result = new JLabel("Result");
		Result.setBounds(419, 11, 46, 14);
		panel.add(Result);
		frame.setVisible(true);
		add.addActionListener(this);
		minus.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		int a11 =Integer.parseInt(m1c.getText());
		int a12=Integer.parseInt(m12.getText());
		int a13=Integer.parseInt(m13.getText());
		int a21 =Integer.parseInt(m21.getText());
		int a22=Integer.parseInt(m22.getText());
		int a23=Integer.parseInt(m23.getText());
		int a31 =Integer.parseInt(m31.getText());
		int a32=Integer.parseInt(m32.getText());
		int a33=Integer.parseInt(m33.getText());

		int b11 =Integer.parseInt(M11.getText());
		int b12=Integer.parseInt(M12.getText());
		int b13=Integer.parseInt(M13.getText());
		int b21 =Integer.parseInt(M21.getText());
		int b22=Integer.parseInt(M22.getText());
		int b23=Integer.parseInt(M23.getText());
		int b31 =Integer.parseInt(M31.getText());
		int b32=Integer.parseInt(M32.getText());
		int b33=Integer.parseInt(M33.getText());

		
		if(e.getSource()==add)
		{
			int r11=a11+b11;int r12=a12+b12;int r13=a13+b13;
			int r21=a21+b21;int r22=a22+b22;int r23=a23+b23;
			int r31=a31+b31;int r32=a32+b32;int r33=a33+b33;
	
			lblResult.setText( "<html>"+r11+"  "+" "+r12+"    "+r13+"<br/><br/>"+r21+"  "+r22+"    "+r23+"<br/><br/>"+r31+"    "+r32+"    "+r33+"</html>");
			
		}
		if(e.getSource()==minus)
		{
			int r11=a11-b11;int r12=a12-b12;int r13=a13-b13;
			int r21=a21-b21;int r22=a22-b22;int r23=a23-b23;
			int r31=a31-b31;int r32=a32-b32;int r33=a33-b33;
			
			
			lblResult.setText( "<html>"+r11+"  "+r12+"  "+r13+"<br/><br/>"+r21+"  "+r22+"  "+r23+"<br/><br/>"+r31+"  "+r32+"  "+r33+"</html>");
		}
		if(e.getSource()==exit)
		{
		      frame.dispose();
		}
		if(e.getSource()==clear)
		{
			m1c.setText("");m12.setText("");m13.setText("");
			m21.setText("");m22.setText("");m23.setText("");
			m31.setText("");m32.setText("");m33.setText("");
			
			M11.setText("");M12.setText("");M13.setText("");
			M21.setText("");M22.setText("");M23.setText("");
			M31.setText("");M32.setText("");M33.setText("");
			
			
		}
		
	}
}
