
package DBMS_Project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.*;
//import javax.swing.JPanel;



public class Order extends JFrame implements ActionListener {
JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();

Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();

JLabel label1=new JLabel("Order Form");
JLabel label2=new JLabel("Super Shop");
JLabel label3=new JLabel("Order ID");
JLabel label4=new JLabel("Catagory");
JLabel label5=new JLabel("Product ID");
JLabel label6=new JLabel("Product Name");
JLabel label7=new JLabel("Price");
JLabel label8=new JLabel("Quantity");
JLabel label9=new JLabel("Total");

JButton button1=new JButton("Bill");
JButton button2=new JButton("Show");
JButton button3=new JButton("Delet");
JButton button4=new JButton("Search");
JButton button5=new JButton("Login form");
JButton button6=new JButton("OK");
JButton button7=new JButton("Add Product");
JButton button8=new JButton("Refresh");

Font fn1=new Font("BOLD",Font.BOLD,50);
Font fn2=new Font("BOLD",Font.ITALIC,20);

JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
JTextField tf3=new JTextField();
JTextField tf4=new JTextField();
JTextField tf5=new JTextField();

JComboBox cbox1;
JComboBox cbox2;
Order()
{
    super("Super Shop Automation System");
    panel1.setLayout(null);
    add(panel1);
    panel1.setBackground(Color.white);
    panel2.setLayout(null);
    panel3.setLayout(null);
    setSize(dim);
    //add(panel2);
   // setSize(500,300);
    setVisible(true);
    //setLocation(300,100);
    create_border();
    add_method();
}

void create_border()
{
//jlabel1.setBounds(10,20,12,30);
//jpanel2.add(jlabel1);
panel2.setBounds(new Rectangle(170,130,1000,550));
panel2.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLUE));
panel1.add(panel2);

//panel3.setBounds(new Rectangle(650,100,500,430));
//panel3.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLUE));
//panel2.add(panel3);
//jpanel1.add(jpanel2,null);
}

void add_method()
{
label1.setForeground(Color.black);
label1.setFont(fn1);
label1.setBounds(530, 20, 500, 100);
panel1.add(label1);

label2.setForeground(Color.BLACK);
label2.setFont(fn2);
label2.setBounds(180, 60,200,100);
panel1.add(label2);

label3.setForeground(Color.BLACK);
label3.setBounds(300,100,100,50);
panel2.add(label3);

label4.setForeground(Color.black);
label4.setBounds(300, 150, 100, 50);
panel2.add(label4);

label5.setForeground(Color.black);
label5.setBounds(300, 200, 100, 50);
panel2.add(label5);

label6.setForeground(Color.black);
label6.setBounds(300, 250, 100, 50);
panel2.add(label6);

label7.setForeground(Color.black);
label7.setBounds(300, 300, 100, 50);
panel2.add(label7);

label8.setForeground(Color.black);
label8.setBounds(300, 350, 100, 50);
panel2.add(label8);

label9.setForeground(Color.black);
label9.setBounds(300, 400, 100, 50);
panel2.add(label9);

button1.setForeground(Color.white);
button1.setForeground(Color.black);
button1.setBounds(10,10,150,30);
panel2.add(button1);

button2.setForeground(Color.white);
button2.setForeground(Color.black);
button2.setBounds(160,10,150,30);
panel2.add(button2);

button3.setForeground(Color.white);
button3.setForeground(Color.black);
button3.setBounds(310,10,150,30);
panel2.add(button3);

button4.setForeground(Color.white);
button4.setForeground(Color.black);
button4.setBounds(460,10,150,30);
panel2.add(button4);

button5.setForeground(Color.white);
button5.setForeground(Color.black);
button5.setBounds(610,10,150,30);
panel2.add(button5);

/*button6.setBackground(Color.white);
button6.setForeground(Color.black);
button6.setBounds(620,210,80,30);
panel2.add(button6);*/

button7.setBackground(Color.white);
button7.setForeground(Color.black);
button7.setBounds(450,480,200,30);
panel2.add(button7);

button8.setBackground(Color.white);
button8.setForeground(Color.black);
button8.setBounds(450,510,200,30);
panel2.add(button8);

tf1.setBounds(400, 110, 300, 30);
panel2.add(tf1);

String ob1[]={" ","High","Medium","Low"};
cbox1=new JComboBox(ob1);
cbox1.setBounds(400, 160, 300, 30);
panel2.add(cbox1);

String ob2[]={" ","0001","0002","0003","0004","0005","0006","0007","0008","0009","0010"};
cbox2=new JComboBox(ob2);
cbox2.setBounds(400, 210, 300, 30);
panel2.add(cbox2);

tf2.setBounds(400, 260, 300, 30);
panel2.add(tf2);

tf3.setBounds(400, 310, 300, 30);
panel2.add(tf3);

tf4.setBounds(400, 360, 300, 30);
panel2.add(tf4);

tf5.setBounds(400, 410, 300, 30);
panel2.add(tf5);
    }
public static void main()
{
new Order();

}
 public void actionPerformed(ActionEvent e)
    {

    }
}

