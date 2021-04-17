import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class UpdateDoctor extends JFrame{
	
	private JLabel l,v1,v2,v3,ll,lll;
	private Object[ ] [ ] table = {
			{ new Integer(1) , new Date (14-03-2020) ,"sjb0HMS1" , " ALGHADI " ,"Maryem",new Integer(20),"female","Morroco"} ,
			{ new Integer(1) , new Date (16-06-2020) ,"sjb0HMS1" , " EL YOUSFI " ,"Zakariae",new Integer(20),"male","Morroco"} ,
			{ new Integer(1) , new Date (04-04-2020) ,"sjb0HMS1" , " MOKHTARI " ,"chaymae",new Integer(20),"female","Morroco"} ,
	
			} ;
			private String[ ] columnNames ={ "count " , "date " , " id " , " name ","Age","Gender","Adress","Phone number" } ;
			private JLabel name;
			private JTextField txt;
			private JButton b,backs;
	public UpdateDoctor(){
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		
		name=new JLabel("Name of patient");
		txt=new JTextField(10);
		b=new JButton("Delete");
		b.setBackground(new Color(35, 103, 134));
		JTable tab=new JTable(table,columnNames);
		
		f.setVisible(true);
		f.setLocation(125, 100);
		f.setSize(1025,550);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("update");
		
		f.add(p);
		p.setLayout(new BorderLayout());
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		
		v1=new JLabel("");
		l=new JLabel("Update Doctor",JLabel.CENTER);
		l.setForeground(new Color(255, 255, 255));
		l.setOpaque(true);
		l.setBackground(new Color(35, 103, 134));
		l.setFont(new Font("Arial",0, 24));
		l.setPreferredSize(new Dimension(100,100));
	
		
		p1.setLayout(new BorderLayout());
		p1.setPreferredSize(new Dimension(100,100));
		p1.setBackground(new Color(237, 247, 243));
		p1.add(v1,BorderLayout.NORTH);
		v1.setPreferredSize(new Dimension(40,40));
		p1.add(l,BorderLayout.CENTER);
		///////////////////////////////////////////////////////////////////////////////////§//
		JButton update=new JButton("modifier");
		JPanel p5=new JPanel();
		p5.setLayout(new FlowLayout());
		p2.setBackground(new Color(237, 247, 243));
		p2.setLayout(new BorderLayout());
		//p2.add(p3,BorderLayout.NORTH);
		p3.setPreferredSize(new Dimension(50,50));
		p3.setPreferredSize(new Dimension(50,50));
		p5.setPreferredSize(new Dimension(50,50));
		p5.add(update);
		p2.add(p4,BorderLayout.CENTER);
		p2.add(p5,BorderLayout.SOUTH);

		//////////////////////////////////////////////////////////////////////////
		p3.setLayout(new GridLayout(1,3,0,0));
		p3.add(name);
		p3.add(txt);
		p3.add(b);
		
		p4.add(tab);
		
		//back
				ll=new JLabel();
				lll=new JLabel();
				ImageIcon back=new ImageIcon("images//backs.png");
				backs=new JButton(back);
				backs.setOpaque(true);
				backs.setBackground(new Color(35, 103, 134));
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
				lll.setBackground(new Color(35, 103, 134));
		
				//button back
				class Action implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					DoctorInfo i=new DoctorInfo();
					f.setVisible(false);

				}
			}
				backs.addActionListener(new Action());
	}

	
	public static void main(String[] args) {
		UpdateDoctor up=new UpdateDoctor();
		}

}
