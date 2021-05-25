import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class IndepClassListener extends JFrame{
	
	public IndepClassListener() {
		setTitle("독립클래스로 이벤트 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyListener());
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
	
}

class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
	
}
