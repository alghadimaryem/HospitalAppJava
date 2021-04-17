import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
public class DeleteDoctor extends JFrame{
	
	private Connection con;
	private Statement st;
	private ResultSet rs,rs2;
	
	private JLabel l,v1,v2,v3,ll,lll;
	
			private String[ ] columnNames ={ "count " , "date " , " id " , " name ","Age","Gender","Adress","Phone number" } ;
			private JLabel name;
			private JTextField txt;
			private JButton b,backs;
	public DeleteDoctor(){
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		
		name=new JLabel("Name to delete        :",JLabel.CENTER);
		name.setForeground(Color.white);
		txt=new JTextField(10);
		b=new JButton("<html><font color='white'>Delete</font></html>\"");
		b.setBackground(new Color(7, 20, 14));
		JTable tab=new JTable();
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(900,550);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Delete");
		
		f.add(p);
		p.setLayout(new BorderLayout());
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		
		v1=new JLabel("");
		v1.setOpaque(true);
		v1.setBackground(new Color(35, 103, 134));
		l=new JLabel("Delete Doctor",JLabel.CENTER);
		l.setForeground(new Color(255, 255, 255));
		l.setOpaque(true);
		l.setBackground(new Color(7, 20, 14));
		l.setFont(new Font("Arial",0, 24));
		l.setPreferredSize(new Dimension(100,100));
	
		
		
		p1.setLayout(new BorderLayout());
		p1.setPreferredSize(new Dimension(100,100));
		p1.setBackground(new Color(237, 247, 243));
		p1.add(v1,BorderLayout.NORTH);
		v1.setPreferredSize(new Dimension(40,40));
		p1.add(l,BorderLayout.CENTER);
		
		p2.setBackground(new Color(35, 103, 134));
		p2.setLayout(new BorderLayout());
		p2.add(p3,BorderLayout.NORTH);
		p3.setPreferredSize(new Dimension(50,50));
		p2.add(p4,BorderLayout.CENTER);
		
		
		p3.setLayout(new GridLayout(1,3,10,10));
		p3.setBackground(new Color(35, 103, 134));
		p3.add(name);
		p3.add(txt);
		p3.add(b);
		p4.setBackground(new Color(35, 103, 134));
		p4.add(tab);

		//back
		ll=new JLabel();
		lll=new JLabel();
		ImageIcon back=new ImageIcon("images//arrow-92-48.png");
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
			DoctorInfo i=new DoctorInfo();
			f.setVisible(false);

		}
	}
		backs.addActionListener(new Action());
		
		

		//DB
try {
	 Class.forName("com.mysql.jdbc.Driver");
	 
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
	 st=con.createStatement();
	 
	  
}	catch(Exception ex) {
	System.out.print("erreur"+ex);
	
}

//affiche
	try {

		
		String query2 ="SELECT * from doctor"; 
		rs2=st.executeQuery(query2);
		
		 
		tab.setModel(DbUtils.resultSetToTableModel(rs2));

	
	

	}catch(Exception ex) { 
		System.out.print(ex);
	
}
	//delete
	class Action1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			
			
				try {  
					String txtachercher=txt.getText();  

				String query ="DELETE FROM doctor WHERE name='"+txt.getText()+"'";

				int rs =st.executeUpdate(query);

					String query2 ="SELECT * from doctor"; 
					rs2=st.executeQuery(query2);
					tab.setModel(DbUtils.resultSetToTableModel(rs2));

					 
				} catch (SQLException e1) {
					e1.getMessage();
				}
			
			
			
		}}
	b.addActionListener(new Action1());
		
	b.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	        b.setBackground(new Color(78, 162, 186));
	    }

	    public void mouseExited(java.awt.event.MouseEvent evt) {
	        b.setBackground(new Color(7, 20, 14));
	    }
	});
	backs.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	backs.setBackground(new Color(78, 162, 186));
	    }

	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	backs.setBackground(new Color(7, 20, 14));
	    }
	});
		
	}

	
	public static void main(String[] args) {
		DeleteDoctor d=new DeleteDoctor();
		}

}
