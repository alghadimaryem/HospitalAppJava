import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public  class appointementfirspage extends JFrame {
	    private JButton b1,b2,b3;
	    private JLabel ll,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,image,lp3,llp3,hos;

	public 	appointementfirspage() {
		
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel(); 
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		b1=new JButton("<html><font color='white'>Appointment</font></html>");
		b1.setBackground(new Color(7, 20, 14));
		b1.setBackground(Color.lightGray);
	
	
		
		//Panel 1
		ll=new JLabel();
		l=new JLabel("appointement page",JLabel.CENTER);
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
		lp3=new JLabel("");
		lp3.setFont(new Font("Arial",Font.BOLD,20));
		lp3.setForeground(Color.white);
		llp3=new JLabel(" Appointment");
		ImageIcon hospital=new ImageIcon("images//calendar-7-128.png");
		hos = new JLabel(hospital);
		p3.setBackground(new Color(7, 20, 14));
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(900,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Hospital Management System");
		
	
p2.add(b1);
		p1.setBackground(new Color(35, 103, 134));
		p2.setBackground(new Color(35, 103, 134));
		p1.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(200,200));
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
		
		 
		p3.add(lp3);
		p3.add(llp3);
		p3.add(hos);
		
		
		
		class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			appointementlastpage c=new appointementlastpage();

		}
	}
		b1.addActionListener(new Action());
	}
	
	public static void main(String[] args) {
	appointementfirspage h=new appointementfirspage();
	}

	
}

	

