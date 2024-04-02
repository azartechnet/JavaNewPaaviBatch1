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
		setBounds(100, 100, 629, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProduct");
		lblNewLabel.setBounds(229, 29, 104, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ProductId");
		lblNewLabel_1.setBounds(53, 81, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(161, 74, 172, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PName");
		lblNewLabel_2.setBounds(53, 174, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 171, 172, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PPrice");
		lblNewLabel_3.setBounds(53, 261, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 258, 172, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
			       int pid=Integer.parseInt(textField.getText());
			       String pname=textField_1.getText();
			       int pprice=Integer.parseInt(textField_2.getText());
			       String str1="insert into product values('"+pid+"','"+pname+"','"+pprice+"')";
			       Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javabatch","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton,"Inserted..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton.setBounds(33, 354, 118, 27);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("ViewProduct");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String id=textField.getText();
					String str1="select * from product where pid='"+id+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javabatch","sa","");
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
					
				}
			}
		});
		btnNewButton_1.setBounds(184, 354, 112, 27);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String str2="update product set pname='"+pname+"' where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javabatch","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str2);
					JOptionPane.showMessageDialog(btnNewButton_2,"Updated..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_2.setBounds(326, 357, 104, 24);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBounds(471, 357, 98, 27);
		contentPane.add(btnNewButton_3);
	}

}
