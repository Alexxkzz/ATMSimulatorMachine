package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
    JTextField panTextField,adharTextField;
    JButton button;
    JRadioButton yes,no,eyes,eno;
    JComboBox creligion,ccategory,cIncome,education,cOccupation;
    String formno;
    SignUpTwo(String formno){
        this.formno=formno;
        setLayout(null);
        setSize(850,800);
        setLocation(300,10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
//        Personal Details
        JLabel additionalDetails=new JLabel("Page 2:  Additional Details");
       additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
       additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
//        Religion
        JLabel religion=new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
//        Religion Combobox
        String valReligion[]={"Hindu","Muslim","Christian","Sikh","Buddhist","Jain","Parshi","Others"};
       creligion=new JComboBox(valReligion);
        creligion.setFont(new Font("Raleway", Font.BOLD,16));
        creligion.setBounds(300,140,400,30);
        creligion.setBackground(Color.WHITE);
        add(creligion);
        
        
//        Category
        JLabel category=new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        //        Religion Combobox
        String valCategory[]={"General","ST","SC","OBC","Others"};
        ccategory=new JComboBox(valCategory);
        ccategory.setFont(new Font("Raleway", Font.BOLD,16));
        ccategory.setBounds(300,190,400,30);
        ccategory.setBackground(Color.WHITE);
        add(ccategory);
        
//        Income
        JLabel Income=new JLabel("Income: ");
        Income.setFont(new Font("Raleway", Font.BOLD,20));
       Income.setBounds(100,240,200,30);
        add(Income);
        
//        Income Combobox
        String valIncome[]={"Null","<1,00,000","< 2,50,000","<5,00,000","Upto <10,00,000"};
        cIncome=new JComboBox(valIncome);
        cIncome.setFont(new Font("Raleway", Font.BOLD,16));
        cIncome.setBounds(300,240,400,30);
        cIncome.setBackground(Color.WHITE);
        add(cIncome);
        
//        Educational Qualification
        JLabel gender=new JLabel("Educational ");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
            
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        //       Educational Qualification Combobox
        String valEducation[]={"Non.Graduate","Graduate","Post-Graduation","Docatrate","Others"};
        education=new JComboBox(valEducation);
        education.setFont(new Font("Raleway", Font.BOLD,16));
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
//        Occupation
        JLabel occupation=new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
//        Occupation Combobox
         String valOccupation[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        cOccupation=new JComboBox(valOccupation);
        cOccupation.setFont(new Font("Raleway", Font.BOLD,16));
        cOccupation.setBounds(300,390,400,30);
        cOccupation.setBackground(Color.WHITE);
        add(cOccupation);
        
//        PAN Number
        JLabel address=new JLabel("Pan Number: ");
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
//        PAN TextField
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD,22));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
//        Adhar Card
        JLabel city=new JLabel("Adhar Number: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
//        Adhar Card TextField
        adharTextField=new JTextField();
        adharTextField.setFont(new Font("Raleway", Font.BOLD,22));
        adharTextField.setBounds(300,490,400,30);
        add(adharTextField);
        
//        Sinior Citizen
        JLabel state=new JLabel("Sinior Citizen: ");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

//        Yes Radiobutton
        yes= new JRadioButton("Yes");
        yes.setBounds(300,540,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
//        no Redio Button
        no= new JRadioButton("No");
        no.setBounds(450,540,120,30);
        no.setBackground(Color.WHITE);
        add(no);
        
//        senior Group
        ButtonGroup seniorButton= new ButtonGroup();
        seniorButton.add(yes);
        seniorButton.add(no);
 
        
        
//        Exiting Account
        JLabel pincode=new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
//        eYes Radiobutton
        eyes= new JRadioButton("Yes");
        eyes.setBounds(300,590,60,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
//        eno Redio Button
        eno= new JRadioButton("No");
        eno.setBounds(450,590,60,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
//        existing Group
        ButtonGroup existingButton= new ButtonGroup();
        existingButton.add(eyes);
        existingButton.add(eno);
        
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
        String sreligion=(String)creligion.getSelectedItem();
        String scategory=(String)ccategory.getSelectedItem();
        String sIncome=(String)cIncome.getSelectedItem();
        String sEducation=(String)education.getSelectedItem();
        String soccupation=(String)cOccupation.getSelectedItem();
        String span=panTextField.getText();
        String sadhar=adharTextField.getText();
        String sYes=null;
        if(yes.isSelected()){
            sYes="Yes";
        }else if (no.isSelected()){
            sYes="No";
        }
        
        String eYes=null;
        if(eyes.isSelected()){
            eYes="Yes";
        }else if (eno.isSelected()){
            eYes="No";
        }
        
        try{
            if(span.equals("")){
                JOptionPane.showMessageDialog(null,"PAN is Required");
            }else{
                conn c=new conn();
                String q1 = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sIncome+"','"+sEducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+sYes+"','"+eYes+"')";
                c.s.executeUpdate(q1);
                setVisible(false);
                new SignUpThree(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String [] args){
        new SignUpTwo("");
    }
}
