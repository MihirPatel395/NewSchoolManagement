package NewSchoolManagement;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendence extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    StudentAttendence(){
       
        setLayout(new GridLayout(4,2,50,50));
        c2 = new Choice();
//here sql
     
        add(new JLabel("Select Roll Number"));
        add(c2);
      
        l1 = new JLabel("First Half");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
       
        add(l1);
        add(fh);
        
        l2 = new JLabel("Second Half");
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");
       
        add(l2);
        add(sh);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        String qry = "insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";
       
//        here sql
    }
    
    public static void main(String s[]){
        new StudentAttendence();
    }
}