package Version4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EndPanel extends FormatPanel{

	private JPanel bottomPanel;
	public JButton end;
	private JTextArea data;
	
	public EndPanel(){
		super("Complete !");

		bottomPanel = new JPanel();
		bottomPanel.setOpaque(false);
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {20,500,20};
	   	layout.rowHeights = new int[]{20,150,20};	
	   	bottomPanel.setLayout(layout);
		
		data = new JTextArea("");
		data.setOpaque(false);
		data.setEditable(false);
		data.setPreferredSize(new Dimension(500,300));
		data.setFont(new Font(null,Font.BOLD,20));
		data.setForeground(Color.WHITE);
		
		data.setText( "Grade: "
				+ "\n" + "Scores : "
				+ "\n" + "Combo :  "
			);
		
		setGridBagConstraints(1,1,1,1);
		bottomPanel.add(data, gbc);
		
		end = new JButton("end");
		setGridBagConstraints(2,2,1,1);
		bottomPanel.add(end, gbc);
		
		bottomPanel.setBounds(0, 150, WIDTH, HEIGHT);
		layeredPane.add(bottomPanel,new Integer(11));
	}
	
	public static void main(String[] args) {
		JFrame app = new JFrame();  
		app.add(new EndPanel());
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setResizable(true);
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible( true ); // display frame

	}

}
