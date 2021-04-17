import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Check extends JFrame  {
	
	private JLabel l,ll,l1,l2,lvide1,lvide2,lvide3,lvide4;
	private JButton b1,b2;
	private JTextField txt;
	private JPasswordField pss;
	
	public Check() {
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		f.setVisible(true);
		f.setLocation(380,100);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(500,550);
		f.setTitle("Check");
		
		//panel 1
		
		l=new JLabel("");
		ll=new JLabel("Hospital Management System",JLabel.CENTER);
		ll.setForeground(new Color(255,255,255));
		ll.setOpaque(true);
		ll.setBackground(new Color(35, 103, 134));
		
		//panel 2
		l1=new JLabel("Username :                ",JLabel.RIGHT);
		l1.setForeground(Color.black);
		l1.setFont(new Font("Arial",15,20));
		l2=new JLabel("Password :                ",JLabel.RIGHT);
		l2.setForeground(Color.black);
		l2.setFont(new Font("Arial",15,20));
		lvide1=new JLabel("");
		lvide2=new JLabel("");
		
		//panel 3
		ImageIcon img1=new ImageIcon("images//home-7-24.png");
	    b1=new JButton("Home",img1);
	    ImageIcon img2=new ImageIcon("images//login-24.png");
		b2=new JButton("Login",img2);
		lvide3=new JLabel("");
		lvide4=new JLabel("");
		b1.setPreferredSize(new Dimension(50,50));
		b2.setPreferredSize(new Dimension(50,50));
		b1.setBackground(new Color(35, 103, 134));
		b2.setBackground(new Color(35, 103, 134));
		b1.setForeground(new Color(255, 255, 255));
		b2.setForeground(new Color(255, 255, 255));
		
	     txt=new JTextField();
	     pss=new JPasswordField();
	    txt.setEditable(true);
	    pss.setEditable(true);
		
		f.add(p);
		p.setLayout(new BorderLayout());
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.SOUTH);
		
		p1.setLayout(new GridLayout(2,1,0,0));
		p1.setPreferredSize(new Dimension(100,100));
		p1.setBackground(new Color(237, 247, 243));
		
		p2.setLayout(new GridLayout(4,2,0,0));
		p2.setBackground(new Color(35, 103, 134));
	
		p3.setLayout(new GridLayout(2,4,100,100));
		p3.setBackground(new Color(35, 103, 134));
		
		//p1.add(l);
		p1.add(ll);
		
		p2.add(lvide1);
		p2.add(lvide2);
		p2.add(l1);
		p2.add(txt);
		p2.add(l2);
		p2.add(pss);
		p3.add(b1);
		p3.add(b2);
		p3.add(lvide3);
		p3.add(lvide4);
		//button home
		class Action1 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				Host h=new Host();
				f.setVisible(false);
			}
		}
		b1.addActionListener(new Action1());
		//button login
		class Action2 implements ActionListener{
			@Override
			
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("admin")&& pss.getText().equals("admin"))  {
				Admin p=new Admin();
				f.setVisible(false);
				}
				//if(txt.getText().equals("admin") ||pss.getText().equals("admin")){
				else{
					txt.setBorder(BorderFactory.createLineBorder(Color.red));
					pss.setBorder(BorderFactory.createLineBorder(Color.red));
				}
			}
		}
		b2.addActionListener(new Action2());
		
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
	}

	public static void main(String[] args) {

		Check c=new Check();
	}

}
