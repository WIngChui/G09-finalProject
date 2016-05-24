package Version4;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Object.TopLabel;
import Object.VersionLabel;

public class GamingPanel extends FormatPanel implements ActionListener{
    
	public GamingPanel(){
		super("Gaming",true);
		
		for(int i=0;i<numButtons.length;i++){
			numButtons[i] = new JButton(""); 
			numButtons[i].setBorderPainted(false);
	   		numButtons[i].addActionListener(this);
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
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		JFrame app = new JFrame("Start");  
		app.add(new GamingPanel());
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setResizable(true);
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible( true ); // display frame
	       
	}

}
