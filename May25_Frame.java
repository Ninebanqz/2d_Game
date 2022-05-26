import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame extends JFrame{	
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//makes the x work
		setTitle("Player move");
		setSize(800, 800);//sets dimension of frame
		setResizable(false);
		setVisible(true);//sets the frame so you can see it
		
		init();
	}
	public void init() {
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(1,1,0,0));
		
		Screen s = new Screen();
		
		add(s);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Frame f = new Frame();
		
	}
}
