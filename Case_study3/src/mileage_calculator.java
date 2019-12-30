import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mileage_calculator {

	private JFrame frame;
	private JTextField d;
	private JTextField p;
	private JTextField m;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mileage_calculator window = new mileage_calculator();
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
	public mileage_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MILEAGE CALCULATOR");
		lblNewLabel.setBounds(144, 23, 118, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DISTANCE COVERED IN Km");
		lblNewLabel_1.setBounds(53, 71, 131, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PETROL CONSUMED IN LITRE");
		lblNewLabel_2.setBounds(53, 109, 142, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		d = new JTextField();
		d.setBounds(236, 68, 86, 20);
		frame.getContentPane().add(d);
		d.setColumns(10);
		
		p = new JTextField();
		p.setBounds(236, 106, 86, 20);
		frame.getContentPane().add(p);
		p.setColumns(10);
		
		JButton cal = new JButton("CALCULATE");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int p1=Integer.parseInt(p.getText());
				int d1=Integer.parseInt(d.getText());
				int m1=d1/p1;
				m.setText(String.valueOf(m1));
			}
		});
		cal.setBounds(128, 152, 89, 23);
		frame.getContentPane().add(cal);
		
		JLabel lblNewLabel_3 = new JLabel("MILEAGE PER LITRE ");
		lblNewLabel_3.setBounds(53, 203, 110, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		m = new JTextField();
		m.setBounds(236, 200, 86, 20);
		frame.getContentPane().add(m);
		m.setColumns(10);
	}

}
