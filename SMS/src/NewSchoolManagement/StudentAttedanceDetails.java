package NewSchoolManagement;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttedanceDetails extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Roll Number","Date Time","First Half","Second Half"};
    String d[][]=new String[15][4];  
    int i=0,j=0;
    
    StudentAttedanceDetails(){
        super("View Students Attendence");
        setSize(800,300);
        setLocation(450,150);

//        here sql
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
     
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new StudentAttedanceDetails().setVisible(true);
    }
}