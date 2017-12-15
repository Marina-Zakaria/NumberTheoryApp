package ExtendedEuclidianAlgorithm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class getMulInverse extends JFrame {

	private JPanel contentPane;
	private JTextField A;
	private JTextField B;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getMulInverse frame = new getMulInverse();
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
	public getMulInverse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		A = new JTextField();
		A.setBounds(126, 38, 86, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setBounds(372, 38, 86, 20);
		contentPane.add(B);
		B.setColumns(10);
		
		JTextArea txtrIfWePerformed = new JTextArea();
		txtrIfWePerformed.setText("if we performed the Euclidean Algorithm we get the Greatest \n"
				+ " Common Divisor of the 2 numbers ");
		txtrIfWePerformed.setBounds(10, 75, 690, 57);
		contentPane.add(txtrIfWePerformed);
		
		JTextArea gcd = new JTextArea();
		gcd.setBounds(254, 143, 173, 22);
		contentPane.add(gcd);
		
		JLabel lblTheGcdIs = new JLabel("the GCD is");
		lblTheGcdIs.setBounds(65, 143, 107, 20);
		contentPane.add(lblTheGcdIs);
		
		JTextArea txtrAnswer = new JTextArea();
		txtrAnswer.setBounds(10, 275, 690, 57);
		txtrAnswer.setEditable(false);
		contentPane.add(txtrAnswer);

		
		JLabel lblEnterNumberA = new JLabel("Enter number A ");
		lblEnterNumberA.setBounds(10, 41, 106, 14);
		contentPane.add(lblEnterNumberA);
		
		JLabel lblEnterTheMod = new JLabel("Enter the mod B ");
		lblEnterTheMod.setBounds(252, 41, 110, 14);
		contentPane.add(lblEnterTheMod);
		
		JTextArea txtrIfWePerformed_1 = new JTextArea();
		txtrIfWePerformed_1.setText("if we performed the Extended Euclidean Algorithm we get the two unique values of x & y \n"
				+ "that satisfies the equation GCD(A,B) = Ax + B y ");
		txtrIfWePerformed_1.setBounds(10, 176, 690, 57);
		contentPane.add(txtrIfWePerformed_1);
		
		JLabel lblTheValueOf = new JLabel("the value of x is");
		lblTheValueOf.setBounds(65, 244, 118, 20);
		contentPane.add(lblTheValueOf);
		
		JLabel lblTheValueOf_1 = new JLabel("the value of y is");
		lblTheValueOf_1.setBounds(389, 244, 111, 20);
		contentPane.add(lblTheValueOf_1);
		
		JTextArea x = new JTextArea();
		x.setBounds(193, 244, 173, 22);
		contentPane.add(x);
		
		JTextArea y = new JTextArea();
		y.setBounds(510, 244, 173, 22);
		contentPane.add(y);
		JLabel lblTheMultiplicativeInverse = new JLabel("");
		lblTheMultiplicativeInverse .setText("the Multiplicative Inverse of A mod B is");
		lblTheMultiplicativeInverse.setBounds(48, 343, 245, 39);
		contentPane.add(lblTheMultiplicativeInverse);
		
		JTextArea txtmulInverse = new JTextArea();
		txtmulInverse.setBounds(320, 350, 150, 22);
		txtmulInverse.setEditable(false);
		contentPane.add(txtmulInverse);
		
		
		JButton btnNewButton = new JButton("get multiplicative inverse of A in mod B ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mulInverse module = new mulInverse(Long.valueOf(B.getText()), Long.valueOf(A.getText()));
				gcd.setText(String.valueOf(module.getGcd()));
				x.setText(String.valueOf(module.getX()));
				y.setText(String.valueOf(module.getY()));
				

				if(module.getGcd()!=1){
					txtrAnswer.setText("Since the GCD of A and B is not 1 then A and B are not relatively prime \n"
							+ " which means A doesn't have a multiplicative Inverse in mod B ");
					txtmulInverse.setText("don't exist");
					
				}else{
					txtrAnswer.setText("Since the GCD of A and B is 1 then A and B are relatively prime \n"
							+ " which means A has a multiplicative Inverse in mod B ");
					txtmulInverse.setText(String.valueOf(module.getMulInverse()));
					
				}
			}
		});
		btnNewButton.setBounds(468, 37, 263, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
}
