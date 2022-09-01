package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signUpOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fatherTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton button;
    JRadioButton male,female,married,unmarried, others;
    JDateChooser dobc;
    signUpOne(){
        setLayout(null);
        setSize(850,800);
        setLocation(300,10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        Random ran=new Random();
        random=Math.abs((ran.nextLong() % 9000L)+ 1000L);

        JLabel Formno=new JLabel("APPLICATION FORM NO. " + random);
        Formno.setFont(new Font("Raleway", Font.BOLD,38));
        Formno.setBounds(140,20,600,40);
        add(Formno);
        
//        Personal Details
        JLabel personalDetails=new JLabel("Page 1:  Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
//        Name
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
//        Name Textfield
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,22));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
//        Fathers Name
        JLabel fname=new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
//        Fathers Name Textfield
         fatherTextField=new JTextField();
        fatherTextField.setFont(new Font("Raleway", Font.BOLD,22));
        fatherTextField.setBounds(300,190,400,30);
        add(fatherTextField);
        
//        Date of Birth
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
//        Calender for Dates
        dobc=new JDateChooser();
        dobc.setBounds(300,240,400,30);
        add(dobc);
        
//        Gender
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
//        Male Radiobutton
        male= new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
//        Female Redio Button
        female= new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
//        Gender Group
        ButtonGroup genders= new ButtonGroup();
        genders.add(male);
        genders.add(female);
        
//        Email
        JLabel email=new JLabel("Email: ");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
//        Email Textfield
         emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD,22));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
//        Marital Status
        JLabel marital=new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
//        Married Radiobutton
        married= new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);
        
//        Unmarried Redio Button
        unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        //        others Redio Button
        others= new JRadioButton("Others");
        others.setBounds(600,390,120,30);
        others.setBackground(Color.WHITE);
        add(others);
        
//       marital status Group
        ButtonGroup maritalstatus= new ButtonGroup();
        maritalstatus.add(married);
        maritalstatus.add(unmarried); 
        maritalstatus.add(others);
        
//        ADdress
        JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
//        ADdress TextField
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD,22));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
//        City
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
//        City TextField
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,22));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
//        State
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
//        State TextField
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,22));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
//        pincode
        JLabel pincode=new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
//        Pincode Textfield
        pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD,22));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
//        Button
        button=new JButton("Next");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Raleway",Font.BOLD,14));
        button.setBounds(620,660,80,30);
        add(button);
        button.addActionListener(this);
    }
    
//    Override method
    public void actionPerformed(ActionEvent ae){
        String formno="" + random; /*long*/
        String name=nameTextField.getText();
        String fname=fatherTextField.getText();
        String dob=((JTextField) dobc.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if (female.isSelected()){
            gender="Female";
        }
        
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            gender="Married";
        }else if (unmarried.isSelected()){
            gender="Unmarried";
        }else if (others.isSelected()){
            gender="Others";
        }
        String address= addressTextField.getText();
        String city= cityTextField.getText();
        String state= stateTextField.getText();
        String pin= pinTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else{
                conn c=new conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(q1);
                
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
         }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String [] args){
        new signUpOne();
    }
}
