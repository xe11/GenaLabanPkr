package ui;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel {
	private Image image = null;
	private PokerFrame pokerFrame = null;
	
	/**
	 * Create the panel.
	 */
	public MainMenu(PokerFrame frame) {
		pokerFrame = frame;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("pokerShark.jpg");
		
		setSize(949, 582);
		
		JLabel lblProfileName = new JLabel("\u0413\u0435\u043D\u0430 \u041B\u0430\u0431\u0430\u043D");
		lblProfileName.setForeground(Color.RED);
		lblProfileName.setBackground(Color.LIGHT_GRAY);
		lblProfileName.setFont(new Font("Sylfaen", Font.PLAIN, 49));
		lblProfileName.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblMoney = new JLabel("Money:");
		lblMoney.setForeground(Color.BLUE);
		lblMoney.setName("lableManey");
		lblMoney.setHorizontalAlignment(SwingConstants.LEFT);
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 38));
		
		JLabel lblCountMoney = new JLabel("55555");
		lblCountMoney.setForeground(Color.BLUE);
		lblCountMoney.setHorizontalAlignment(SwingConstants.LEFT);
		lblCountMoney.setName("count money");
		lblCountMoney.setFont(new Font("Tahoma", Font.PLAIN, 38));
		
		JLabel lblNewLabel = new JLabel("Nicname:");
		lblNewLabel.setName("lbNic");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 49));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_1 = new JLabel("Fenix");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 49));
		lblNewLabel_1.setName("nicName");
		
		JButton btnNewButton = new JButton("Sit on table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pokerFrame.secondFrame();
			}
		});
		btnNewButton.setFont(new Font("Poor Richard", Font.BOLD | Font.ITALIC, 49));
		btnNewButton.setName("bInGame");
		
		JButton btnNewButton_1 = new JButton("Friends");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 39));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProfileName, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblMoney)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCountMoney, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblProfileName, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblCountMoney, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblMoney))
					.addGap(386)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
						.addComponent(btnNewButton))
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
