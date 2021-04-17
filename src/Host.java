import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Host extends JFrame {
	    private JButton b1,b2,b3;
	    private JLabel ll,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,image,lp3,llp3,hos;
	    Image img;
	public 	Host() {
		
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		
		ImageIcon img1=new ImageIcon("images//administrator-24.png");
		b1=new JButton("<html><font color='white'>Admin</font></html>",img1);
		b1.setBackground(new Color(7, 20, 14));
		
		ImageIcon img2=new ImageIcon("images//doctor.png");
		b2=new JButton("<html><font color='white'>Doctor</font></html>",img2);
		b2.setBackground(new Color(7, 20, 14));
		
		
		ImageIcon img3=new ImageIcon("images//calendar-7-24.png");
		b3=new JButton("<html><font color='white'>Appointment</font></html>",img3);
		b3.setBackground(new Color(7, 20, 14));
		
		ImageIcon img4=new ImageIcon("images//hospital-256.png");
		image = new JLabel(img4,JLabel.CENTER);
	
		
		//JLabel ll=new JLabel("<html><font color='red'>font</font></html>");
		//Panel 1
		ll=new JLabel();
		l=new JLabel("Hospital Management System",JLabel.CENTER);
		l.setForeground(new Color(255, 255, 255));
		l.setOpaque(true);
		l.setBackground(new Color(7, 20, 14));
		l.setFont(new Font("Arial",0, 24));
		l.setPreferredSize(new Dimension(100,100));
		//Panel 2
		l1=new JLabel("");
		l2=new JLabel("");
		l3=new JLabel("");
	    l4=new JLabel("");
		l5=new JLabel("");
		l6=new JLabel("");
		l7=new JLabel("");
		l8=new JLabel("");
		l9=new JLabel("");
		//Panel 3
		lp3=new JLabel("Welcome to ");
		lp3.setFont(new Font("Arial",Font.BOLD,20));
		lp3.setForeground(Color.white);
		llp3=new JLabel(" Hospital Management System");
		llp3.setForeground(new Color(35, 103, 134));
		ImageIcon hospital=new ImageIcon("images//hospital-5-128.png");
		hos = new JLabel(hospital);
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(900,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Hospital Management System");
		
	
		p1.setBackground(new Color(35, 103, 134));
		p2.setBackground(new Color(35, 103, 134));
		p3.setBackground(new Color(7, 20, 14));
		p1.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(200,200));
		p1.setLayout(new GridLayout(2,1,0,0));
		p2.setLayout(new GridLayout(1,2,0,0));
		p3.setLayout(new FlowLayout());
		p.setLayout(new BorderLayout());
		f.add(p);
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.WEST);
		
		p1.add(ll);
		p1.add(l);
		
		p4.setBackground(new Color(35, 103, 134));
		p5.setBackground(new Color(35, 103, 134));
		p2.add(p4);
		p2.add(p5);
		p4.setLayout(new GridLayout(4,1,10,10));
		p4.add(l1);
		p4.add(b1);
		p4.add(b3);
		p4.add(l2);
		p5.add(image);
	
		
		p3.add(lp3);
		p3.add(llp3);
		p3.add(hos);
		
		
		//button 1
		class Action1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Check c=new Check();
			f.setVisible(false);
			
		}
	}
		b1.addActionListener(new Action1());
		
			
			//button 3
			class Action3 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					checkforadoctortosetappointementdoctor d=new checkforadoctortosetappointementdoctor();


				}
			}
				b3.addActionListener(new Action3());
	
				//hover
				b1.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				        b1.setBackground(new Color(78, 162, 186));
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				        b1.setBackground(new Color(7, 20, 14));
				    }
				});
				
				b2.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				        b2.setBackground(new Color(78, 162, 186));
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				        b2.setBackground(new Color(7, 20, 14));
				    }
				});
				b3.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				        b3.setBackground(new Color(78, 162, 186));
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				        b3.setBackground(new Color(7, 20, 14));
				    }
				});
				
				
				}
	
	
	public static void main(String[] args) {
	Host h=new Host();
	
	
	}

	
}

	

