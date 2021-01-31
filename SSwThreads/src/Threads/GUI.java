package Threads;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 11, 448, 28);
		frame.getContentPane().add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(10, 50, 448, 28);
		frame.getContentPane().add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(10, 87, 448, 28);
		frame.getContentPane().add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setBounds(10, 126, 448, 28);
		frame.getContentPane().add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setBounds(10, 165, 448, 28);
		frame.getContentPane().add(progressBar_4);
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setBounds(10, 204, 448, 28);
		frame.getContentPane().add(progressBar_5);
		
		JProgressBar progressBar_6 = new JProgressBar();
		progressBar_6.setBounds(10, 243, 448, 28);
		frame.getContentPane().add(progressBar_6);
		
		JProgressBar progressBar_7 = new JProgressBar();
		progressBar_7.setBounds(10, 282, 448, 28);
		frame.getContentPane().add(progressBar_7);
		
		JProgressBar progressBar_8 = new JProgressBar();
		progressBar_8.setBounds(10, 321, 448, 28);
		frame.getContentPane().add(progressBar_8);
		
		JProgressBar progressBar_9 = new JProgressBar();
		progressBar_9.setBounds(10, 360, 448, 28);
		frame.getContentPane().add(progressBar_9);
		
		JProgressBar progressBar_10 = new JProgressBar();
		progressBar_10.setBounds(10, 399, 448, 28);
		frame.getContentPane().add(progressBar_10);
		
		JProgressBar progressBar_11 = new JProgressBar();
		progressBar_11.setBounds(10, 438, 448, 28);
		frame.getContentPane().add(progressBar_11);
		
		JProgressBar progressBar_12 = new JProgressBar();
		progressBar_12.setBounds(10, 477, 448, 28);
		frame.getContentPane().add(progressBar_12);
		
		JProgressBar progressBar_13 = new JProgressBar();
		progressBar_13.setBounds(10, 516, 448, 28);
		frame.getContentPane().add(progressBar_13);
		
		JLabel lblMainThread = new JLabel("Main Thread");
		lblMainThread.setBounds(468, 11, 77, 14);
		frame.getContentPane().add(lblMainThread);
		
		JLabel lblSubThread = new JLabel("Sub Thread 1");
		lblSubThread.setBounds(468, 50, 77, 14);
		frame.getContentPane().add(lblSubThread);
		
		JLabel lblSubThread_1 = new JLabel("Sub Thread 2");
		lblSubThread_1.setBounds(468, 87, 77, 14);
		frame.getContentPane().add(lblSubThread_1);
		
		JLabel lblSubThread_2 = new JLabel("Sub Thread 3");
		lblSubThread_2.setBounds(468, 126, 77, 14);
		frame.getContentPane().add(lblSubThread_2);
		
		JLabel lblSubThread_3 = new JLabel("Sub Thread 3");
		lblSubThread_3.setBounds(468, 165, 77, 14);
		frame.getContentPane().add(lblSubThread_3);
		
		JLabel lblSubThread_4 = new JLabel("Sub Thread 4");
		lblSubThread_4.setBounds(468, 204, 77, 14);
		frame.getContentPane().add(lblSubThread_4);
		
		JLabel lblSubThread_5 = new JLabel("Sub Thread 5");
		lblSubThread_5.setBounds(468, 243, 77, 14);
		frame.getContentPane().add(lblSubThread_5);
		
		JLabel lblSubThread_6 = new JLabel("Sub Thread 6");
		lblSubThread_6.setBounds(468, 282, 77, 14);
		frame.getContentPane().add(lblSubThread_6);
		
		JLabel lblSubThread_7 = new JLabel("Sub Thread 7");
		lblSubThread_7.setBounds(468, 321, 77, 14);
		frame.getContentPane().add(lblSubThread_7);
		
		JLabel lblSubThread_8 = new JLabel("Sub Thread 8");
		lblSubThread_8.setBounds(468, 360, 77, 14);
		frame.getContentPane().add(lblSubThread_8);
		
		JLabel lblSubThread_9 = new JLabel("Sub Thread 9");
		lblSubThread_9.setBounds(468, 399, 77, 14);
		frame.getContentPane().add(lblSubThread_9);
		
		JLabel lblSubThread_10 = new JLabel("Sub Thread 10");
		lblSubThread_10.setBounds(468, 438, 77, 14);
		frame.getContentPane().add(lblSubThread_10);
		
		JLabel lblSubThread_11 = new JLabel("Sub Thread 11");
		lblSubThread_11.setBounds(468, 477, 77, 14);
		frame.getContentPane().add(lblSubThread_11);
		
		JLabel lblSubThread_12 = new JLabel("Sub Thread 12");
		lblSubThread_12.setBounds(468, 516, 77, 14);
		frame.getContentPane().add(lblSubThread_12);
		
		JLabel label = new JLabel("100%");
		label.setBounds(478, 25, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("100%");
		label_1.setBounds(478, 64, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("100%");
		label_2.setBounds(478, 101, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("100%");
		label_3.setBounds(478, 140, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("100%");
		label_4.setBounds(478, 179, 46, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("100%");
		label_5.setBounds(478, 218, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("100%");
		label_6.setBounds(478, 257, 46, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("100%");
		label_7.setBounds(478, 296, 46, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("100%");
		label_8.setBounds(478, 335, 46, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("100%");
		label_9.setBounds(478, 374, 46, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("100%");
		label_10.setBounds(478, 413, 46, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("100%");
		label_11.setBounds(478, 452, 46, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("100%");
		label_12.setBounds(478, 491, 46, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("100%");
		label_13.setBounds(478, 530, 46, 14);
		frame.getContentPane().add(label_13);
	}
}
