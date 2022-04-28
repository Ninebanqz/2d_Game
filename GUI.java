import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class GUI {

	public GUI() {
		
		//Created a frame, panel, button and label
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JLabel label = new JLabel("# of clickes : 0");
		
		//The Panel of the GUI
		panel.setBorder(BorderFactory.createEmptyBorder(500, 300, 20, 500));
		panel.setLayout(new GridLayout(0, 1));
		
		// Button and Label
		panel.add(button);
		panel.add(label);
		
		
		//The Frame of the GUI
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("learning GUI");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();

	}

}
