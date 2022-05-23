package Q2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TELA extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtQtd;

 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TELA frame = new TELA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		);
	}

 
	public TELA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setBounds(159, 29, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor da arroba");
		lblValor.setBounds(21, 76, 98, 20);
		contentPane.add(lblValor);
		
		JLabel lblQtd = new JLabel("Quantidade de Arroba");
		lblQtd.setBounds(21, 147, 134, 14);
		contentPane.add(lblQtd);
		
		txtValor = new JTextField();
		txtValor.setBounds(262, 76, 119, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(262, 144, 119, 20);
		contentPane.add(txtQtd);
		txtQtd.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(txtValor.getText());
				int qtde = Integer.parseInt(txtQtd.getText());
				int calcular = qtde * valor; 
				JOptionPane.showMessageDialog(null, "O valor total � de: "+calcular);
			}
		});
		btnCalcular.setBounds(159, 215, 89, 23);
		contentPane.add(btnCalcular);
	}

}
