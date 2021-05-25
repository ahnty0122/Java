import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame{

	public AnonymousClassListener() {
		setTitle("����Ŭ������ ���� �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
//		btn.addActionListener(new MyActionListener());
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
				// �׼� �۾��ٲ� �� ���� ���� �ٲ��!
				setTitle(b.getText());
			}
		});
		
		c.add(btn);
		
		setSize(200, 120);
		setVisible(true);
	}
	
//	class MyActionListener implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton)e.getSource();
//			if(b.getText().equals("Action"))
//				b.setText("�׼�");
//			else
//				b.setText("Action");
//			// �׼� �۾��ٲ� �� ���� ���� �ٲ��!
//			InnerClassListener.this.setTitle(b.getText());
//		}
//	}
	
	public static void main(String[] args) {
		new InnerClassListener();
	}

}
