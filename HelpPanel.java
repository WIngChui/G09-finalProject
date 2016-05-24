package Version4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HelpPanel extends FormatPanel{

	private JPanel bottomPanel;
	public JButton back;
	private JTextArea instruction;
	
	public HelpPanel(){
		super("Help");

		bottomPanel = new JPanel();
		bottomPanel.setOpaque(false);
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {20,500,20};
	   	layout.rowHeights = new int[]{20,150,20};	
	   	bottomPanel.setLayout(layout);
		
		instruction = new JTextArea("");
		instruction.setOpaque(false);
		instruction.setEditable(false);
		instruction.setPreferredSize(new Dimension(500,300));
		instruction.setFont(new Font(null,Font.BOLD,20));
		instruction.setForeground(Color.WHITE);
		
		instruction.setText("選完歌曲進入遊戲後，以3x3方式排列的九宮格"
				+ "\n" + "(數字鍵盤1~9)，"
				+ "\n" + "根據遊戲提示和音樂旋律按下指定按鍵的玩法 。"
				+ "\n" + "玩家需要通過螢幕上的亮光，"
				+ "\n" + "在適當時機按下指定按鍵方能得分，"
				+ "\n" + "根據準確度分為miss、good、perfect，"
				+ "\n" + "遊戲完結後，根據遊戲分數及Combo數來評分"
				+ "\n" + "（S、A、B、C、D）。"
			);
		
		setGridBagConstraints(1,0,1,1);
		bottomPanel.add(instruction, gbc);
		
		back = new JButton("back");
		setGridBagConstraints(0,1,1,1);
		bottomPanel.add(back, gbc);
		
		bottomPanel.setBounds(0, 150, WIDTH, HEIGHT);
		layeredPane.add(bottomPanel,new Integer(11));
	}
	
	public static void main(String[] args) {
		JFrame app = new JFrame();  
		app.add(new HelpPanel());
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setResizable(true);
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible( true ); // display frame

	}

}
