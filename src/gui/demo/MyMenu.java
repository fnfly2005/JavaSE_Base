package gui.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MyMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menu;
	private JTextArea textArea_1;
	private JMenuItem menuItem;
	private JFileChooser chooser;
	protected static final String LINE_SEPARATOR = System.getProperty("line.separator");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("java-GUI-菜单");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMenu frame = new MyMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu("文件");
		menuBar.add(menu);
		textArea_1 = new JTextArea();
		contentPane.add(textArea_1, BorderLayout.CENTER);
	
		menuItem = new JMenuItem("打开");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						chooser = new JFileChooser();

					    int returnVal = chooser.showOpenDialog(contentPane);
					    if(returnVal == JFileChooser.CANCEL_OPTION) {
					       System.out.println("已取消选择");
					       return;
					    }
					    
					    File file = chooser.getSelectedFile();
					    BufferedReader bufr = new BufferedReader(new FileReader(file));
					    
					    String line = null;
					    
					    while ((line=bufr.readLine())!=null) {
					    	textArea_1.append(line+LINE_SEPARATOR);
					    }
					    
					    bufr.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		

		menu.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		

	}

}
