package Version4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Object.TopLabel;
import Object.VersionLabel;

import Version1.GamingPanel;
import Version1.HelpPanel;
import Version1.SongPanel;
import Version1.StartPanel;

public class FormatPanel extends JPanel implements ActionListener{

	public static final int WIDTH=700;
    public static final int HEIGHT=650;
    
    public GridBagLayout layout;
    public GridBagConstraints gbc;
	
    public JPanel basePanel;
    public JPanel bgPanel;
    
    public JLayeredPane layeredPane;
    public StartPanel start;
    public SongPanel song;
    public GamingPanel game;
    public HelpPanel help;
    
	public JPanel topPanel;
	public JPanel buttonPanel;
	
	public JButton[] numButtons;
	
	public final int [][] buttonConstraints = new int[][]{
		{0,0,1,1},
    	{2,0,1,1},
    	{4,0,1,1},
    	{0,2,1,1},
    	{2,2,1,1},
    	{4,2,1,1},
    	{0,4,1,1},
    	{2,4,1,1},
    	{4,4,1,1}
    };
    
    public Border b = BorderFactory.createLineBorder(Color.WHITE, 10);
    
    public FormatPanel(String text){
    	layeredPane = new JLayeredPane();
		
		bgPanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				try
				{
					Image bg = ImageIO.read(getClass().getResource("bg.jpg"));
					// 繪製一張圖片作為背景
					g.drawImage(bg , 0 , 0 , getWidth() , getHeight() ,  null);
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		};
		
		
		basePanel = new JPanel();
		basePanel.setLayout(new BorderLayout());
		basePanel.setOpaque(false);
		
		gbc = new GridBagConstraints();
		
		topPanel = new JPanel();
		topPanel.setOpaque(false);
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {20,500,20};
	   	layout.rowHeights = new int[]{20,150,20};	
	   	topPanel.setLayout(layout);
		
		setGridBagConstraints(2,0,1,1);
		topPanel.add(new VersionLabel().build(),gbc);
		
		setGridBagConstraints(1,1,1,1);
		topPanel.add(new TopLabel().build(text),gbc);
		
		basePanel.add(topPanel,BorderLayout.NORTH);
		

		
		basePanel.setBounds(0, 0, WIDTH, HEIGHT);
		layeredPane.add(basePanel, new Integer(10));
		
		bgPanel.setBounds(0, 0, WIDTH, HEIGHT);
		layeredPane.add(bgPanel, JLayeredPane.DEFAULT_LAYER);
		
		layeredPane.setPreferredSize(new Dimension(WIDTH,HEIGHT));//需要在使用布局管理器的時候使用
		layeredPane.setVisible(true);
		add(layeredPane);
	}
	
	public FormatPanel(String text, boolean btn){
		layeredPane = new JLayeredPane();
		
		bgPanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				try
				{
					Image bg = ImageIO.read(getClass().getResource("bg.jpg"));
					// 繪製一張圖片作為背景
					g.drawImage(bg , 0 , 0 , getWidth() , getHeight() ,  null);
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		};
		
		
		basePanel = new JPanel();
		basePanel.setLayout(new BorderLayout());
		basePanel.setOpaque(false);
		
		gbc = new GridBagConstraints();
		
		topPanel = new JPanel();
		topPanel.setOpaque(false);
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {20,500,20};
	   	layout.rowHeights = new int[]{20,150,20};	
	   	topPanel.setLayout(layout);
		
		setGridBagConstraints(2,0,1,1);
		topPanel.add(new VersionLabel().build(),gbc);
		
		setGridBagConstraints(1,1,1,1);
		topPanel.add(new TopLabel().build(text),gbc);
		
		basePanel.add(topPanel,BorderLayout.NORTH);
		
		if(btn==true){
		   	buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			layout = new GridBagLayout();
			layout.columnWidths = new int[] {120,60,120,60,120};
		   	layout.rowHeights = new int[]{120,20,120,20,120};	
		   	buttonPanel.setLayout(layout);
		   	
			numButtons = new JButton[9];
			
			
			basePanel.add(buttonPanel, BorderLayout.CENTER);
		}
		basePanel.setBorder(b);
		basePanel.setBounds(0, 0, WIDTH, HEIGHT);
		layeredPane.add(basePanel, new Integer(10));
		
		bgPanel.setBounds(0, 0, WIDTH, HEIGHT);
		layeredPane.add(bgPanel,JLayeredPane.DEFAULT_LAYER);
		
		layeredPane.setPreferredSize(new Dimension(WIDTH,HEIGHT));//需要在使用布局管理器的時候使用
		layeredPane.setVisible(true);
		add(layeredPane);
	}
	
	public void setGridBagConstraints(int gridx, int gridy, int gridheight, int gridwidth){
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridheight = gridheight;
        gbc.gridwidth = gridwidth;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		JFrame app = new JFrame("Start");  
		app.add(new FormatPanel("",true));
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setResizable(true);
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible( true ); // display frame
	       
	}

}
