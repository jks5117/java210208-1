package UI.hanbit;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//public class MovieWest extends JPanel {
public class MovieCenter extends JPanel {
	JButton content = new JButton("내용");
	public MovieCenter() {
		initDisplay();
	}
	public void initDisplay() {
		this.setLayout(new GridLayout(12,1,3,3));
		this.add(content);
		this.setSize(750, 700);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MovieCenter mm = new MovieCenter();
		mm.initDisplay();
	}	
}
