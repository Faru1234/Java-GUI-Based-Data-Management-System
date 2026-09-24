import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;





class Profile extends JFrame implements ActionListener{
	JLabel l1;
	JPanel p1;
	JButton b1;
	
		Profile(){
			super(" Profile ");
			this.setSize(400,400);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			Font f=new Font("Arial",Font.BOLD,18);
			l1=new JLabel("Technician Profile");
			l1.setFont(f);
			b1=new JButton("Exit");
			b1.addActionListener(this);
			p1=new JPanel();
			l1.setBounds(100,40,250,40);
			b1.setBounds(170,240,100,30);
			p1.setBounds(70,40,200,40);
			add(l1);
			add(b1);
			setLayout(null);	
		}
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b1){
				System.exit(0);
			}
		}	
}