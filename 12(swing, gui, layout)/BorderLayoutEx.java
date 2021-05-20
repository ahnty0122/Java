import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;


public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {
		setTitle("처음 만드는 보더레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(30, 20));
		
		contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
		contentPane.add(new JButton("add"), BorderLayout.NORTH);
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"), BorderLayout.EAST);
		contentPane.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();		
	}

}
