package gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo {
	
	private Frame f;
	private TextField tf;
	private Button bu;
	
	MouseAndKeyDemo() {
		// TODO Auto-generated constructor stub
		Init();
	}

	private void Init() {
		f= new Frame("���ͼ����¼�����");
		f.setBounds(500, 150, 500, 400);
		
		f.setLayout(new FlowLayout());
		
		tf = new TextField(35);
		bu = new Button("һ����ť");
		
		f.add(tf);
		f.add(bu);
		
		myEvent();
		
		f.setVisible(true);
		
	}

	private void myEvent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
		
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if(e.isControlDown() && code==KeyEvent.VK_ENTER) {
					System.out.println("��ʼ��½");
				}
				else if (!(code >=KeyEvent.VK_0  && code <= KeyEvent.VK_9)) {				
					System.out.println("������������");
					e.consume();
				}
				
			}
			
		});
		
		bu.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2)
				tf.setText("mouse double click "+count++);
				
			}

			
		});
	}

	public static void main(String[] args) {
		System.out.println("java-GUI-����¼�");
		System.out.println("java-GUI-�����¼�");
		new MouseAndKeyDemo();

	}

}
