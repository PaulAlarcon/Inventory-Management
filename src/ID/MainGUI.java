package ID;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

	public class MainGUI implements ActionListener {
		
		public	MainGUI() {}

		//variables
		public String id = "" ;
		public String name = "" ;
		public String age = "" ;
		public String occupation = "";
		public double hourlywage = 0.0;
		
		IDs d = new IDs();
		
		//components		

		JFrame f;
		JButton blist, badd, bdel, bhelp, bexit,bback;
		JTextArea tArea,thelp;
		JLabel lwelcome = new JLabel("What are you looking to do ? ");
		
		//frame 2 components
		JFrame f2;
		JButton addall,addDone;
		JTextField tid,tname,tage,toccu,thw;
		JLabel lwe = new JLabel("Add a employee ");
		JLabel lid = new JLabel("ID: ");
		JLabel lname = new JLabel("Name: ");
		JLabel lage = new JLabel("Age: ");
		JLabel loccu = new JLabel("Occupation: ");
		JLabel lhw = new JLabel("Hourly Wage: ");
		JLabel tadded = new JLabel("");
		
		//frame 3 components
		JFrame f3;
		JButton delf;
		JTextField tdelf;
		JLabel Del = new JLabel("Please enter the number ID");
		JLabel tdel = new JLabel("");
		
		//frame unable
		JFrame funable;
		JButton bok;
		JTextArea ta;

		//constructors

		{
		f = new JFrame("");
		bhelp = new JButton("");
		blist = new JButton("List");
		badd = new JButton("Add");
		bdel = new JButton("Delete");
		bexit = new JButton("");
		bback = new JButton("");
		tArea = new JTextArea("");
		thelp = new JTextArea("");

		f2 = new JFrame("");
		addall = new JButton("Add");
		addDone = new JButton("Done");
		tid = new JTextField("");
		tname = new JTextField("");
		tage = new JTextField("");
		toccu = new JTextField("");
		thw = new JTextField("");
		
		
		f3 = new JFrame("");
		delf = new JButton ("Delete");
		tdelf = new JTextField("") ;
		
		
		funable = new JFrame("");
		bok = new JButton("OK");
		ta = new JTextArea("");
		
		
		
		
		//bounds frame1
		lwelcome.setBounds(100, 50, 450, 50);
		bhelp.setBounds(100, 125, 49, 49);
		blist.setBounds(100, 200, 100, 25);
		badd.setBounds(100, 250, 100, 25);
		bdel.setBounds(100, 300, 100, 25);
		bexit.setBounds(100, 450, 48, 48);
		bback.setBounds(100,550, 49,49);
		tArea.setBounds(255,125,700,400);
		thelp.setBounds(300,125,400,400);
		
		//bounds frame2
		lwe.setBounds(50, 25, 200, 50);
		
		lid.setBounds(50, 100, 100, 25);
		lname.setBounds(50, 150, 100, 25);
		lage.setBounds(50, 200, 100, 25);
		loccu.setBounds(50, 250, 100, 25);
		lhw.setBounds(50, 300, 125, 25);
		
		tid.setBounds(250, 100, 125, 25);
		tname.setBounds(250, 150, 125, 25);
		tage.setBounds(250, 200, 125, 25);
		toccu.setBounds(250, 250, 125, 25);
		thw.setBounds(250, 300, 125, 25);
		addall.setBounds(250, 350, 100, 25);
		addDone.setBounds(50, 350, 100, 25);
		tadded.setBounds(50, 425, 350, 25);
		
		//bounds f3 frame
		Del.setBounds(25,25,400,30);
		tdelf.setBounds(25, 75, 150, 25);
		delf.setBounds(200, 75, 150, 25);
		tdel.setBounds(50, 125, 350, 25);

		//bounds funable frame 
		
		bok.setBounds(100, 100, 100, 30);
		ta.setBounds(50, 40, 300,30);
		
		//==ICONS===
				 
		 Image img = new ImageIcon(this.getClass().getResource("/help.png")).getImage();
		 bhelp.setIcon(new ImageIcon(img));
		 bhelp.setBackground(Color.white);
		 
		 Image img1 = new ImageIcon(this.getClass().getResource("/arrow-back-icon.png")).getImage();
		 bback.setIcon(new ImageIcon(img1));
		 bback.setBackground(Color.white);
		
		 Image img2 = new ImageIcon(this.getClass().getResource("/Actions-application-exit-icon.png")).getImage();
		 bexit.setIcon(new ImageIcon(img2));
		 bexit.setBackground(Color.white);
		 		
		//Set TextAreas
		
		tArea.setVisible(false);
		tArea.setEditable(false);
		thelp.setVisible(false);
		thelp.setEditable(false);
		
		//add components to the frame

		f.add(lwelcome);
		f.add(bhelp);
		f.add(blist);
		f.add(badd);
		f.add(bdel);
		f.add(bexit);
		f.add(bback);
		f.add(tArea);
		f.add(thelp);
		
		//frame 2
		f2.add(lwe);
		f2.add(toccu);
		f2.add(tage);
		f2.add(tname);
		f2.add(toccu);
		f2.add(thw);
		f2.add(loccu);
		f2.add(lage);
		f2.add(lname);
		f2.add(loccu);
		f2.add(lhw);
		f2.add(lid);
		f2.add(tid);
		f2.add(addall);
		f2.add(addDone);
		f2.add(tadded);
		
		//frame 3
		f3.add(delf);
		f3.add(Del);
		f3.add(tdelf);
		f3.add(tdel);
		
		//frameunable
		funable.add(bok);
		funable.add(ta);
		
		
		delf.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		Del.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		tdelf.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		
		//FONT 
		
		lwelcome.setFont(new Font("Gill Sans MT", Font.BOLD , 27));
		badd.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		bdel.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		blist.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		tArea.setFont(new Font("Gill Sans MT",Font.BOLD, 20));
		thelp.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		
		lwe.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		
		lid.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		lname.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		lage.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		loccu.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		lhw.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		
		tid.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		tname.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		tage.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		toccu.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		thw.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		addall.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		addDone.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		
		ta.setFont(new Font("Gill Sans MT", Font.BOLD , 20));
		bok.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		
		ta.setText("Error: Unable to get product.");
		
		tdel.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		tadded.setFont(new Font("Gill Sans MT", Font.BOLD , 15));
		
		//setting frame

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1000,800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		//setting frame 2 
		
		f2.setLayout(null);
		f2.setVisible(false);
		f2.setSize(500,500);
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f2.setResizable(false);
		
		//setting frame 3
		
		f3.setLayout(null);
		f3.setVisible(false);
		f3.setSize(500,200);
		f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f3.setResizable(false);
		
		funable.setLayout(null);
		funable.setVisible(false);
		funable.setSize(400,200);
		funable.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		funable.setResizable(false);
		
		badd.addActionListener(this);
		bdel.addActionListener(this);
		blist.addActionListener(this);
		bhelp.addActionListener(this);
		bback.addActionListener(this);
		bexit.addActionListener(this);
		addall.addActionListener(this);
		addDone.addActionListener(this);
		delf.addActionListener(this);
		bok.addActionListener(this);
		
	
		}

		public void actionPerformed(ActionEvent e)
		{
			
			if(e.getSource()==bhelp)
			{
				tArea.setVisible(false);
				thelp.setVisible(true);
				thelp.setText("list   -List all Employees and updates and sort\n"+
								"add    -add an Employee\n"+
								"del    -delete an  Employee\n"+
								"help   -show this menu\n" +
								"backspace - go back to the main menu\n"+
								"exit   -Exit this application\n +"
								+ "Hint: sort will be applied after restart");
			}
			
			if(e.getSource()==blist)
			{	
				thelp.setVisible(false);
				tArea.setVisible(true);
				try {
					tArea.setText("ID # \n" + Main.displayAllIds());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(e.getSource()==bback)
			{	
				GUI frame = new GUI();
				frame.setVisible(true);
				f.dispose();
				
			}
			
			if(e.getSource()==bexit)
			{	
				f.dispose();
			}
			
			if(e.getSource()==badd)
			{
				f2.setVisible(true);
			}
			
			if(e.getSource()==bdel)
			{
				f3.setVisible(true);
			}
			//F2 Buttons
			
			if(e.getSource()==addall)
			{
				id = tid.getText();
				name = tname.getText();
				age = tage.getText();
				occupation = toccu.getText();
				hourlywage = Double.parseDouble(thw.getText());
				d.setId(id);
				d.setName(name);
				d.setAge(age);
				d.setOccupation(occupation);
				d.setHW(hourlywage);
				IDIO.add(d);
				tadded.setText(name + "has been added to the DB" );
				
			}
			
			if(e.getSource()==addDone)
			{		
				f2.setVisible(false);
				
			}
			
			//F3 Buttons
			if(e.getSource()==delf)
			{
				String id = tdelf.getText();
				
				IDs d = IDIO.get(id);
				if (d ==  null)
				{	funable.setVisible(true);
					System.out.println("\nError: Unable to get product.");
				}
				else
				{
					IDIO.delete(d);
					tdel.setText( id + " has been deleted from the DB" );
				
				}
				
			}
			if(e.getSource()==bok)
			{
				funable.dispose();
			}
			
			
			
		
		}
		
		
		public static void main(String[] args)
		{
			new MainGUI();
		}

		protected void setVisible(boolean b) {
			
			// TODO Auto-generated method stub
			
		}


	}


	



