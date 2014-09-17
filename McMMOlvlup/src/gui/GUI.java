package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

	private JFrame frame;
	private JTextField aValue;
	private JTextField bValue;
	private JTextField resultXP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 207);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 121, 45);
		frame.getContentPane().add(panel);
		
		JLabel lblCurrentXpLevel = new JLabel("Current McMMO Level");
		lblCurrentXpLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(lblCurrentXpLevel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 67, 121, 45);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Target McMMO Level");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(141, 11, 121, 45);
		frame.getContentPane().add(panel_2);
		
		aValue = new JTextField();
		panel_2.add(aValue);
		aValue.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(141, 67, 121, 45);
		frame.getContentPane().add(panel_3);
		
		bValue = new JTextField();
		panel_3.add(bValue);
		bValue.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 123, 121, 45);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(141, 123, 121, 45);
		frame.getContentPane().add(panel_5);
		
		resultXP = new JTextField();
		panel_5.add(resultXP);
		resultXP.setColumns(10);
		
		JButton btnCalculateXp = new JButton("Calculate XP!");
		btnCalculateXp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(btnCalculateXp);
		btnCalculateXp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				int intA = Integer.parseInt(aValue.getText());
				int intB = Integer.parseInt(bValue.getText());
				
				int total = (int) (1010 * (intB - intA) + 10 * 
						(Math.pow(intB, 2) - Math.pow(intA, 2)));
				resultXP.setText(String.valueOf(total));
			}
		});
	}
}
