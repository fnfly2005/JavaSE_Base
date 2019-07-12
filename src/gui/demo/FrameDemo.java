package gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	public static void main(String[] args) {
		System.out.println("java-GUI-Frame演示");
		Frame f = new Frame("我的窗口");
		f.setVisible(true);
		f.setBounds(500, 150, 500, 400);
		f.setLayout(new FlowLayout());
		
		Button b = new Button("退出程序");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("java-GUI-ActionListener演示");
				System.exit(0);
			}
		});
		f.add(b);
		
		
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("java-GUI-事件监听机制");
				System.exit(0);
			}		
		});
		
		

	}

}
