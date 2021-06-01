import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimeRunable implements Runnable{
	JLabel timerLabel;
	
	public TimeRunable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);
			} 
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class RunableTimerEx extends JFrame {

	public RunableTimerEx() {
		setTitle("½º·¹µå 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timeLabel);
		
		TimeRunable runable = new TimeRunable(timeLabel);
		Thread th = new Thread(runable);
		
		setSize(250, 150);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunableTimerEx();
	}

}
