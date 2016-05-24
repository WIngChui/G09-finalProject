package Version4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartPanel extends FormatPanel implements ActionListener{
	
	public StartPanel(){
		super("Jubeat",true);
		
		
		for(int i=0;i<numButtons.length;i++){
			if(i == 0){
				numButtons[i] = new JButton("Start");
			}
			else if(i == 4)
				numButtons[i] = new JButton("Record");
			else if(i == 8)
				numButtons[i] = new JButton("Help");
			else
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
			//this.setVisible(false);
			//song.setVisible(true);
			System.out.println("Yes4");
		}
		
	}

	public static void main(String[] args) {
		JFrame Starting = new JFrame("Start");  
		Starting.add(new StartPanel());
		Starting.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		Starting.setResizable(true);
		Starting.pack();
		Starting.setLocationRelativeTo(null);
		Starting.setVisible( true ); // display frame
	 
	}
	
}
