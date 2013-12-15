package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PokerFrame extends JFrame {

	private ContentPanel contentPane;
	
	private MainMenu mainMenu = null;
	private TablePanel tablePanel = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokerFrame frame = new PokerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public PokerFrame() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 633);
		//setResizable(false);
		contentPane = new ContentPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		mainMenu = new MainMenu(this);
		mainMenu.setBounds(5, 5, 969, 595);
		mainMenu.setOpaque(false);
		tablePanel = new TablePanel(this);
		tablePanel.setBounds(5, 5, 969, 595);
		tablePanel.setOpaque(false);
		contentPane.setLayout(null);
		
		getContentPane().add(mainMenu, 0);
		contentPane.firstFrame();
		repaint();
	}
	
	public void firstFrame() {
		getContentPane().remove(0);
		getContentPane().add(mainMenu, 0);
		
		contentPane.firstFrame();
		
		revalidate();
		repaint();
	}
	
	public void secondFrame() {
		getContentPane().remove(0);
		getContentPane().add(tablePanel, 0);
		
		contentPane.secondFrame();

		revalidate();
		repaint();
	}
	
	
	
	
	
}
