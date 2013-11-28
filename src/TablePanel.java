import javax.imageio.ImageIO;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;

import java.awt.CardLayout;
import javax.swing.JButton;


public class TablePanel extends JPanel {
	private Image image = null;
	
	/**
	 * Create the panel.
	 */
	public TablePanel() {
	//	setLayout(new CardLayout(0, 0));
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("image.png");
		
		setSize(image.getWidth(null), image.getHeight(null));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(image, 0, 0, null);
		
	}
	
	public Image getImage(){
		return image;
	}
}




