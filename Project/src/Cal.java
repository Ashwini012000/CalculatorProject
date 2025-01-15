import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 class Cal extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal frame = new Cal();
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
	public Cal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setBounds(141, 10, 154, 37);
		heading.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(heading);
		
		JLabel label = new JLabel("A");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(110, 59, 17, 37);
		contentPane.add(label);
		
		tfa = new JTextField();
		tfa.setBounds(154, 64, 154, 26);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblB.setBounds(110, 106, 17, 44);
		contentPane.add(lblB);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(154, 118, 154, 26);
		contentPane.add(tfb);
		
		JLabel lblRes = new JLabel("Res");
		lblRes.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRes.setBounds(91, 160, 65, 37);
		contentPane.add(lblRes);
		
		tfres = new JTextField();
		tfres.setColumns(10);
		tfres.setBounds(154, 165, 154, 26);
		contentPane.add(tfres);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//logic to addition
			String data1=tfa.getText();
			String data2=tfb.getText();
			int data3=Integer.valueOf(data1);
			int data4=Integer.valueOf(data2);
			int res=data3+data4;
			String result=String.valueOf(res);
			tfres.setText(result);
			}
			
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 25));
		add.setBounds(10, 220, 96, 26);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to substraction
				String data1=tfa.getText();
				String data2=tfb.getText();
				int data3=Integer.valueOf(data1);
				int data4=Integer.valueOf(data2);
				int res=data3-data4;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		sub.setFont(new Font("Tahoma", Font.BOLD, 25));
		sub.setBounds(116, 220, 94, 26);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to multiplication
				String data1=tfa.getText();
				String data2=tfb.getText();
				int data3=Integer.valueOf(data1);
				int data4=Integer.valueOf(data2);
				int res=data3*data4;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		mul.setFont(new Font("Tahoma", Font.BOLD, 25));
		mul.setBounds(220, 220, 88, 26);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to division
				String data1=tfa.getText();
				String data2=tfb.getText();
				Float data3=Float.valueOf(data1);
				Float data4=Float.valueOf(data2);
				float res=data3/data4;
				String result=String.valueOf(res);
				tfres.setText(result);
			}
		});
		div.setFont(new Font("Tahoma", Font.BOLD, 25));
		div.setBounds(325, 220, 101, 26);
		contentPane.add(div);
	}

}