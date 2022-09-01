
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame{
    String pinnumber;
    MiniStatement(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        setTitle("Mini Statement");
        
        JLabel mini=new JLabel();
        add(mini);
        
        JLabel bank=new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance=new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from login where pinnumber='"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: " +rs.getString("cardnumber").substring(0,4)+"XXXXX" + rs.getString("cardnumber").substring(9));
            }
        }catch(Exception e){
        System.out.println(e);
        }
        
        try{
            conn c=new conn();
            int bal=0;
            ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() +"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br></html>");
                    if(rs.getString("type").equals("Deposit")){
                        bal+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        bal-=Integer.parseInt(rs.getString("amount"));
                    }
            }
            balance.setText("YOur current account balance is RS "+ bal);
        }catch(Exception e){
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String args[]){
        new MiniStatement("");
    }
}
