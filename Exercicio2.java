package Exercicios_Lista4;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtClasses;
	private JTextField txtTags;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setTitle("Calculadora de CSS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qtde de Seletores IDs");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(35, 38, 157, 15);
		contentPane.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(225, 36, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Qtde de Seletores Classes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(35, 83, 157, 14);
		contentPane.add(lblNewLabel_1);
		
		txtClasses = new JTextField();
		txtClasses.setBounds(225, 81, 86, 20);
		contentPane.add(txtClasses);
		txtClasses.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Qtde de Seletores Tags");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(35, 131, 139, 14);
		contentPane.add(lblNewLabel_2);
		
		txtTags = new JTextField();
		txtTags.setBounds(225, 129, 86, 20);
		contentPane.add(txtTags);
		txtTags.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Id = Integer.parseInt(txtId.getText())*100;
				int Classes = Integer.parseInt(txtClasses.getText())*10;
				int Tags = Integer.parseInt(txtTags.getText());
				
				JOptionPane.showMessageDialog(null, "A quantidade total de pontos é: " + (Id+Classes+Tags) 
						+ "\nIds= " + Id 
						+ ", Classes= " + Classes 
						+ " e Tags= " + Tags , "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(158, 198, 109, 31);
		contentPane.add(btnNewButton);
	}
}
