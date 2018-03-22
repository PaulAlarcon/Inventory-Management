package ID;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

	public class ReportGUI implements ActionListener {
		
		public ReportGUI() {}

		//variables
		
		static String id = "";
		static int hours = 0;
		
		//Objectors
		
		Report r = new Report();
		LineItem lineItem;
		IDs ID = IDIO.get(id);
		
		//components		

		JFrame f;
		JTextField tq,tid;
		JTextArea tA,tB;
		JScrollPane scroll;
		JButton bAdd, blist,bback,bexit;
		JLabel lwelcome = new JLabel("Welcome to the Report Application");
		JLabel lwelcome2 = new JLabel("This app will display an approx. weekly wage");
		JLabel lnumberid = new JLabel("Please enter your number ID: ");
		JLabel lhours = new JLabel("Enter the hours worked (week): ");

		//constructors

		{
		scroll = new JScrollPane(tB, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		f = new JFrame("");
		tq = new JTextField("");
		tid = new JTextField("");
		tA = new JTextArea("");
		tB = new JTextArea("");
		bAdd = new JButton("Add");
		blist = new JButton("Show IDs.");
		bback = new JButton("");
		bexit = new JButton("");

		//positions
		
		lwelcome.setBounds(120, 50, 550, 40);
		lnumberid.setBounds(120, 150, 350, 25);
		lhours.setBounds(120, 200, 350, 25);
		tid.setBounds(450, 150, 150, 25);
		tq.setBounds(450, 200, 75, 25);
		bAdd.setBounds(120,275, 150, 25);
		blist.setBounds(400,275,150,25);
		bexit.setBounds(220, 650, 49, 49);
		bback.setBounds(120,650,49,49);
		tA.setBounds(100, 350, 650, 225);
		tB.setBounds(800, 50, 850, 600);
		
		//add components to the frame

		f.add(lwelcome);
		f.add(lnumberid);
		f.add(lhours);
		f.add(tq);
		f.add(bAdd);
		f.add(blist);
		f.add(scroll);
		f.add(tB);
		f.add(tA);
		f.add(tid);
		f.add(bexit);
		f.add(bback);
		
		//==ICONS===
		 
	
		 Image img1 = new ImageIcon(this.getClass().getResource("/arrow-back-icon.png")).getImage();
		 bback.setIcon(new ImageIcon(img1));
		 bback.setBackground(Color.white);
		
		 Image img2 = new ImageIcon(this.getClass().getResource("/Actions-application-exit-icon.png")).getImage();
		 bexit.setIcon(new ImageIcon(img2));
		 bexit.setBackground(Color.red);
	

		//setting frame

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1700,800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		bAdd.addActionListener(this);
		blist.addActionListener(this);
		bexit.addActionListener(this);
		bback.addActionListener(this);

		//FONT 

		lwelcome.setFont(new Font("Gill Sans MT", Font.BOLD , 30));
		lnumberid.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		lhours.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		tq.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		bAdd.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		blist.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		tA.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		tB.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		tid.setFont(new Font("Gill Sans MT", Font.BOLD , 20));

		//Text

		tA.setBackground(Color.WHITE);
		tA.setEditable(false);
		try {
			tA.setText(Main.displayAllIds());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tA.setVisible(false);
		tB.setEditable(false);
		
		}
		
		

		public void actionPerformed(ActionEvent e)
		{	
			if(e.getSource()==bback )
			{	
				f.dispose();		
				GUI frame = new GUI();
				frame.setVisible(true);
			}
			
			if(e.getSource()==bexit)
			{					
				f.dispose();				
			}
			
			
			if(e.getSource()==bAdd )
			{					
				id = tid.getText();
				hours =  Integer.parseInt(tq.getText());
				IDs d = IDIO.get(id);
				r.addItem(new LineItem(d, hours));
				tB.setText(IDsApp.displayReport(r));
						
			}
			
			if(e.getSource()==blist )
			{	
				
				if(blist.getText() == "Show IDs.")
				{					
					blist.setText("Hide IDs.");	
					tA.setVisible(true);
				}
				else if(blist.getText() == "Hide IDs.")
				{					
					blist.setText("Show IDs.");
					tA.setVisible(false);
				}

			}	
		}

		public static void main(String[] args)
		{
			new ReportGUI();
		}


		protected void setVisible(boolean b) {
			
			// TODO Auto-generated method stub
			
		}
		
		
	}

	



