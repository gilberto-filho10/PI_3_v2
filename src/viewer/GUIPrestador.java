package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class GUIPrestador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField tfNome;
	private JTextField txSolicitante;
	private JTextField tfRg;
	private JTextField tfLocalizarP;
	private JTextField tfEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPrestador frame = new GUIPrestador();
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
	public GUIPrestador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 382);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTituloP = new JLabel("Prestadores");
		lbTituloP.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbTituloP.setBounds(221, 11, 87, 14);
		contentPane.add(lbTituloP);
		
		JLabel lbIdPrestadores = new JLabel("ID");
		lbIdPrestadores.setBounds(28, 62, 46, 14);
		contentPane.add(lbIdPrestadores);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(260, 74, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbCnpj = new JLabel("CNPJ");
		lbCnpj.setBounds(28, 96, 46, 14);
		contentPane.add(lbCnpj);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setBounds(260, 112, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lbRg = new JLabel("RG");
		lbRg.setBounds(28, 127, 46, 14);
		contentPane.add(lbRg);
		
		JLabel lbCep = new JLabel("CEP");
		lbCep.setBounds(260, 143, 46, 14);
		contentPane.add(lbCep);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o");
		lbEndereco.setBounds(28, 154, 46, 14);
		contentPane.add(lbEndereco);
		
		JLabel lbResponsavel = new JLabel("Morador Solicitante ");
		lbResponsavel.setBounds(28, 182, 100, 14);
		contentPane.add(lbResponsavel);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setBounds(270, 179, 46, 14);
		contentPane.add(lbTelefone);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(70, 59, 56, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setBounds(298, 71, 184, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JFormattedTextField txCnpj = new JFormattedTextField();
		txCnpj.setBounds(70, 93, 100, 20);
		contentPane.add(txCnpj);
		
		JFormattedTextField txCpf = new JFormattedTextField();
		txCpf.setBounds(298, 106, 184, 20);
		contentPane.add(txCpf);
		
		JFormattedTextField txCep = new JFormattedTextField();
		txCep.setBounds(298, 137, 118, 20);
		contentPane.add(txCep);
		
		JFormattedTextField txTelefone = new JFormattedTextField();
		txTelefone.setBounds(323, 176, 103, 20);
		contentPane.add(txTelefone);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(84, 151, 142, 20);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		txSolicitante = new JTextField();
		txSolicitante.setBounds(128, 179, 108, 20);
		contentPane.add(txSolicitante);
		txSolicitante.setColumns(10);
		
		tfRg = new JTextField();
		tfRg.setBounds(70, 124, 100, 20);
		contentPane.add(tfRg);
		tfRg.setColumns(10);
		
		JLabel lbLocalizarP = new JLabel("Buscar");
		lbLocalizarP.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbLocalizarP.setBounds(28, 241, 62, 14);
		contentPane.add(lbLocalizarP);
		
		tfLocalizarP = new JTextField();
		tfLocalizarP.setBounds(28, 281, 280, 20);
		contentPane.add(tfLocalizarP);
		tfLocalizarP.setColumns(10);
		
		JButton btLocalizarP = new JButton("Pesquisar");
		btLocalizarP.setBounds(327, 280, 89, 23);
		contentPane.add(btLocalizarP);
		
		JButton tbSalvarP = new JButton("Salvar");
		tbSalvarP.setBounds(221, 210, 87, 23);
		contentPane.add(tbSalvarP);
	}

}
