/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * @author Gavin Montes
 *
 */
public class BarelyAdequateFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4191682030032203464L;
	/** About button which creates a popup with relevant info */
	JMenuItem myAboutButton;
	/** The menu bar that the about button is contained in. */
	JMenuBar myMenuBar;
	/** The About box itself that pops up when the about button is clicked. */
	
	public BarelyAdequateFrame() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(new BorderLayout());
		
		myMenuBar = new JMenuBar();
		myAboutButton = new JMenuItem("ABOUT");
		myMenuBar.add(myAboutButton);
		myAboutButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent theEvent) {
				about aboutBox = new about();
			}
			
		});
		this.add(myMenuBar, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
}
