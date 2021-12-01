package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class GUIVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField tfModelo;
	private JTextField tfCor;
	private JTextField tfIdVeiculo;
	private JTextField tfLocalizarVe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIVeiculo frame = new GUIVeiculo();
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
	public GUIVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbIdVeiculo = new JLabel("ID");
		lbIdVeiculo.setBounds(21, 58, 46, 14);
		contentPane.add(lbIdVeiculo);
		
		JLabel lbModelo = new JLabel("Modelo");
		lbModelo.setBounds(21, 83, 46, 14);
		contentPane.add(lbModelo);
		
		JLabel lbPlaca = new JLabel("Placa");
		lbPlaca.setBounds(21, 108, 46, 14);
		contentPane.add(lbPlaca);
		
		JLabel lbAno = new JLabel("Ano");
		lbAno.setBounds(21, 133, 46, 14);
		contentPane.add(lbAno);
		
		JLabel lbCor = new JLabel("Cor");
		lbCor.setBounds(21, 161, 46, 14);
		contentPane.add(lbCor);
		
		JLabel lbTituloVe = new JLabel("Ve\u00EDculos");
		lbTituloVe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbTituloVe.setBounds(170, 11, 87, 14);
		contentPane.add(lbTituloVe);
		
		tfModelo = new JTextField();
		tfModelo.setBounds(67, 80, 86, 20);
		contentPane.add(tfModelo);
		tfModelo.setColumns(10);
		
		tfCor = new JTextField();
		tfCor.setBounds(67, 158, 86, 20);
		contentPane.add(tfCor);
		tfCor.setColumns(10);
		
		JFormattedTextField txPlaca = new JFormattedTextField();
		txPlaca.setBounds(67, 108, 86, 20);
		contentPane.add(txPlaca);
		
		JFormattedTextField txAno = new JFormattedTextField();
		txAno.setBounds(67, 133, 86, 20);
		contentPane.add(txAno);
		
		tfIdVeiculo = new JTextField();
		tfIdVeiculo.setEditable(false);
		tfIdVeiculo.setBounds(67, 55, 86, 20);
		contentPane.add(tfIdVeiculo);
		tfIdVeiculo.setColumns(10);
		
		JButton tbSalvarVe = new JButton("Salvar");
		tbSalvarVe.setBounds(170, 181, 87, 23);
		contentPane.add(tbSalvarVe);
		
		JLabel lbLocalizarVe = new JLabel("Buscar");
		lbLocalizarVe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbLocalizarVe.setBounds(10, 204, 62, 14);
		contentPane.add(lbLocalizarVe);
		
		tfLocalizarVe = new JTextField();
		tfLocalizarVe.setColumns(10);
		tfLocalizarVe.setBounds(10, 229, 280, 20);
		contentPane.add(tfLocalizarVe);
		
		JButton btLocalizarVe = new JButton("Pesquisar");
		btLocalizarVe.setBounds(309, 228, 89, 23);
		contentPane.add(btLocalizarVe);
	}

}
