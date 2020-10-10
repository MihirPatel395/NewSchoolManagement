package SGP.NewSchoolManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import SGP.University.StudentAttendance;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("School Management System");
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/src.jpeg");
        Image i3 = ic.getImage().getScaledInstance(1600, 900,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Main");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon("C:/Users/Pushpen Patel/eclipse-workspace/SchoolManagementSystem/src/resources/p1.jfif");
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
    
        m2.addActionListener(this);
  
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon("C:/Users/Pushpen Patel/eclipse-workspace/SchoolManagementSystem/src/resources/sd.jpg");
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        
        u1.addActionListener(this);
        
        JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        attendance.setForeground(Color.BLUE);
        a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentAttendence.main(null);
				
			}
		});       
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon23 = new ImageIcon("C:/Users/Pushpen Patel/eclipse-workspace/SchoolManagementSystem/src/resources/icon14.jpg");
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
        
        
        JMenu attendance_detail = new JMenu("Attendance Detail");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        attendance_detail.setForeground(Color.RED);
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentAttedanceDetails.main(null);
				
			}
		});
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/icon15.jpg");
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1); 
        
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/icon5.jpg");
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
       
        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLUE);
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21 = new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/logo.jpg");
        Image image22 = icon21.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/icon12.jpg");
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        master.add(m2);
        
        user.add(u1);
        
        report.add(r1);
   
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(report);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
            
        }
        else if(msg.equals("Student Details")){
           new StudentDetail().setVisible(true);
            
        }
        else if(msg.equals("Update Students")){
            new UpdateStudent().f.setVisible(true);
           
     } 
       else if(msg.equals("Exit")){
          System.exit(0);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }
        else if(msg.equals("Student Attendance")){
            new StudentAttendence().setVisible(true);
       }else if(msg.equals("Student Attendance Detail")){
           new StudentAttedanceDetails().setVisible(true);
        }
    } 
    
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}