package design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

public class homepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAssignment;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" HR SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(95, 10, 186, 24);
		contentPane.add(lblNewLabel);
		
		txtAssignment = new JTextField();
		txtAssignment.setText("Assignment");
		txtAssignment.setBounds(95, 83, 186, 19);
		contentPane.add(txtAssignment);
		txtAssignment.setColumns(10);
		
		txtUserName = new JTextField();
		txtUserName.setText("User Name");
		txtUserName.setBounds(95, 129, 186, 19);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setToolTipText("");
		txtPassword.setBounds(95, 168, 186, 30);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
	}
}
