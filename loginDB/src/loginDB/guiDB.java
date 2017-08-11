package loginDB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class guiDB extends DBConnection {

	private JFrame frame;
	private JTextField textField;
	private JTextField usernameField;
	private JTextField passwordField;
	private JTextField idField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiDB window = new guiDB();
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
	public guiDB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		frame.getContentPane().setLayout(null);
		
		JButton registerButton = new JButton("REGISTER");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt( idField.getText() );
				String username = usernameField.getText();
				String password = passwordField.getText();
				registerDetails( id, username, password );
				openConfirmBox();
			}
		});
		
		registerButton.setBounds(220, 205, 101, 23);
		frame.getContentPane().add(registerButton);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.setBounds(114, 205, 96, 23);
		frame.getContentPane().add(loginButton);
		
		usernameField = new JTextField();
		usernameField.setBounds(153, 85, 134, 20);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(153, 123, 134, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(85, 88, 66, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(86, 126, 65, 14);
		frame.getContentPane().add(lblPassword);
		usernameField.setColumns(10);
		
		idField = new JTextField();
		idField.setBounds(170, 48, 86, 20);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(97, 51, 31, 14);
		frame.getContentPane().add(lblId);
	}
	
	public void openConfirmBox() {
		JOptionPane.showMessageDialog( frame, "User Registered!" ); 
	}
}
