package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TablePanel extends JPanel {
	private Image image = null;
	private PokerFrame pokerFrame = null;
	private JTextField textField;
	
	/**
	 * Create the panel.
	 */
	public TablePanel(PokerFrame frame) {
		this.pokerFrame = frame;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("Table.png");
		
		setSize(949, 582);
		
		//BorderFactory borderFactory = new bor
		
		JLabel lblSit = new JLabel("");
		lblSit.setIcon(new ImageIcon("E:\\!!\u041C\u043E\u0451\\Proga\\Project_java\\Poker\\gif2.gif"));
		lblSit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSit.setBorder(new LineBorder(Color.GREEN, 2));
		
		JLabel lblSit_1 = new JLabel("Sit2");
		lblSit_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSit_1.setBorder(new LineBorder(Color.GREEN, 2));
		
		JLabel label = new JLabel("Sit1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(new LineBorder(Color.GREEN, 2));
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				StringBuffer value = new StringBuffer(textField.getText());
				if(value.length() > 0 && value.charAt(0) == '0'){
					value.deleteCharAt(0);
					textField.setText(value.toString());
				}
				
				if((e.getKeyChar() == ' ' || Character.isLetter(e.getKeyChar()))
						&& !Character.isDigit(e.getKeyChar())) {
					int n = value.indexOf(e.getKeyChar() + "");
					
					value.deleteCharAt(n);
					textField.setText(value.toString());
				}
				
			}
		});
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JCheckBox checkBox = new JCheckBox("");
		
		JCheckBox checkBox_1 = new JCheckBox("");
		
		JButton button = new JButton("\u0412\u0441\u0442\u0430\u0442\u044C \u0438\u0437-\u0437\u0430 \u0441\u0442\u043E\u043B\u0430");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pokerFrame.firstFrame();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(453, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(436))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(163)
							.addComponent(lblSit, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button)))
					.addPreferredGap(ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblSit_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(133))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBox)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(2)
							.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton_2))
							.addGap(17))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(250)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSit, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(79)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSit_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton)
								.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(checkBox)))
					.addGap(21))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(548, Short.MAX_VALUE)
					.addComponent(button)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		//Graphics2D g2d = (Graphics2D)g;
		//g2d.drawImage(image, 0, 0, null);
	}
}
