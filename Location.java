 import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;





class Location extends JFrame implements ActionListener{
	JLabel l1;
	JPanel p1;
	JButton b1;

		Location(){
			super(" Location ");
			this.setSize(400,400);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			Font f=new Font("Arial",Font.BOLD,18);
			l1=new JLabel("Select Location");
			l1.setFont(f);
			b1=new JButton("Next");
			b1.addActionListener(this);
			p1=new JPanel();
			l1.setBounds(100,40,200,40);
			b1.setBounds(170,240,100,30);
			p1.setBounds(70,40,200,40);
			add(l1);
			add(b1);
			setLayout(null);	
		}
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b1){
				Payment p = new Payment();
				this.setVisible(false);
				p.setVisible(true);
			}
		}	
}