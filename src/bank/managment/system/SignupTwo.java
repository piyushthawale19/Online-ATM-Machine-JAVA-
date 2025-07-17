 package bank.managment.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
 
    JTextField  pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,occupation,education;
    String formno;
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
         setTitle("NEW ACCOUNT APLICATION FROM - PAGE 2");
        
      
        
         JLabel additionalDetails = new JLabel("PAGE 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400 ,30);
        add(additionalDetails);
        
        
        JLabel  name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100 ,30);
        add(name);
        
        String valReligion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,150 ,30);
        add(fname);
        
        String valCategory [] = {"Genral","OBC","ST","SC","Other"};
        category = new JComboBox(valCategory);
        category.setBackground(Color.white);
        category.setBounds(300, 190,400,30);
        add(category);
        
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,150 ,30);
        add(dob);
        
        
         String valIncome [] = {" Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
          income = new JComboBox(valIncome);
        income.setBackground(Color.white);
        income.setBounds(300,240,400,30);
        add(income);
        
        
     
        
        
        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,150 ,30);
        add(gender);
        
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,150 ,30);
        add(email);
        
        String Educationvalues [] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        education = new JComboBox(Educationvalues);
        education.setBackground(Color.white);
        education.setBounds(300,315,400,30);
        add(education);
        
        
        
        
        
        
        
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150 ,30);
        add(marital);
        
        String Occupationvalues [] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        occupation = new JComboBox(Occupationvalues);
        occupation.setBackground(Color.white);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
        
        
        
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150 ,30);
        add(address);
        
           pan= new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,442,400,30);
        add(pan);
        
        
        JLabel  city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200 ,30);
        add(city);
        
          aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
         
        
        JLabel  state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150 ,30);
        add(state);
        
        syes =new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
         sno =new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
         
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
         
          
        
        
        JLabel  pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200 ,30);
        add(pincode);
        
        eyes =new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno =new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
         
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
         
        next =new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white); 
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
       
        
      getContentPane().setBackground(Color.white);
      
        
        
     setSize(850,800);
     setLocation(350,10);
     setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        
        String sreligion =(String)religion.getSelectedItem();
        String scategory =(String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation =(String)education.getSelectedItem();
        String soccupation =(String)occupation.getSelectedItem();
        
        String seniorcitizen= null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        } else if(sno.isSelected()){
        seniorcitizen="No";
           }  
//         
         
         String exisitingaccount  =null;
         if(eyes.isSelected()){
             exisitingaccount="Yes";
         }else if (eno.isSelected()){
             exisitingaccount=" No";
         } 
        String span = pan.getText();
        String saadhar = aadhar.getText();
         
        
        try{
            if(sreligion.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Requried");
            }
             if(scategory.equals("")){
               JOptionPane.showMessageDialog(null,"Fname is Requried");
           } if(sincome.equals("")){
              JOptionPane.showMessageDialog(null,"Date of Birth is Requried");
          }   if(seducation.equals("")){
               JOptionPane.showMessageDialog(null,"email is Requried");
            }   if(soccupation.equals("")){
                JOptionPane.showMessageDialog(null,"Address is Requried");
            } if(seniorcitizen.equals("")){
                JOptionPane.showMessageDialog(null,"City is Requried");
            } if(exisitingaccount.equals("")){
                JOptionPane.showMessageDialog(null,"State is Requried");
            } if(span.equals("")){
                JOptionPane.showMessageDialog(null,"Pincode is Requried");
               } if(saadhar.equals("")){
                JOptionPane.showMessageDialog(null,"Pincode is Requried");
               } 

                else{
                Conn c = new Conn();
                String query ="insert into Signuptwo values('"+formno+"','"+sreligion+"','"+ scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                 c.s.executeUpdate(query);

         
               }
               setVisible(false);
               new SignupThree(formno).setVisible(true);
        }catch (Exception e){

            System.out.println(e);
        }
        }

    
      public static void main(String args[]){
          new SignupTwo("");
      }
}