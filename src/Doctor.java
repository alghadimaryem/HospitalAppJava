import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Doctor extends JFrame {

	private JLabel ll,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,lp3,llp3,lll;
	private JButton backs,app;
	public 	Doctor() {
		
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();

	
		ImageIcon img1=new ImageIcon("images//appointment.png");
		app=new JButton("Appointment",img1);
		app.setBackground(Color.lightGray);
		
		
		//Panel 1
		ll=new JLabel();
		l=new JLabel("Doctor Activity",JLabel.CENTER);
		l.setForeground(new Color(255, 255, 255));
		l.setOpaque(true);
		l.setBackground(new Color(0, 0, 0));
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
	    llp3=new JLabel("Doctor Activity");


		
		
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(1025,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Doctor Activity");
		
	
		
		p1.setBackground(new Color(0,0,0));
		p2.setBackground(new Color(35, 103, 134));
		p3.setBackground(new Color(0,0,0));
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
		p2.add(l2);
		p2.add(l3);
		//appointment
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		
		p3.add(lp3);
		p3.add(llp3);
		
		//back
		ll=new JLabel();
		lll=new JLabel();
		ImageIcon back=new ImageIcon("images//backs.png");
		backs=new JButton(back);
		backs.setOpaque(true);
		backs.setBackground(new Color(35, 103, 134));
		p1.setLayout(new BorderLayout());
		p1.setBackground(new Color(35, 103, 134));
		p1.setPreferredSize(new Dimension(100,100));
		ll.setPreferredSize(new Dimension(40,40));
		p1.add(ll,BorderLayout.NORTH);
		p1.add(l,BorderLayout.CENTER);
		p1.add(backs,BorderLayout.EAST);
		p1.add(lll,BorderLayout.WEST);
		lll.setPreferredSize(new Dimension(80,80));
		lll.setOpaque(true);
		lll.setBackground(new Color(35, 103, 134));

		//button back
		class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Host h=new Host();
			f.setVisible(false);

		}
	}
		backs.addActionListener(new Action());
		
	}
	
	public static void main(String[] args) {
		Doctor p=new Doctor();
	}
}