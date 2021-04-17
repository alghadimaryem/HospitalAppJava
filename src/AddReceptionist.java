import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class AddReceptionist extends JFrame {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	private JLabel l,ll,lll,date,id,name,age,gender,
	adress,phonenumber,maritialstatus,diseasname,room,vide1,vide2,vide3,vide4,vide5,vide6,username,password;
	private JButton backs,add,clear;
	private JTextField dat,idd,nom,ag,genre,adres,phone,stat,
	maladie,chambre,usr,pssw;
	
	public AddReceptionist() {
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		
		
		
		//panel1
		ll=new JLabel();
		ll.setOpaque(true);
		ll.setBackground(new Color(35, 103, 134));
		lll=new JLabel();
		l=new JLabel("Add Receptionist",JLabel.CENTER);
		l.setForeground(Color.white);
		l.setOpaque(true);
		l.setBackground(new Color(7, 20, 14));
		l.setFont(new Font("Arial",0, 24));
		l.setPreferredSize(new Dimension(100,100));
		ImageIcon back=new ImageIcon("images//arrow-92-48.png");
		backs=new JButton(back);
		backs.setOpaque(true);
		backs.setBackground(new Color(7, 20, 14));
		
		//panel 2
		//labels
		vide1=new JLabel("");
		vide2=new JLabel("");
		date=new JLabel("Date :");
		id=new JLabel("id :");
		name=new JLabel("Name :");
		age=new JLabel("Age :");
		gender=new JLabel("Gender :");
		adress=new JLabel("Adress :");
		phonenumber=new JLabel("Phone Number :");
		maritialstatus=new JLabel("Maritial Status :");
		diseasname=new JLabel("Diseas Name :");
		room=new JLabel("Ward/Room no");
		date.setForeground(Color.white);
		id.setForeground(Color.white);
		name.setForeground(Color.white);
		age.setForeground(Color.white);
		gender.setForeground(Color.white);
		adress.setForeground(Color.white);
		phonenumber.setForeground(Color.white);
		maritialstatus.setForeground(Color.white);
		diseasname.setForeground(Color.white);
		room.setForeground(Color.white);
		//texts
		dat=new JTextField(15);
		idd=new JTextField(15);
		nom=new JTextField(15);
		ag=new JTextField(15);
		genre=new JTextField(15);
		adres=new JTextField(15);
		phone=new JTextField(15);
		stat=new JTextField(15);
		maladie=new JTextField(15);
		chambre=new JTextField(15);
		//buttons
		add=new JButton("Add");
		clear=new JButton("Clear");
		add.setBackground(new Color(30,144,255));
		clear.setBackground(Color.LIGHT_GRAY);
		//panel 3
		JLabel lp3=new JLabel("Welcome to ");
		lp3.setFont(new Font("Arial",Font.BOLD,20));
		lp3.setForeground(Color.white);
		JLabel llp3=new JLabel(" Hospital Management System");
		ImageIcon pat=new ImageIcon("images//patient3.png");
		JLabel patient =new JLabel(pat);
		
		//panel 4
		username=new JLabel("Username :");
		password=new JLabel("Password :");
		username.setForeground(Color.white);
		password.setForeground(Color.white);
		usr=new JTextField(10);
		pssw=new JTextField(10);
		vide3=new JLabel("");
		vide4=new JLabel("");
		vide5=new JLabel("");
		vide6=new JLabel("");
		p4.setLayout(new GridLayout(6,2,30,30));
		p4.add(vide3);
		p4.add(vide4);
		p4.add(vide5);
		p4.add(vide6);
		p4.add(username);
		p4.add(usr);
		p4.add(password);
		p4.add(pssw);
		
 
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(900,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Hospital Management System");
	
		f.add(p);
		p.setLayout(new BorderLayout());
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.WEST);
		p.add(p4,BorderLayout.EAST);
		
		p3.setPreferredSize(new Dimension(100,100));
		p4.setPreferredSize(new Dimension(300,300));
		p3.setBackground(new Color(35, 103, 134));
		p4.setBackground(new Color(35, 103, 134));
		
		p1.setLayout(new BorderLayout());
		p1.setBackground(new Color(237, 247, 243));
		p1.setPreferredSize(new Dimension(100,100));
		ll.setPreferredSize(new Dimension(40,40));
		p1.add(ll,BorderLayout.NORTH);
		p1.add(l,BorderLayout.CENTER);
		p1.add(backs,BorderLayout.EAST);
		p1.add(lll,BorderLayout.WEST);
		lll.setPreferredSize(new Dimension(80,80));
		lll.setOpaque(true);
		lll.setBackground(new Color(7, 20, 14));
		
		p2.setLayout(new GridLayout(6,4,30,30));
		p2.setBackground(new Color(35, 103, 134));
		p2.add(date);
		p2.add(dat);
		p2.add(adress);
		p2.add(adres);
		p2.add(id);
		p2.add(idd);
		p2.add(phonenumber);
		p2.add(phone);
		p2.add(name);
		p2.add(nom);
		p2.add(maritialstatus);
		p2.add(stat);
		p2.add(age);
		p2.add(ag);
		p2.add(diseasname);
		p2.add(maladie);
		p2.add(gender);
		p2.add(genre);
		p2.add(room);
		p2.add(chambre);
		p2.add(clear);
		p2.add(vide1);
		p2.add(add);
		p2.add(vide2);
		
		
		
		
	
		
		//button back
				class Action implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					ReceptionistInfo r=new ReceptionistInfo();

					f.setVisible(false);

				}
			}
				backs.addActionListener(new Action());
				
				
				//DB
				try {
					Class.forName("com.mysql.jdbc.Driver");
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
					 st=con.createStatement();
				}catch(Exception e) {
					e.printStackTrace();
					
				}
				//
				//Add button
				class Action1 implements ActionListener{
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
			
							for(int i=1;i<100;i++) {
							String query ="INSERT INTO `receptionist`(`count`, `date`, `id`, `name`, `age`, `gender`, `adress`, `phone number`, `status`, `diseas`, `room number`, `Username`, `password`) VALUES ('"+i+"','"+dat.getText()+"'"
											+ ",'"+idd.getText()+"','"+nom.getText()+"','"+ag.getText()+"','"+genre.getText()+"','"+adres.getText()+"','"+phone.getText()+"','"+stat.getText()+"','"+maladie.getText()+"','"+chambre.getText()+"',"
													+ "'"+usr.getText()+"','"+pssw.getText()+"')";
							st.execute(query);
							st.close();
							
						}
							}catch(Exception ex) {
							System.out.print(ex.getMessage());
							
	
						}
						}
					}
				
					add.addActionListener(new Action1());
					
					//clear button
					class Action2 implements ActionListener{
						@Override
						public void actionPerformed(ActionEvent e) {
							dat.setText("");
							idd.setText("");
							nom.setText("");
							ag.setText("");
							genre.setText("");
							adres.setText("");
							phone.setText("");
							stat.setText("");
							maladie.setText("");
							chambre.setText("");
							usr.setText("");
							pssw.setText("");
						}
					}
						clear.addActionListener(new Action2());
				
	
				//hover
						add.addMouseListener(new java.awt.event.MouseAdapter() {
						    public void mouseEntered(java.awt.event.MouseEvent evt) {
						        add.setBackground(new Color(35, 103, 134));
						    }

						    public void mouseExited(java.awt.event.MouseEvent evt) {
						        add.setBackground(new Color(30,144,255));
						    }
						});
						
						clear.addMouseListener(new java.awt.event.MouseAdapter() {
						    public void mouseEntered(java.awt.event.MouseEvent evt) {
						        clear.setBackground(new Color(35, 103, 134));
						    }

						    public void mouseExited(java.awt.event.MouseEvent evt) {
						        clear.setBackground(Color.LIGHT_GRAY);
						    }
						});
						backs.addMouseListener(new java.awt.event.MouseAdapter() {
						    public void mouseEntered(java.awt.event.MouseEvent evt) {
						    	backs.setBackground(new Color(35, 103, 134));
						    }

						    public void mouseExited(java.awt.event.MouseEvent evt) {
						    	backs.setBackground(new Color(7, 20, 14));
						    }
						});

				
				
	}

	public static void main(String[] args) {
		AddReceptionist i=new AddReceptionist();


	}

}
