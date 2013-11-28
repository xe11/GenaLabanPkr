import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
 
public class Main extends JFrame {
 
	Main(String s) {
		super(s);
		DrawPanel panel = new DrawPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		getContentPane().add(panel);
		pack();
		setVisible(true);
		this.setLocationRelativeTo(null);
		//this.add(new MyPanel());
	}
 
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {}
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new Main("Маятник");
				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		});
	}
 
	public class DrawPanel extends JComponent implements Runnable {
 
		private long t = System.nanoTime();
 
		public DrawPanel() {
			super();
			new Thread(this).start();
		}
 
		@Override
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(5);
				} catch (InterruptedException ex) {}
			}
		}
 
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
 
			long tm = System.nanoTime() - t;
			double angle = tm / 300000000.0;
 
			double sn = Math.sin(Math.sin(angle) * 0.5);
			double cs = Math.cos(Math.sin(angle) * 0.5);
			int x = (int) (250 * sn + 150);
			int y = (int) (250 * cs);
			g2d.drawLine(150, 0, x, y);
			g2d.drawOval(x - 20, y - 20, 40, 40);
		}
	}
}