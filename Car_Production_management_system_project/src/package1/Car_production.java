package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Car_production {

	public JFrame frame;
	private JTextField txtEnter;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car_production window = new Car_production();
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
	public Car_production() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1352, 811);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEnter = new JTextField();
		txtEnter.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtEnter.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnter.setBounds(302, 27, 116, 45);
		frame.getContentPane().add(txtEnter);
		txtEnter.setColumns(10);
		
		lblNewLabel = new JLabel("Enter Number of Assembly Lines");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 19, 257, 60);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtEnter.getText());
				AssemblyLine.num=num;
				frame.dispose();
				CarInfo c=new CarInfo(1,num);
				c.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(551, 40, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
