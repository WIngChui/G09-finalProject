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
		
		instruction.setText("�粒�q���i�J�C����A�H3x3�覡�ƦC���E�c��"
				+ "\n" + "(�Ʀr��L1~9)�A"
				+ "\n" + "�ھڹC�����ܩM���ֱ۫߫��U���w���䪺���k �C"
				+ "\n" + "���a�ݭn�q�L�ù��W���G���A"
				+ "\n" + "�b�A��ɾ����U���w������o���A"
				+ "\n" + "�ھڷǽT�פ���miss�Bgood�Bperfect�A"
				+ "\n" + "�C��������A�ھڹC�����Ƥ�Combo�ƨӵ���"
				+ "\n" + "�]S�BA�BB�BC�BD�^�C"
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
