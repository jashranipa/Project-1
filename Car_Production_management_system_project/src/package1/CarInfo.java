package package1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class CarInfo extends JFrame {
	
      static int n;
      static int num;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public CarInfo(int n,int num) {
		this.n=n;
		this.num=num;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1426, 855);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("For Assembly Line"+" "+n);
		lblNewLabel.setBounds(97, 20, 1156, 123);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Type of Frame(1-5)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(116, 204, 182, 58);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(308, 224, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Type of Wheel (1-3)");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(126, 272, 172, 23);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 274, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Type of Engine (1-8)");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(142, 326, 140, 23);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(308, 328, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(308, 370, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Type of Interiors (1-3)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(116, 373, 166, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(308, 417, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Enter Type of Chasis (1-7)");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(116, 420, 152, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(308, 479, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Type of Color (1-12)");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(97, 482, 185, 13);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(n<num)
				{
					AssemblyLine.arr1[n-1][0] = Integer.parseInt(textField .getText());
					AssemblyLine.arr1[n-1][1]=Integer.parseInt(textField_1 .getText());
					AssemblyLine.arr1[n-1][2]=Integer.parseInt(textField_2 .getText());
					AssemblyLine.arr1[n-1][3]=Integer.parseInt(textField_3 .getText());
					AssemblyLine.arr1[n-1][4]=Integer.parseInt(textField_4 .getText());
					AssemblyLine.arr1[n-1][5]=Integer.parseInt(textField_5 .getText());
				    dispose();
					CarInfo c=new CarInfo(n+1,num);
					c.setVisible(true);
					
					
				
				}
				else if(n==num)
				{
					AssemblyLine.arr1[n-1][0] = Integer.parseInt(textField .getText());
					AssemblyLine.arr1[n-1][1]=Integer.parseInt(textField_1 .getText());
					AssemblyLine.arr1[n-1][2]=Integer.parseInt(textField_2 .getText());
					AssemblyLine.arr1[n-1][3]=Integer.parseInt(textField_3 .getText());
					AssemblyLine.arr1[n-1][4]=Integer.parseInt(textField_4 .getText());
					AssemblyLine.arr1[n-1][5]=Integer.parseInt(textField_5 .getText());
			        dispose();
			        AssemblyLine.start1 = System.nanoTime();
			        AssemblyLine.start1=AssemblyLine.start1/1000000000;
			        for(int i=0;i<num;i++)
					{
						AssemblyLine Cari=new AssemblyLine(i+1);
						Cari.start(); // simulate....
					}
				}
				
				
				
			}
		});
		btnNewButton.setBounds(228, 581, 96, 37);
		contentPane.add(btnNewButton);
		
		
		
		
		
	}
	/**
	 * Launch the application.
	 */

}
