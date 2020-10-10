package NewSchoolManagement;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {
	
	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(242, 10, 230, 56);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(172, 108, 102, 25);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(172, 166, 102, 25);
		frame.getContentPane().add(lblNewLabel_2);

		txtusername = new JTextField();
		txtusername.setBounds(338, 108, 165, 30);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);

		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtusername.getText();
				String password = txtpassword.getText();
				if (username.equals("Mihir") && password.equals("1234")) {
					JOptionPane.showMessageDialog(null, "Login Successfull");
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Id and Password");
					txtusername.setText(null);
					txtpassword.setText(null);
				}
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnlogin.setBounds(153, 275, 110, 35);
		frame.getContentPane().add(btnlogin);

		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtusername.setText(null);
				txtpassword.setText(null);
			}
		});
		btnreset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnreset.setBounds(308, 275, 110, 35);
		frame.getContentPane().add(btnreset);

		JButton btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnexit.setBounds(464, 275, 110, 35);
		frame.getContentPane().add(btnexit);

		JCheckBox chckbx1 = new JCheckBox("Show Password");
		chckbx1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == chckbx1) {

					if (chckbx1.isSelected()) {
						txtpassword.setEchoChar((char) 0);
					} else {
						txtpassword.setEchoChar('*');
					}
				}
			}
		});
		chckbx1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbx1.setBounds(338, 214, 165, 19);
		frame.getContentPane().add(chckbx1);

		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpassword.setBounds(339, 166, 164, 30);
		frame.getContentPane().add(txtpassword);
	}
}
