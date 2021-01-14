// Aiman Zahra 3909-FBAS/BSCS/F18
//Marwa Tahir 3896-FBAS/BSCS/F18
//Khansa Azam 3905-FBAS/BSCS/F18


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu implements ActionListener{
	JFrame frame = new JFrame();
	JButton frac,complex,matrix;
public Menu()
{
	frame.setBounds(100, 100, 450, 350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setVisible(true);
	
	JPanel panel = new JPanel();
	frame.add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblSelectTheCalculator = new JLabel("Select the calculator");
	lblSelectTheCalculator.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblSelectTheCalculator.setBounds(137, 33, 171, 28);
	panel.add(lblSelectTheCalculator);
	
    complex = new JButton("Complex No Calculator");
	complex.setBounds(126, 92, 163, 41);
	panel.add(complex);
	
	frac = new JButton("Fraction Calculator");
	frac.setBounds(126, 160, 163, 41);
	panel.add(frac);
	
	matrix = new JButton("Matrix Calculator");
	matrix.setBounds(126, 228, 163, 41);
	panel.add(matrix);
	
	complex.addActionListener(this);
	frac.addActionListener(this);
	matrix.addActionListener(this);
}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==complex)
			{
				new ComplexNo ();
				
			}
			if(e.getSource()==frac)
			{
				new Fraction();
			}
			if(e.getSource()==matrix)
			{
				new Matrix();
			}
		}

public static void main(String args[])
{
	new Menu();
}
}
