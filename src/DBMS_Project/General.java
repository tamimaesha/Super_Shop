

package DBMS_Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;


public class General  extends JFrame implements ActionListener  {

    JPanel jpanel1=new JPanel();
    JPanel jpanel2=new JPanel();


    JButton jbutton1=new JButton("Back");
    JButton jbutton2=new JButton("Exit");
    JButton jbutton3=new JButton("Book Information");
    JButton jbutton4=new JButton("Product Information");
    JButton jbutton5=new JButton("Salery Entry");
    JButton jbutton6=new JButton("Order");
    JButton jbutton7=new JButton("Menu Item");
    Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();

    Font font=new Font("Serif",Font.BOLD,90);
    Font font1=new Font("Serif",Font.ITALIC,50);
    Font font2=new Font("Serif",Font.ROMAN_BASELINE,18);



    ImageIcon image1=new ImageIcon("border_color.png");
    ImageIcon image2=new ImageIcon("supershop.jpg");
    ImageIcon image3=new ImageIcon("pic5.jpg");
    ImageIcon image4=new ImageIcon("border2.png");
    ImageIcon image5=new ImageIcon("green.png");
    ImageIcon image6=new ImageIcon("green1.png");


    JLabel jlabel=new JLabel(image1);
    JLabel jlabel2=new JLabel(image4);



    JLabel label1=new JLabel("Management");



    JLabel jlabel3=new JLabel(image1);
    JLabel jlabel4=new JLabel(image4);



    JLabel label2=new JLabel("General");

    JLabel title1=new JLabel();
    JLabel title2=new JLabel();
    JLabel title3=new JLabel();
    JLabel title4=new JLabel();

    JLabel green_border1=new JLabel(image5);
    JLabel green_border2=new JLabel(image5);
    JLabel green_border3=new JLabel(image6);

   Connection con;
    Statement st;
    ResultSet rs;
General(Connection con){

    setTitle("General");
jpanel1.setBackground(Color.WHITE);
jpanel1.setLayout(null);


add(jpanel1);
jpanel2.setLayout(null);
jpanel2.setBackground(Color.WHITE);
//jpanel3.setBackground(Color.WHITE);
//jpanel1.setBounds(ew Rectangle(90,50,1200,650));
//jpanel1.setBorder(BorderFactory.createEtchedBorder(200, Color.BLUE, Color.GREEN));
//add(jpanel2);

setSize(dim);
setVisible(true);
setResizable(false);
border_green();
title();
border_color();
button_add();

Right_button();


add_image();
left_button();
add_image2();
}


void title()
    {
title1=new JLabel("Aqua");
title1.setFont(font);
title1.setBounds(0,0,1000,90);
jpanel2.add(title1);
 title2=new JLabel("Super Shop");

 title2.setForeground(Color.red);
 title2.setFont(font1);
 title2.setBounds(210,55,1000,60);
 jpanel2.add(title2);

title3=new JLabel("We know your choise.....");
title3.setFont(font2);
title3.setBounds(700,100,1000,60);
jpanel2.add(title3);

title4=new JLabel("And");
title4.setFont(font2);
title4.setBounds(200,150,200,50);
jpanel2.add(title4);
    }
void border_green()
    {

green_border1.setBounds(30,150,1000,40);
jpanel2.add(green_border1);

green_border2.setBounds(500,150,800,40);
jpanel2.add(green_border2);

green_border3.setBounds(70,200,300,70);
jpanel2.add(green_border3);

}

void border_color()
    {
jpanel2.setBounds(new Rectangle(90,50,1200,650));
jpanel2.setBorder(BorderFactory.createEtchedBorder(200, Color.BLUE, Color.GREEN));
jpanel1.add(jpanel2);
}



void button_add()
        {
jbutton1.setBounds(300, 200,300,20 );
jpanel2.add(jbutton1);
jbutton2.setBounds(600,200,300,20);
jpanel2.add(jbutton2);

}
void Right_button()
    {
jbutton3.setBounds(980,500,200,30);
jpanel2.add(jbutton3);
jbutton4.setBounds(980,550,200,30);
jpanel2.add(jbutton4);
jbutton5.setBounds(980,600,200,30);
jpanel2.add(jbutton5);
}
void add_image()
    {

jlabel.setBounds(980,430,250,15);
jpanel2.add(jlabel);
jlabel2.setBounds(900,470,10,230);
jpanel2.add(jlabel2);

label1.setBounds(900,430,250,15);
jpanel2.add(label1);
}
void left_button()
    {
jbutton6.setBounds(100,500,200,30);
jbutton6.addActionListener(this);
jpanel2.add(jbutton6);
jbutton7.setBounds(100,550,200,30);
jpanel2.add(jbutton7);



}

void add_image2()
    {
jlabel3.setBounds(90,460,250,15);
jpanel2.add(jlabel3);
jlabel4.setBounds(30,490,10,230);
jpanel2.add(jlabel4);
  label2.setBounds(30,460,250,15);
  jpanel2.add(label2);
}
//public static void main(String[] args) {
 //Genaral gb1=new General(con);
   // }


public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jbutton3)
        {
        staff mh = new staff();
        }
    }
}
