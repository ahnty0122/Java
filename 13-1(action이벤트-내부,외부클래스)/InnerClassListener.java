import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{

	public InnerClassListener() {
		setTitle("내부클래스를 쓰는 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		
		c.add(btn);
		
		setSize(200, 120);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// 액션 글씨바꿀 때 위에 제목도 바꿔라!
			InnerClassListener.this.setTitle(b.getText());
		}
	}
	
	public static void main(String[] args) {
		new InnerClassListener();
	}

}
