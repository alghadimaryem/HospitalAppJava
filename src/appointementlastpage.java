import javax.swing.*;
import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.sql.Timestamp;

public class appointementlastpage extends JFrame{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	private JLabel l,v1,v2,v3,ll,lll;

			private JLabel name;
			private JTextField txt;
			private JButton b,backs;
	public appointementlastpage(){
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		
		name=new JLabel("liste des medcecins");
		txt=new JTextField(10);
		b=new JButton("Delete");
		b.setBackground(new Color(43, 191, 196));
		JTable tab=new JTable();
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(900,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("view");
		
		f.add(p);
		p.setLayout(new BorderLayout());
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		
		v1=new JLabel("");
		v1.setOpaque(true);
		v1.setBackground(new Color(35, 103, 134));
		l=new JLabel("Appointment List ",JLabel.CENTER);
		l.setForeground(new Color(255, 255, 255));
		l.setOpaque(true);
		l.setBackground(new Color(7, 20, 14));
		l.setFont(new Font("Arial",0, 24));
		l.setPreferredSize(new Dimension(100,100));
	
		
		p1.setLayout(new BorderLayout());
		p1.setPreferredSize(new Dimension(100,100));
		p1.setBackground(new Color(35, 103, 134));
		p1.add(v1,BorderLayout.NORTH);
		v1.setPreferredSize(new Dimension(40,40));
		p1.add(l,BorderLayout.CENTER);
		///////////////////////////////////////////////////////////////////////////////////?//
		JButton update=new JButton("modifier");
		JPanel p5=new JPanel();
		p5.setLayout(new FlowLayout());
		p2.setBackground(new Color(35, 103, 134));
		p2.setLayout(new BorderLayout());
		//p2.add(p3,BorderLayout.NORTH);
		p3.setPreferredSize(new Dimension(50,50));
		p3.setPreferredSize(new Dimension(50,50));
		p5.setPreferredSize(new Dimension(50,50));
	//	p5.add(update);
		p2.add(p4,BorderLayout.CENTER);
		p2.add(p5,BorderLayout.SOUTH);

		//////////////////////////////////////////////////////////////////////////
		p3.setLayout(new GridLayout(1,3,0,0));
		p3.add(name);
		p3.add(txt);
		//p3.add(b);
		p3.setBackground(new Color(35, 103, 134));
		p4.setBackground(new Color(35, 103, 134));
		p5.setBackground(new Color(35, 103, 134));
		p4.add(tab);
		
		//back
				ll=new JLabel();
				lll=new JLabel();
				ImageIcon back=new ImageIcon("images//home-7-48.png");
				backs=new JButton(back);
				backs.setOpaque(true);
				backs.setBackground(new Color(7, 20, 14));
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
				
				//button back
				class Action implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					PatientInfo i=new PatientInfo();
					f.setVisible(false);

				}
			}
				backs.addActionListener(new Action());
				//BD
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
					 st=con.createStatement();
				}catch(Exception e) {
					e.printStackTrace();
					
				}
				
			
				
					try {
						String nomdoctor="mohammed";
						String query ="SELECT `patient`, `diseas`, `date`, `gender` FROM `apointment` WHERE doctor='"+nomdoctor+"'";
						rs=st.executeQuery(query);
						//System.out.println("record from db");
						tab.setModel(DbUtils.resultSetToTableModel(rs));

					}catch(Exception ex) {
						System.out.print(ex.getMessage());
	
					} 
	}

	
	public static void main(String[] args) {
		appointementlastpage g=new appointementlastpage();
		}

}