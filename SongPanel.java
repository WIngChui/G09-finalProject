package Version4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


import Object.TopLabel;
import Object.VersionLabel;;

public class SongPanel extends FormatPanel implements ActionListener{

	public SongPanel(){
		super("Song Selection",true);
		
		for(int i=0;i<numButtons.length;i++){
			numButtons[i] = new JButton(""); 
			numButtons[i].setBorderPainted(false);
	   		numButtons[i].addActionListener(this);
	   		//numButtons[i].setContentAreaFilled(false);
	   		//numButtons[i].setIcon( new ImageIcon(getClass().getResource( "9.jpg" ) ));
	   		numButtons[i].setBorder(b);
	   		numButtons[i].setSize(new Dimension(120,120));	
	   		setGridBagConstraints(buttonConstraints[i][0],buttonConstraints[i][1],
	   								buttonConstraints[i][2],buttonConstraints[i][3]);
	   		gbc.fill = GridBagConstraints.BOTH;
	   		buttonPanel.add(numButtons[i],gbc);	
	   	}
		buttonPanel.setBounds(0, 100, WIDTH, HEIGHT);
		layeredPane.add(buttonPanel,new Integer(11));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="toSong"){
			//this.setVisible(true);
			System.out.println("Yes5");
		}
			
	}
	
	public static void main(String[] args) {
		JFrame Song = new JFrame("Song");  
		Song.add(new SongPanel());
		Song.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		Song.setResizable(true);
		Song.pack();
		Song.setLocationRelativeTo(null);
		Song.setVisible( true ); // display frame

	}

}
