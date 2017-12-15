package PowerComputingTechniques;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.awt.event.ActionEvent;

public class PowerComputing extends JFrame {

	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PowerComputing frame = new PowerComputing();
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
	public PowerComputing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		A = new JTextField();
		A.setBounds(58, 22, 119, 20);
		contentPane.add(A);
		A.setColumns(10);

		B = new JTextField();
		B.setBounds(298, 22, 86, 20);
		contentPane.add(B);
		B.setColumns(10);

		n = new JTextField();
		n.setBounds(447, 22, 86, 20);
		contentPane.add(n);
		n.setColumns(10);

		JLabel lblA = new JLabel("A");
		lblA.setBounds(22, 25, 26, 14);
		contentPane.add(lblA);

		JLabel lblToThePower = new JLabel("To the Power B");
		lblToThePower.setBounds(187, 25, 101, 14);
		contentPane.add(lblToThePower);

		JLabel lblMod = new JLabel("mod N");
		lblMod.setBounds(391, 25, 46, 14);
		contentPane.add(lblMod);

		JTextArea Technique1 = new JTextArea("Technique 1 is the naiif technique using the ordinary \n "
				+ "multiplication which is slow due to large number of operations \n"
				+ " and not efficeint for large number we need to compute in cryptography ");
		Technique1.setBounds(10, 53, 570, 64);
		contentPane.add(Technique1);

		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(187, 248, 46, 14);
		contentPane.add(lblResult);

		JTextArea result1 = new JTextArea();
		result1.setBounds(243, 121, 65, 22);
		contentPane.add(result1);

		JLabel lblNumofoperations = new JLabel("NumOfOperations");
		lblNumofoperations.setBounds(318, 248, 93, 14);
		contentPane.add(lblNumofoperations);

		JTextArea operations1 = new JTextArea();
		operations1.setBounds(432, 121, 61, 22);
		contentPane.add(operations1);

		JLabel lblTimetaken = new JLabel("TimeTaken");
		lblTimetaken.setBounds(503, 248, 86, 14);
		contentPane.add(lblTimetaken);

		JTextArea time1 = new JTextArea();
		time1.setBounds(599, 121, 74, 22);
		contentPane.add(time1);

		// technique 2

		JTextArea Technique2 = new JTextArea("Technique 2 is less naiif technique using the ordinary \n"
				+ " multiplication in addition to repeating the mod operation to avoid the occurence of \n overflow  "
				+ "which is slow due to large number of operations \n "
				+ "and not efficeint for large number we need to compute in cryptography ");
		Technique2.setBounds(10, 152, 707, 85);
		contentPane.add(Technique2);

		JLabel lblResult2 = new JLabel("Result");
		lblResult2.setBounds(187, 128, 46, 14);
		contentPane.add(lblResult2);

		JTextArea result2 = new JTextArea();
		result2.setBounds(243, 243, 65, 22);
		contentPane.add(result2);

		JLabel lblNumofoperations2 = new JLabel("NumOfOperations");
		lblNumofoperations2.setBounds(318, 121, 93, 14);
		contentPane.add(lblNumofoperations2);

		JTextArea operations2 = new JTextArea();
		operations2.setBounds(432, 243, 61, 22);
		contentPane.add(operations2);

		JLabel lblTimetaken2 = new JLabel("TimeTaken");
		lblTimetaken2.setBounds(503, 121, 86, 14);
		contentPane.add(lblTimetaken2);

		JTextArea time2 = new JTextArea();
		time2.setBounds(605, 243, 68, 22);
		contentPane.add(time2);
		// technique 3

		JTextArea txtrTechniqueIs = new JTextArea(
				"Technique 3 is the most efficeint technique using the binary representation of the power \n "
						+ "it minimizes the number of multiplication and mod operations required \n"
						+ " used in cryptography applications to avoid overflow and save time ");
		txtrTechniqueIs.setBounds(10, 273, 707, 71);
		contentPane.add(txtrTechniqueIs);

		JLabel label = new JLabel("Result");
		label.setBounds(187, 369, 46, 14);
		contentPane.add(label);

		JTextArea result3 = new JTextArea("result3");
		result3.setBounds(243, 369, 65, 22);
		contentPane.add(result3);

		JLabel label_1 = new JLabel("NumOfOperations");
		label_1.setBounds(318, 373, 93, 14);
		contentPane.add(label_1);

		JTextArea operations3 = new JTextArea("operations3");
		operations3.setBounds(432, 369, 61, 22);
		contentPane.add(operations3);

		JLabel label_2 = new JLabel("TimeTaken");
		label_2.setBounds(515, 373, 86, 14);
		contentPane.add(label_2);

		JTextArea time3 = new JTextArea();
		time3.setBounds(611, 369, 68, 22);
		contentPane.add(time3);

		JButton btnCalculatePower = new JButton("Calculate Power");
		btnCalculatePower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (A.getText().equals("") || B.getText().equals("") || n.getText().equals("")) {
					if (A.getText().equals(""))
						A.setText("please enter a valid number");
					if (B.getText().equals(""))
						B.setText("please enter a valid number");
					if (n.getText().equals(""))
						n.setText("please enter a valid number");

				} else {
					BigInteger firstNum = BigInteger.valueOf(Long.valueOf(A.getText()));
					BigInteger secondNum = BigInteger.valueOf(Long.valueOf(B.getText()));
					BigInteger modNum = BigInteger.valueOf(Long.valueOf(n.getText()));
					long currentTime;
					ApowerBmodN computingModule = new ApowerBmodN(firstNum, secondNum, modNum);
					currentTime = (long) (System.nanoTime()/Math.pow(10, 3)) ;
					result1.setText(String.valueOf(computingModule.technique1()));
					time1.setText(String.valueOf((long) (System.nanoTime()/Math.pow(10, 3))  - currentTime) + " microsecond");
					operations1.setText(String.valueOf(computingModule.getOperationsNumber()));
					currentTime = (long) (System.nanoTime()/Math.pow(10, 3));
					result2.setText(String.valueOf(computingModule.technique2()));
					time2.setText(String.valueOf((long) (System.nanoTime()/Math.pow(10, 3)) - currentTime) + " microsecond");
					operations2.setText(String.valueOf(computingModule.getOperationsNumber()));
					currentTime = (long) (System.nanoTime()/Math.pow(10, 3)) ;
					result3.setText(String.valueOf(computingModule.technique3()));
					time3.setText(String.valueOf((long) (System.nanoTime()/Math.pow(10, 3))  - currentTime) + " microsecond");
					operations3.setText(String.valueOf(computingModule.getOperationsNumber()));
				}
			}
		});
		btnCalculatePower.setBounds(568, 21, 137, 23);
		contentPane.add(btnCalculatePower);
	}
}
