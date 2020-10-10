package NewSchoolManagement;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class AddStudent implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;  

  
    public AddStudent(){
        f = new JFrame("Add Student");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon("C:/Users/Lenovo/eclipse-workspace/1/src/SGP/NewSchoolManagement/icon/p1.jpg");
        Image i3 = img.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);

        id8 = new JLabel("New Student Details");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.BOLD,35));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);
 
        id1 = new JLabel("Name");
        id1.setBounds(50,170,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,170,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,170,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,220,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,220,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,220,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,270,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,270,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,270,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,270,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,320,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,320,150,30);
        id15.add(t7);
        
        t8=new JTextField();
        t8.setBounds(200,320,150,30);
        id15.add(t8);

        id11= new JLabel("Aadhar No");
        id11.setBounds(400,320,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,320,150,30);
        id15.add(t10);
        
        lab=new JLabel("Standard");
        lab.setBounds(400,370,150,30);
        lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
            
        String Standard[] = {"","1,","2","3","4","5","6","7","8","9","10","11","12"};
        c1 = new JComboBox(Standard);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,370,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(50,370,130,30);
        lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"None","Science","Commerce"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,370,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,500,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,500,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public static void main(String[ ] arg){
        new AddStudent().f.setVisible(true);
    }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
