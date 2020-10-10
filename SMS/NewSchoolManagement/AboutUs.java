package SGP.NewSchoolManagement;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
   
        public AboutUs() {
        	
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/logo.jpeg");
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 20, 250, 150);
            contentPane.add(l1);

            JLabel l3 = new JLabel("School");
            l3.setForeground(new Color(255,6,6));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(120, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(255,6,6));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(50, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel();
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);

            JLabel l6 = new JLabel("Developed By : Dharmik & Mihir");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(50, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Roll Number - 19IT094 & 19IT104");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(50, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Contact : dharmikmpatel@gmail.com");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(50, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - B.Tech (I.T)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(50, 320, 600, 34);
            contentPane.add(l9);

            JLabel l10 = new JLabel("Phone - +919601283933");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
            l10.setBounds(50, 350, 600, 34);
            contentPane.add(l10);             
                
            contentPane.setBackground(Color.WHITE);
	}
        

}