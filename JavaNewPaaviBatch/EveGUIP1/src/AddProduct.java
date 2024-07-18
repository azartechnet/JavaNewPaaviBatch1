import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProduct");
		lblNewLabel.setBounds(222, 26, 108, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ProductId");
		lblNewLabel_1.setBounds(10, 90, 95, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(167, 93, 163, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ProductName");
		lblNewLabel_2.setBounds(10, 177, 95, 25);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 180, 163, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ProductPrice");
		lblNewLabel_3.setBounds(10, 271, 77, 19);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(167, 265, 163, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String pprice=textField_2.getText();
					String str1="insert into product values('"+pid+"','"+pname+"','"+pprice+"')";
					 // Load MySQL JDBC Driver
				    Class.forName("com.mysql.cj.jdbc.Driver");

				    // Establish connection to the MySQL database
				    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evedb", "root", "root");
				    
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnNewButton,"LoginSucess!!");
					
					
					
				}
				catch(Exception r)
				{
					
				}
			}
		});
		btnNewButton.setBounds(39, 341, 85, 21);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					String str1="select * from product where pid='"+pid+"'";
					 // Load MySQL JDBC Driver
				    Class.forName("com.mysql.cj.jdbc.Driver");

				    // Establish connection to the MySQL database
				    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evedb", "root", "root");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str1);
					rs.next();
					String r1=rs.getString(2);
					String r2=rs.getString(3);
					textField_1.setText(r1);
					textField_2.setText(r2);
					JOptionPane.showMessageDialog(btnNewButton_1,"Searching..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_1.setBounds(195, 341, 85, 21);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String str1="update product set pname='"+pname+"' where pid='"+pid+"'";
					 // Load MySQL JDBC Driver
				    Class.forName("com.mysql.cj.jdbc.Driver");

				    // Establish connection to the MySQL database
				    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evedb", "root", "root");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton_2,"updated");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_2.setBounds(364, 341, 85, 21);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					
					String str1="delete  from product where pid='"+pid+"'";
					 // Load MySQL JDBC Driver
				    Class.forName("com.mysql.cj.jdbc.Driver");

				    // Establish connection to the MySQL database
				    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evedb", "root", "root");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton_3,"Deleted");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_3.setBounds(443, 270, 85, 21);
		contentPane.add(btnNewButton_3);
	}

}
