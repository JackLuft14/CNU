package src;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class SI extends JFrame {

	// creates a new panel in which the game is played
	private SIPanel p = new SIPanel();
	public SI() {

		super("Space Invaders");

		JMenuBar menubar = new JMenuBar();
		JMenu Game = new JMenu("Game");
		menubar.add(Game);
		JMenuItem newgame = Game.add("New Game");
		// CRTL+N
		Game.addSeparator();
		final JMenuItem pause = Game.add("Pause");
		// CTRL+P
		pause.setEnabled(true);
		final JMenuItem resume = Game.add("Resume");
		// CTRL+R
		Game.addSeparator();
		resume.setEnabled(false);
		JMenuItem quit = Game.add("Quit");
		// CTRL+Q

		JMenu Help = new JMenu("Help");
		JMenuItem about = Help.add("About...");
		menubar.add(Box.createHorizontalGlue());
		menubar.add(Help);
		Help.add(about);
		Help.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		setJMenuBar(menubar);

		quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK ));
		newgame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		resume.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		pause.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		
		// Exit From Icon
		/**
		 * Displays a panel asking if the user wants to close the window
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForQuit();
			}
		});

		// Quit
		/**
		 * Displays a panel asking if the user wants to quit the game
		 */
		quit.addActionListener(new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				askForQuit();

			}
		});

		// About
		/**
		 * Displays a panel with the name of the application and its authors
		 */
		about.addActionListener(new ActionListener() {
		    //@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(SI.this,
						new JLabel("<html><b> SpaceInvaders </b> <br> by Noelle and Jack</html>"), "About",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// New Game
		newgame.addActionListener(new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				pause();
				newGame();				
				pause.setEnabled(true);
			}
		});

		//Pause
		pause.addActionListener(new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				pause();
				resume.setEnabled(true);
				pause.setEnabled(false);
				
			}
		});
		
		//Resume
		resume.addActionListener(new ActionListener(){
			//@Override
			public void actionPerformed(ActionEvent e){
				resume();			
				resume.setEnabled(false);
				pause.setEnabled(true);
			}
		});
		
	
		
		add(p);
		

		setSize(500, 450);
		setResizable(false);        
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
	}

	
	//Method to quit the game
	protected void askForQuit() {
		pause();
		int result = JOptionPane.showConfirmDialog(this, "Dare to Quit?");
		if (result == JOptionPane.YES_OPTION) {
			dispose();
			}
		if(result==JOptionPane.NO_OPTION || result==JOptionPane.CANCEL_OPTION){
			resume();
			
		}
	}
	
	protected void pause(){
		p.pauseTimer();
		
	}
	
	protected void resume(){
		p.resumeTimer();
		
	}
	
	protected void newGame(){
		p.newTimer();
		
	}


	public static void main(String[] args) {
		JFrame f = new SI();
		f.setVisible(true);

	}
}
