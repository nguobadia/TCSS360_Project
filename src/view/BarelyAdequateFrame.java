/**
 * 
 */
package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Gavin Montes
 *
 */
public class BarelyAdequateFrame extends JFrame {
	/** About button which creates a popup with relevant info */
	JMenuItem myAbout;
	/** The */
	JMenuBar myMenuBar;
	
	public BarelyAdequateFrame() {
		super();
		this.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(new BorderLayout());
		
		myMenuBar = new JMenuBar();
		myAbout = new JMenuItem("ABOUT");
		myMenuBar.add(myAbout);
		
		this.add(myMenuBar, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
}
