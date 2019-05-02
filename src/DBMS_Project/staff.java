

package DBMS_Project;

import java.awt.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;


public class staff extends JFrame {
    JPanel jpanel1=new JPanel();
    JPanel jpanel2=new JPanel();
    JPanel jpanel3=new JPanel();
    JPanel jpanel4=new JPanel();

    Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();

    JLabel jlabel1=new JLabel();
    JLabel jlabel2=new JLabel();
    JLabel jlabel3=new JLabel();


    Font font=new Font("Serif",Font.BOLD,60);
    Font font1=new Font("Serif",Font.ITALIC,50);
    Font font2=new Font("Serif",Font.ROMAN_BASELINE,25);

    JLabel title=new JLabel("Staff Information");
    JLabel bar=new JLabel("...________________________");


    JButton jbutton1=new JButton("Home page");
    JButton jbutton2=new JButton("Refresh");
    JButton jbutton3=new JButton("Exit");



    JButton Jbutton4=new JButton("Insert");
    JButton Jbutton5=new JButton("Remove");
    JButton jbutton6=new JButton("Search");
    JButton jbutton7=new JButton("Show");


    JLabel jlb1=new JLabel("Staff ID");
    JLabel jlb2=new JLabel("Name");
    JLabel jlb3=new JLabel("Sex");
    JLabel jlb4=new JLabel("Age");
    JLabel jlb5=new JLabel("Address");
    JLabel jlb6=new JLabel("Contact No:");
    JLabel jlb7=new JLabel("Status");
    JLabel jlb8=new JLabel("Password");
    JLabel jlb9=new JLabel("joinnary date");
    JLabel jlb10=new JLabel("Basic Salary");
    JLabel jlb11=new JLabel("Bonus");
    JLabel jlb12=new JLabel("Total Salary");


    JTextField jtf1=new JTextField(20);
    JTextField jtf2=new JTextField(20);
    JTextField jtf3=new JTextField(20);
    JTextField jtf4=new JTextField(20);
    JTextField jtf5=new JTextField(20);
    JTextField jtf6=new JTextField(20);
    JTextField jtf7=new JTextField(20);
    JTextField jtf8=new JTextField(20);
    JTextField jtf9=new JTextField(20);
    JTextField jtf10=new JTextField(20);


    JComboBox Box1;
    JComboBox Box2;


    JPasswordField ptf=new JPasswordField(20);

    ImageIcon image1=new ImageIcon("staff.png");
  Connection con;
    Statement st;
    ResultSet rs;

    staff()
    {
        //this.con=con;
    setTitle("General");
    jpanel1.setBackground(Color.WHITE);
    jpanel1.setLayout(null);

    add(jpanel1);



    jpanel2.setLayout(null);
  //  jpanel2.setBackground(Color.BLACK);
    //add(jpanel2);
    jpanel3.setLayout(null);
    setSize(dim);
   // setLocation(500,200);
    setVisible(true);

 create_border();
 add_title();
 info_border();
 staff_info();
 add_pic_menu();
 add_button();
 add_button2();

    }

void create_border(){

//jlabel1.setBounds(10,20,12,30);
//jpanel2.add(jlabel1);
jpanel2.setBounds(new Rectangle(90,50,1200,600));
jpanel2.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLUE));
jpanel1.add(jpanel2);
//jpanel1.add(jpanel2,null);

}
void add_title()
    {
title.setBounds(350,20,1000,70);
title.setFont(font);
jpanel2.add(title);
bar.setBounds(340,50,500,70);
bar.setFont(font);
jpanel2.add(bar);
}

void info_border()
    {
 jpanel3.setBounds(new Rectangle(650,150,500,430));
 //jpanel3.setBackground(Color.WHITE);
 jpanel3.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLUE));
jpanel2.add(jpanel3);
}

void staff_info()
    {
jlb1.setBounds(40,10,1000,60);
jpanel3.add(jlb1);

jtf1.setBounds(120,30,300,20);
jpanel3.add(jtf1);

jlb2.setBounds(40,40,1000,60);
jpanel3.add(jlb2);

jtf2.setBounds(120,60,300,20);
jpanel3.add(jtf2);

jlb3.setBounds(40,70,1000,60);
jpanel3.add(jlb3);


 String ob[]={"Male","Female","Both"};
  Box1=new JComboBox(ob);
  Box1.setBounds(120,90,300,20);

  jpanel3.add(Box1);

  jlb4.setBounds(40,100,1000,60);
  jpanel3.add(jlb4);

  jtf3.setBounds(120,120,300,20);
  jpanel3.add(jtf3);

  jlb5.setBounds(40,130,100,60);
  jpanel3.add(jlb5);

  jtf4.setBounds(120,150,300,20);
  jpanel3.add(jtf4);


  jlb6.setBounds(40,160,1000,60);
  jpanel3.add(jlb6);

  jtf5.setBounds(120,180,300,20);
  jpanel3.add(jtf5);


  jlb7.setBounds(40,190,1000,60);
  jpanel3.add(jlb7);

  String ob1[]={"High","Middle","Low"};
  Box2=new JComboBox(ob1);
  Box2.setBounds(120,210,300,20);
  jpanel3.add(Box2);


  jlb8.setBounds(40,220,1000,60);
  jpanel3.add(jlb8);


  ptf.setBounds(120,240,300,20);
  jpanel3.add(ptf);

  jlb9.setBounds(40,250,1000,60);
  jpanel3.add(jlb9);


  jtf6.setBounds(120,270,300,20);
  jpanel3.add(jtf6);

  jlb10.setBounds(40,280,1000,60);
  jpanel3.add(jlb10);

  jtf7.setBounds(120,300,300,20);
  jpanel3.add(jtf7);


  jlb11.setBounds(40,310,1000,60);
  jpanel3.add(jlb11);


  jtf8.setBounds(120,340,300,20);
  jpanel3.add(jtf8);

  jlb12.setBounds(40,340,1000,60);
  jpanel3.add(jlb12);

  jtf9.setBounds(120,370,300,20);
  jpanel3.add(jtf9);
  
  
}
void add_pic_menu()
    {
jlabel1=new JLabel(image1);
jlabel1.setBounds(20,150,600,40);
jpanel2.add(jlabel1);
    }
void add_button()
        {
jbutton1.setBounds(60,155,160,30);
jpanel2.add(jbutton1);

jbutton2.setBounds(240,155,160,30);
jpanel2.add(jbutton2);

jbutton3.setBounds(420,155,160,30);
jpanel2.add(jbutton3);

}
void add_button2()
    {
 Jbutton4.setBackground(Color.BLUE);
 Jbutton4.setForeground(Color.WHITE);
 Jbutton4.setBounds(100,220,160,30);
 jpanel2.add(Jbutton4);

Jbutton5.setBackground(Color.BLUE);
Jbutton5.setForeground(Color.WHITE);
Jbutton5.setBounds(100,260,160,30);
jpanel2.add(Jbutton5);

jbutton6.setBackground(Color.BLUE);
jbutton6.setForeground(Color.WHITE);
jbutton6.setBounds(100,300,160,30);
jpanel2.add(jbutton6);


jbutton7.setBackground(Color.BLUE);
jbutton7.setForeground(Color.WHITE);
jbutton7.setBounds(100,350,160,30);
jpanel2.add(jbutton7);

}

    public static void main(String[] args){

   staff ob1=new staff();
    }

    }





