
package DBMS_Project;
import com.sun.org.apache.bcel.internal.util.Class2HTML;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

public class Login_page extends JFrame implements ActionListener  {

JPanel jp1=new JPanel();
JPanel jp2=new JPanel();
JPanel jp3=new JPanel();
JPanel jp4=new JPanel();
JPanel jp5=new JPanel();

JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13;

Cursor cur=new Cursor(Cursor.HAND_CURSOR);
Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();

//JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13;

Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
//Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();



ImageIcon image1=new ImageIcon("pic5.jpg");
ImageIcon image2=new ImageIcon("supershop.jpg");
ImageIcon image3=new ImageIcon("pic5.jpg");
//ImageIcon image6=new ImageIcon("pic5.jpg");

ImageIcon image4=new ImageIcon("pic5.jpg");
ImageIcon image5=new ImageIcon("pic5.jpg");
ImageIcon image6=new ImageIcon("pic5.jpg");

ImageIcon image7=new ImageIcon("");
ImageIcon main_image=new ImageIcon("index.jpg");
ImageIcon main_image1=new ImageIcon("supershop.jpg");
ImageIcon main_image2=new ImageIcon("06.jpg");
ImageIcon main_image3=new ImageIcon("super-shop.jpg");
JLabel lb1=new JLabel(image1);
JLabel lb2=new JLabel(image2);
JLabel lb3=new JLabel(image3);
JLabel lb4=new JLabel(image4);
JLabel lb5=new JLabel(image5);

JLabel lb6=new JLabel(image6);
JLabel label1,label2,label3,label4,label5,label6,label7,label8;
JComboBox box;
JLabel title;
JLabel sub_title;
JLabel sub_title1;
JLabel border_info_1,underline;
JLabel border_1;
JButton jb1=new JButton("");
JButton jb2=new JButton("");
JButton jb3=new JButton("Submit");
JButton jb4=new JButton("Registration");
JButton JB5=new JButton("");

Font font=new Font("Serif",Font.BOLD,90);
Font font1=new Font("Serif",Font.ITALIC,50);
Font font2=new Font("Serif",Font.ROMAN_BASELINE,25);


JTextField jtf=new JTextField(20);

JPasswordField ptf=new JPasswordField(20);
JPasswordField ptf1=new JPasswordField(20);


 Connection con;
    Statement st;
    ResultSet rs;
Login_page()
    {
 setTitle("login_page");
 jp1.setBackground(Color.red);
 jp1.setLayout(null);
 add(jp1);

 jp2.setLayout(null);
 add(jp2);
 jp3.setLayout(null);
 add(jp3);
 setSize(dim);
 setVisible(true);
 setResizable(false);
 setCursor(cur);
 title_image();
 for_image();
   //image_2();
   //round();
 title();
 creat_Panel();
 info();
   sql_connection();
}




        void image_2()
    {

        lb6.setBounds(500,30,0,150);
        jp1.add(lb6);

        }

void for_image()
    {
   // jp2.setLayout(null);
    //add(jp2);
   lb1.setBounds(100,100,1200,50);
   jp2.add(lb1);
   //jp2.setBorder(BorderFactory.createEtchedBorder());
    jp2.setBounds(new Rectangle(90,50,1200,650));




    //jp2.setBackground(Color.black);
jp2.setBorder(BorderFactory.createEtchedBorder(200, Color.BLACK, Color.BLACK));
//jp2.setBounds(new Rectangle(80,30,1400,700));
//jp1.add(jp2,null);
//lb2.setBounds(800,10,600,150);
//jp1.add(lb2);


}
void title_image()
    {
label4=new JLabel(main_image);
label4.setBounds(10,250,250,200);
jp2.add(label4);
label5=new JLabel(main_image1);
label5.setBounds(300,250,250,190);
jp2.add(label5);

label6=new JLabel(main_image2);
label6.setBounds(170,450,250,150);
jp2.add(label6);

//label7=new JLabel(main_image3);
//label7.setBounds()_______________________________________");
//label1.setBackground(Color.blue);
//label1.setFont(font);
//label1.setBounds(40,0,1150,20);
//jp1.add(label1);
}
void title()
    {
title=new JLabel("Aqua");
title.setFont(font);
title.setBounds(0,0,1000,90);
jp2.add(title);
 sub_title=new JLabel("Welcome to Super Shop");

 sub_title.setForeground(Color.red);
 sub_title.setFont(font1);
 sub_title.setBounds(210,45,1000,60);
 jp2.add(sub_title);




  sub_title1=new JLabel("We know your choise.......");
  sub_title1.setFont(font2);
  sub_title1.setBounds(new Rectangle(800,130,1000,70));
 // sub_title.setBorder(BorderFactory.createBevelBorder(300, Color.lightGray, Color.lightGray, Color.white, Color.orange));
  jp2.add(sub_title1);

  
  
  border_info_1=new JLabel("Memebers Information Service: ");
  border_info_1.setFont(font2);
  border_info_1.setBounds(640,250 ,1000,60);
  jp2.add(border_info_1);

  jlb2=new JLabel("_____________________________________________");
  jlb2.setBounds(640,270,1000,60);
  jp2.add(jlb2);


  jlb3=new JLabel("Enter your account information:");
  jlb3.setBounds(640,300,1000,60);
  jp2.add(jlb3);

  jlb4=new JLabel("User Type");
  jlb4.setBounds(680,320,1000,70);
  jp2.add(jlb4);

  String ob[]={"Adminstrator","Employee","Stuff"};
  box=new JComboBox(ob);
  box.setBounds(750,350,180,20);
  
  jp2.add(box);

  jlb5=new JLabel("User Id:");
  jlb5.setBounds(680,350,100,70);
  jp2.add(jlb5);

  ptf.setBounds(750,380,180,20);
  jp2.add(ptf);

  jlb6=new JLabel("Password:");
  jlb6.setBounds(680,400,1000,40);
  jp2.add(jlb6);


  ptf1.setBounds(750,410,180,20);
  jp2.add(ptf1);



  jb3.setBounds(680,450,80,20);
  jb3.addActionListener(this);
  jp2.add(jb3);

  jb4.setBounds(770,450,80,20);
  jb4.addActionListener(this);
  jp2.add(jb4);


    }

void info(){

 jlb4=new JLabel("User Type");
 jlb4.setBounds(630,320,1000,70);
 jp3.add(jlb4);





        }


void creat_Panel()
    {

jp3.setBounds(new Rectangle(630,250,560,392) );
jp3.setBorder(BorderFactory.createEtchedBorder(Color.BLACK ,Color.BLACK));

jp2.add(jp3,null);
jb1.setText("Product Infomation");
jb1.setBackground(Color.red);



}


 void sql_connection()
        {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DBMS_Project","root","");
        System.out.println("Connection Successfull");
        }
        catch(Exception e)
        {
         System.out.println("Connection Failed");

        }

    }


public static void main(String[] args)
{
    new Login_page();
    }
  public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==jb3)
        {

           boolean c=false;
            if(ptf.getText().equals("")||ptf1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter User_ID and password");
            }
 else{
            try
            {
                String str1= "select * from Home where User_ID='" + ptf.getText() + "'"
                        + "&& Password='" + ptf1.getText() + "'";
                st=con.createStatement();
                rs=st.executeQuery(str1);
                rs.next();
                String name= rs.getString("User_ID");
                String pass= rs.getString("Password");


                if(ptf.getText().equals(name) && ptf1.getText().equals(pass))
                {
                    c=true;
                    new General(con);
                    dispose();
                }


            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Wrong");
            }


        }



        }
      if(e.getSource()==jb4)
         {
           new Registration(con);
           dispose();
         }
    }
}


    
 