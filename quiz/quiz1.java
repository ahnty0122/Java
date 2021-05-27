import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class quiz1 extends JFrame {

	JLabel la = new JLabel("r = red y = yellow b = blue");
	
	public quiz1() {
		super("Ű���� �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(250, 150);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			
			switch(e.getKeyChar()) {
			case 'r':
				la.setText("�������Դϴ�.");
				getContentPane().setBackground(Color.RED); 
				break;
			case 'y':
				la.setText("������Դϴ�.");
				getContentPane().setBackground(Color.YELLOW); 
				break;
			case 'b':
				la.setText("�Ķ����Դϴ�.");
				getContentPane().setBackground(Color.BLUE); 
				break;
			case 'q':
				System.exit(0);
			}
			
			super.keyPressed(e);
		}
	}
	
	public static void main(String[] args) {
		new quiz1();
	}

}
