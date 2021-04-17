import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Admin extends JFrame {

	private JLabel ll,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,lp3,llp3,lll;
	private JButton b1,b2,b3,backs;
	public 	Admin() {
		
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		ImageIcon img1=new ImageIcon("images//guest-48.png");
		b1=new JButton("<html><font color='white'>Patient Info</font></html>",img1);
		b1.setBackground(new Color(7, 20, 14));
		
		ImageIcon img2=new ImageIcon("images//doctor-2-48.png");
		b2=new JButton("<html><font color='white'>Doctor Info</font></html>",img2);
		b2.setBackground(new Color(7, 20, 14));
		
		
		ImageIcon img3=new ImageIcon("images//assistant-48.png");
		b3=new JButton("<html><font color='white'>Receptionist Info</font></html>Reception Info",img3);
		b3.setBackground(new Color(7, 20, 14));
	
		
		//JLabel ll=new JLabel("<html><font color='red'>font</font></html>");
		//Panel 1
		ll=new JLabel();
		l=new JLabel("Admin Portal",JLabel.CENTER);
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
	    llp3=new JLabel("    Admin Portal");
	    llp3.setForeground(new Color(35, 103, 134));
	    llp3.setBackground(new Color(53, 153, 134));
	    ImageIcon img4=new ImageIcon("images//administrator-2-128.png");
		JLabel image = new JLabel(img4,JLabel.CENTER);
		p3.add(image);

		
		
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(900,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Admin Portal");
		
	
		
		p1.setBackground(new Color(35, 103, 134));
		p2.setBackground(new Color(35, 103, 134));
		p3.setBackground(new Color(7, 20, 14));
		p1.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(200,40));
		p1.setLayout(new GridLayout(2,1,0,0));
		p2.setLayout(new GridLayout(4,3,10,10));
		p3.setLayout(new FlowLayout());
		p.setLayout(new BorderLayout());
		f.add(p);
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.WEST);
		
		p1.add(ll);
		p1.add(l);
		
		p2.add(l1);
		p2.add(b1);
		p2.add(l2);
		p2.add(l3);
		p2.add(b2);
		p2.add(l4);
		p2.add(l5);
		p2.add(b3);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		
		p3.add(lp3);
		p3.add(llp3);
		
		//back
		ll=new JLabel();
		ll.setOpaque(true);
		ll.setBackground(new Color(35, 103, 134));
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
			Host h=new Host();
			f.setVisible(false);

		}
	}
		backs.addActionListener(new Action());
		//button 1
		class Action1 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				PatientInfo i=new PatientInfo();
				f.setVisible(false);

			}
		}
			b1.addActionListener(new Action1());
		//button 2
			class Action2 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					DoctorInfo i=new DoctorInfo();
					f.setVisible(false);
				}
			}
				b2.addActionListener(new Action2());
				//button 3
				class Action3 implements ActionListener{
					@Override
					public void actionPerformed(ActionEvent e) {
						ReceptionistInfo r=new ReceptionistInfo();
						f.setVisible(false);

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
		Admin p=new Admin();
	}
}