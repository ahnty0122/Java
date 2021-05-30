import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class quiz1_2 extends JFrame {
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	Container c = getContentPane();
	
	public quiz1_2() {
		super("키보드 이벤트 예제 - 독립 클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(250, 150);
		setVisible(true);			
	}
		
	public static void main(String[] args) {
		new quiz1_2();
	}
}

class MyKeyListener extends KeyAdapter {
	@Override
	public void keyPressed(KeyEvent e) {
		
		Component c = (Component)e.getSource();
		
		JLabel la = (JLabel)e.getComponent();
		
		switch (e.getKeyChar()) {
		case 'r':
			la.setText("붉은색입니다");			
			c.setBackground(Color.RED);
			break;
		case 'b':
			la.setText("파란색입니다");				
			c.setBackground(Color.BLUE);
			break;
		case 'y':
			la.setText("노란색입니다");		
			c.setBackground(Color.YELLOW);
			break;
		case 'q':
			System.exit(0); 
		default:
			break;
		}
		
		super.keyPressed(e);
	}
}
