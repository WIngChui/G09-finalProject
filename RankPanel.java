package Version4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RankPanel extends FormatPanel{

	private JPanel bottomPanel;
	public JButton back;
	private JTextArea ranking;
	
	public RankPanel(){
		super("Rank");

		bottomPanel = new JPanel();
		bottomPanel.setOpaque(false);
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {20,500,20};
	   	layout.rowHeights = new int[]{20,150,20};	
	   	bottomPanel.setLayout(layout);
		
		ranking = new JTextArea("");
		ranking.setOpaque(false);
		ranking.setEditable(false);
		ranking.setPreferredSize(new Dimension(500,300));
		ranking.setFont(new Font(null,Font.BOLD,20));
		ranking.setForeground(Color.WHITE);
		
		ranking.setText("1. "
				+ "\n" + "2. "
				+ "\n" + "3. "
				+ "\n" + "4. "
				+ "\n" + "5. "
			);
		
		setGridBagConstraints(1,0,1,1);
		bottomPanel.add(ranking, gbc);
		
		back = new JButton("back");
		setGridBagConstraints(0,1,1,1);
		bottomPanel.add(back, gbc);
		
		bottomPanel.setBounds(0, 150, WIDTH, HEIGHT);
		layeredPane.add(bottomPanel,new Integer(11));
	}
	
	public static void main(String[] args) {
		JFrame app = new JFrame();  
		app.add(new RankPanel());
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setResizable(true);
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible( true ); // display frame

	}

}
