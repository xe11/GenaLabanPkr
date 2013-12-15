package ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ContentPanel extends JPanel {
	private Image image1 = null;
	private Image image2 = null;
	
	private Image image = null;
	
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public ContentPanel() throws IOException {
		Toolkit tk = Toolkit.getDefaultToolkit();
		image1 = ImageIO.read( new File("pokerShark.jpg"));
		
		image2 = ImageIO.read( new File("Table.png"));
		
		firstFrame();
		
	}
	
	public void firstFrame() {
		image = image1;
	}
	
	public void secondFrame() {
		image = image2;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub		
		super.paint(g);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(image, 5, 5, null);
	}

}
