import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class quiz1_3 extends JFrame {
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	
	public quiz1_3() {
		super("키보드 이벤트 예제 - 익명클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyChar()) {
				case 'r':
					la.setText("붉은색입니다");				
					getContentPane().setBackground(Color.RED);
					break;
				case 'b':
					la.setText("파란색입니다");				
					getContentPane().setBackground(Color.BLUE);
					break;
				case 'y':
					la.setText("노란색입니다");				
					getContentPane().setBackground(Color.YELLOW);
					break;
				case 'q':
					System.exit(0); 
				default:
					break;
				}
				
				super.keyPressed(e);
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(250, 150);
		setVisible(true);			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new quiz1_3();
	}
}
