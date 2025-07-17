package bank.managment.system;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



 
public class BlanceEnquiry extends JFrame implements ActionListener {
    
    JButton back;
    String pinnumber;
    
    
    BlanceEnquiry(String pinnumber){
        setLayout(null);
        this.pinnumber=pinnumber;
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 =i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
         back = new JButton("BACK");
         back.setBounds(365,520,150,30);
         back.addActionListener(this);
         image.add(back);
        
        Conn c = new Conn();
        int balance =0;

       try{
         ResultSet rs =  c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
         while(rs.next()){
             if(rs.getString("type").equals("Deposit")){
                 balance += Integer.parseInt(rs.getString("amount"));
             }else {
                 balance -=Integer.parseInt(rs.getString("amount"));
             }
           } 
         }catch(Exception e){
                 System.out.println(e);
                 }
       
       
       JLabel text =new JLabel("Your Current Account Balance is Rs. "+balance);
          text.setForeground(Color.white); 
          text.setBounds(170,300,400,30);
       image.add(text);
       
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    
    
    
    public static void main(String arge[]){
        new BlanceEnquiry("");
    }
}
