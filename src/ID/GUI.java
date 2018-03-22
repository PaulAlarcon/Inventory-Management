package ID;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class GUI implements ActionListener {
		
		public GUI() {}

		//components		

		JFrame f;
		JButton bMI, bCW, bExit;
		JLabel lwelcome = new JLabel("Welcome to the Report/Database Application.");
		JLabel lwelcome2 = new JLabel("What would you like to do? ");
		{
		f = new JFrame("");
		bMI = new JButton("Manage Database.");
		bCW = new JButton("Report Application.");
		bExit = new JButton("");
		
		//positions
		
		//labels
		lwelcome.setBounds(100, 50, 600, 25);
		lwelcome2.setBounds(200, 100, 400, 25); 
		bMI.setBounds(100, 200, 250, 25);
		bCW.setBounds(450, 200, 250, 25);
		bExit.setBounds(100, 300, 32, 32);
		
		f.add(lwelcome);
		f.add(lwelcome2);
		f.add(bMI);
		f.add(bCW);
		f.add(bExit);
		
		//setting frame

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(800,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		bMI.addActionListener(this);
		bCW.addActionListener(this);
		bExit.addActionListener(this);

		Image img2 = new ImageIcon(this.getClass().getResource("/Actions-application-exit-icon.png")).getImage();
		 bExit.setIcon(new ImageIcon(img2));
		 bExit.setBackground(Color.red);

		//FONT 

		lwelcome.setFont(new Font("Gill Sans MT", Font.BOLD , 27));
		lwelcome2.setFont(new Font("Gill Sans MT", Font.BOLD , 25));
		bExit.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		bMI.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		bCW.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
	
		}

		public void actionPerformed(ActionEvent e)
		{
		
		if(e.getSource()==bMI )
		{	
			MainGUI frame = new MainGUI();
			frame.setVisible(true);
			f.dispose();
				
		}
		if(e.getSource()==bCW){ 
			
			f.dispose();
			ReportGUI frame = new ReportGUI();
			frame.setVisible(true);
		
			//ReportGUI.setVisible(true);
		}
		if(e.getSource()==bExit)
		{
			f.dispose();
		}
		
		}
	public static void main(String[] args)
		{
			new GUI();
		}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	}


	



