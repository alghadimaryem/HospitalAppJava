import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ReceptionistInfo extends JFrame {
	private JLabel vide;
	private JLabel l,ll,lp3,llp3,v1,v2,v3,v4,v5,v6,v7,v8,v9;
	private JButton b1,b2,b3,b4,b5,backs;
	
	public ReceptionistInfo() {
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		//panel1
		ll=new JLabel();
		ll.setOpaque(true);
		l=new JLabel("Receptionist Information",JLabel.CENTER);
		l.setForeground(Color.white);
		l.setOpaque(true);
		l.setBackground(new Color(7, 20, 14));
		l.setFont(new Font("Arial",0, 24));
		l.setPreferredSize(new Dimension(100,100));
		
		//panel 2
		//panel 2
				ImageIcon img1=new ImageIcon("images//add-user-2-48.png");
				b1=new JButton("<html><font color='white'>Add Receptionist</font></html>",img1);
				b1.setBackground(new Color(7, 20, 14));
				
				
				
				ImageIcon img3=new ImageIcon("images//remove-user-48.png");
				b3=new JButton("<html><font color='white'>Delete Receptionist</font></html>",img3);
				b3.setBackground(new Color(7, 20, 14));
				
				ImageIcon img4=new ImageIcon("images//search-10-48.png");
				b4=new JButton("<html><font color='white'>Search Receptionist</font></html>",img4);
				b4.setBackground(new Color(7, 20, 14));
				
				ImageIcon img5=new ImageIcon("images//list-view-48.png");
				JButton b5=new JButton("<html><font color='white'>View Receptionist</font></html>",img5);
				b5.setBackground(new Color(7, 20, 14));
				
		
		v1=new JLabel("");
		v2=new JLabel("");
		v3=new JLabel("");
		v4=new JLabel("");
		v5=new JLabel("");
		v6=new JLabel("");
		v7=new JLabel("");
		v8=new JLabel("");
		v9=new JLabel("");
		
		ImageIcon back=new ImageIcon("images//arrow-92-48.png");
		backs=new JButton(back);
		backs.setBackground(new Color(7, 20, 14));
		vide=new JLabel("");
		vide.setBackground(new Color(7, 20, 14));
		
		//panel 3
		JLabel lp3=new JLabel("Welcome to ");
		lp3.setFont(new Font("Arial",Font.BOLD,20));
		lp3.setForeground(Color.white);
		JLabel llp3=new JLabel(" Hospital Management System");
 
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
		
		p1.setLayout(new BorderLayout());
		p1.setBackground(new Color(237, 247, 243));
		p1.setPreferredSize(new Dimension(100,100));
		p1.add(ll,BorderLayout.NORTH);
		ll.setBackground(new Color(35, 103, 134));
		ll.setPreferredSize(new Dimension(40,40));
		p1.add(l,BorderLayout.CENTER);
		p1.add(backs,BorderLayout.EAST);
		p1.add(vide,BorderLayout.WEST);
		vide.setPreferredSize(new Dimension(100,100));
		vide.setOpaque(true);
		vide.setBackground(new Color(7, 20, 14));
		
		p2.setLayout(new GridLayout(4,3,50,50));
		p2.setBackground(new Color(35, 103, 134));
		p2.add(v1);
		p2.add(b1);
		p2.add(v2);
		p2.add(v3);
		p2.add(b3);
		p2.add(v4);
		p2.add(v5);
		p2.add(b4);
		p2.add(v6);
		p2.add(v7);
		p2.add(b5);
		p2.add(v8);
		
		ImageIcon pat=new ImageIcon("images//assistant-128.png");
		JLabel patient =new JLabel(pat);
		p3.add(patient);
		
		p3.setLayout(new FlowLayout());
		p3.setPreferredSize(new Dimension(200,200));
		p3.setBackground(new Color(7, 20, 14));
		
		//button back
		class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Admin p=new Admin();
			f.setVisible(false);

		}
	}
		backs.addActionListener(new Action());
		
		//button 1
				class Action1 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					AddReceptionist i=new AddReceptionist();
					f.setVisible(false);

				}
			}
				b1.addActionListener(new Action1());
				
				//button 2
				/*
				class Action2 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					UpdateReceptionist up=new UpdateReceptionist();
					f.setVisible(false);

				}
			}
				b2.addActionListener(new Action2());*/
				
				//button 3
				class Action3 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					DeleteReceptionist d=new DeleteReceptionist();
					f.setVisible(false);

				}
			}
				b3.addActionListener(new Action3());
				//button 4
				class Action4 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					SearchReceptionist src=new SearchReceptionist();
					f.setVisible(false);

				}
			}
				b4.addActionListener(new Action4());
				
				//button 5
				class Action5 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					ViewReceptionist g=new ViewReceptionist();
					f.setVisible(false);

				}
			}
				b5.addActionListener(new Action5());
				
				//hover
				b1.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				        b1.setBackground(new Color(78, 162, 186));
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				        b1.setBackground(new Color(7, 20, 14));
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
				b4.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				        b4.setBackground(new Color(78, 162, 186));
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				        b4.setBackground(new Color(7, 20, 14));
				    }
				});
				
				b5.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				        b5.setBackground(new Color(78, 162, 186));
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				        b5.setBackground(new Color(7, 20, 14));
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
		ReceptionistInfo r=new ReceptionistInfo();
	}

}
