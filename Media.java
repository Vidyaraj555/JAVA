import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import javax.swing.*;
import javax.media.*;
public class Media extends JFrame implements ActionListener        
{
	JButton P,S;
	MediaLocator ml;
	Player pl;
	public Media()
	{
		setLayout(null);
		P = new JButton("Play");
		S = new JButton("Stop");
		P.setBounds(250,250,70,50);
		add(P);
		P.addActionListener(this);
		S.setBounds(250,350,70,50);
		add(S);
		S.addActionListener(this);
		setSize(500,700);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==P)
			{
				ml = new MediaLocator("file:/E:\\Vidya J\\jungkook - 10000 hours (cover).wav"); 
				pl=Manager.createPlayer(ml);
				pl.start(); 
			}
			else
        		if(ae.getSource()==S)
			{
				pl.stop();
			}
		}
		catch(Exception e)
		{
		}
		
	}
	public static void main(String s[])
	{
		Media ob1 = new Media();
	}
}
