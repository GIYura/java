package tetris;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window {
	private JFrame window;
	private static final int WIDTH = 300, HEIGHT = 630;
	private Board board;
	private JTextField scoreField;
	
	public Window() {
		window = new JFrame("TETRIS");
		
		scoreField = new JTextField(10);
		scoreField.setBounds(10, 10, 10, 10);
		scoreField.setText("0");
		scoreField.setFont(new Font("Arial", Font.BOLD, 16));
		scoreField.setHorizontalAlignment(JTextField.HORIZONTAL);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setSize(WIDTH, HEIGHT);
		
		board = new Board();
		
		
		window.add(board);
		window.add(scoreField);
		
		window.addKeyListener(board);
		
		window.setVisible(true);	
	}
}
