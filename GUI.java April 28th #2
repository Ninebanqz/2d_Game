//# Alexandru Lungu
//# 2D_Game_for_ISP
//# ICS-3U1
//# This is a 2d game where you travel around a small world and you can encounter random enemies
//# You will move the in game character with WASD keys, and you will have three moves to choose from, you
//# get to chose between blocking, striking and dodging.


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class GUI implements ActionListener{

	private JFrame frame;
	private JPanel panel;
	
	private JButton button = new JButton();
	
	private ImageIcon easyIcon;
	private JLabel easyLabel;
	
	public GUI() {
		
		//Created a frame, panel, button and label
		JButton button = new JButton();
		frame = new JFrame();
		panel = new JPanel();
		
		//The Panel of the GUI
		panel.setBorder(BorderFactory.createEmptyBorder(400, 400, 100, 300));
		panel.setLayout(new GridLayout(1, 0));
		
		//The Frame of the GUI
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("learning GUI");
		frame.pack();
		frame.setVisible(true);
		frame.add(button);
	
		//Button
		button.addActionListener(this);
		button.setText("Easy button");
		button.setFocusable(false);
		button.setBounds(0, 0, 0, 0);
	
		//The easy button Image
		easyIcon = new ImageIcon("C:\\Users\\alext\\eclipse-workspace\\GUI of game\\imported_Pictures");
		easyLabel = new JLabel(easyIcon);
		add(easyLabel);
		button.setIcon(easyLabel);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
		}
	}

}
