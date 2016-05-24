package Version4;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	
	public static final int WIDTH=700;
    public static final int HEIGHT=650;
	
    public StartPanel start = new StartPanel();
    public SongPanel song = new SongPanel();
    public GamingPanel game = new GamingPanel();
    public HelpPanel help = new HelpPanel();
    public RankPanel rank = new RankPanel();
    
    JFrame f= new JFrame();
    
    CardLayout cardLayout;
    
    public MainFrame(){
    	Container c = f.getContentPane();
		c.setLayout(new CardLayout());
		c.add(start, "start");
		c.add(song, "song");
		c.add(game, "game");
		c.add(help, "help");
		c.add(rank, "rank");
		
		changeScreen();
		
		cardLayout = (CardLayout) f.getContentPane().getLayout();
		
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setBounds(0, 0, WIDTH, HEIGHT);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.pack();
		f.show();
    }
    
    private void changeScreen() {
		((StartPanel) start).numButtons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "song");
			}
		});
		
		((StartPanel) start).numButtons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "rank");
			}
		});
		
		((StartPanel) start).numButtons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "help");
			}
		});
		
		((SongPanel) song).numButtons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "start");
			}
		}
		);
		
		((SongPanel) song).numButtons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "game");
			}
		}
		);
		
		/*
		((GamingPanel) game).stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "end");
			}
		});
		*/
		
		((HelpPanel) help).back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "start");
			}
		}
		);
	
		
		((RankPanel) rank).back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(f.getContentPane(), "start");
			}
		});
		
	
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}