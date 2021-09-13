import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	//JFrame win = new JFrame("Dani");

	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	
	JLabel L1;
	JLabel L2;

	JTextField text1;
	JTextField text2;
			
	
	Calculator()
	{
		setSize(500,500);
		
		b1 = new JButton("+");
		b2 = new JButton("-");
		b3 = new JButton("*");
		b4 = new JButton("/");
		b5 = new JButton("%");
		
		b1.setBounds(50,200,100,30);
		b2.setBounds(120,200,100,30);
		b3.setBounds(190,200,100,30);
		b4.setBounds(260,200,100,30);
		b5.setBounds(330,200,100,30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);	
		b5.addActionListener(this);
		
		L1=new JLabel("Enter 1st value");
		L2=new JLabel("Enter 2nd value");
		
		text1=new JTextField();
		text2=new JTextField();
		
		L1.setBounds(50,100,100,25);
		L2.setBounds(50,130,100,25);
		
		text1.setBounds(160,100,100,25);
		text2.setBounds(160,130,100,25);
		
		add(L1);
		add(L2);
		
		add(text1);
		add(text2);
		
		setLayout(null);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		show();
	}
	public void  actionPerformed(ActionEvent e)
	{
	String a = text1.getText();
	String b = text2.getText();
	
	int value1 = Integer.parseInt(a);
	int value2 = Integer.parseInt(b);
	
		if(b1==e.getSource())
		{
		//System.out.println("Addition= "+ (value1+value2));
		 JOptionPane.showMessageDialog(null,"Addition is "+(value1+value2)); 
		}
		if(b2==e.getSource())
		{
		//System.out.println("Subtraction= "+(value1-value2));
		 JOptionPane.showMessageDialog(null,"Subtraction is "+(value1-value2));
		}
		if(b3==e.getSource())
		{
		//System.out.println("Multiplication= "+ (value1*value2));
		 JOptionPane.showMessageDialog(null,"Multiplication is "+(value1*value2));
		}
		if(b4==e.getSource())
		{
		//System.out.println("Division= "+(value1/value2));
		try{
		 JOptionPane.showMessageDialog(null,"Division is "+(value1/value2));
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null,"Invalid");
		}
		}		
		if(b5==e.getSource())
		{
		//System.out.println("Remainder= "+(value1%value2));
		try{
		 JOptionPane.showMessageDialog(null,"Remainder is "+(value1%value2));
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null,"Invalid");
		}
		}
	}
	public static void main(String args[])
	{
	Calculator object = new Calculator();
	}
}