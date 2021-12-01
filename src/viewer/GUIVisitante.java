package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIVisitante extends JFrame {

	private JPanel contentPane;
	private JTextField tfLocalizarVi;
	private JTextField txIdVisitante;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField tfMorResp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIVisitante frame = new GUIVisitante();
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
	public GUIVisitante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTituloVi = new JLabel("Visitantes");
		lbTituloVi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbTituloVi.setBounds(197, 11, 87, 14);
		contentPane.add(lbTituloVi);
		
		JButton tbSalvarVi = new JButton("Salvar");
		tbSalvarVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(tfMorResp.getText() == null) {
					JOptionPane.showMessageDialog(null,"Verifique o preenchimento dos dados");
				//}
				//else {
					//JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
					//}
			}
		});
		tbSalvarVi.setBounds(183, 193, 87, 23);
		contentPane.add(tbSalvarVi);
		
		JLabel lbLocalizarVi = new JLabel("Buscar");
		lbLocalizarVi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbLocalizarVi.setBounds(22, 214, 62, 14);
		contentPane.add(lbLocalizarVi);
		
		tfLocalizarVi = new JTextField();
		tfLocalizarVi.setColumns(10);
		tfLocalizarVi.setBounds(22, 239, 280, 20);
		contentPane.add(tfLocalizarVi);
		
		JButton btLocalizarVi = new JButton("Pesquisar");
		btLocalizarVi.setBounds(321, 238, 89, 23);
		contentPane.add(btLocalizarVi);
		
		JLabel lbIdVisitante = new JLabel("ID");
		lbIdVisitante.setBounds(22, 50, 46, 14);
		contentPane.add(lbIdVisitante);
		
		txIdVisitante = new JTextField();
		txIdVisitante.setEditable(false);
		txIdVisitante.setColumns(10);
		txIdVisitante.setBounds(78, 47, 62, 20);
		contentPane.add(txIdVisitante);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 44, 191, 20);
		contentPane.add(textField_1);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(163, 47, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setBounds(23, 78, 46, 14);
		contentPane.add(lbCpf);
		
		JFormattedTextField txCpf = new JFormattedTextField();
		txCpf.setBounds(101, 72, 108, 20);
		contentPane.add(txCpf);
		
		JFormattedTextField txTelefone = new JFormattedTextField();
		txTelefone.setBounds(101, 100, 108, 20);
		contentPane.add(txTelefone);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setBounds(23, 106, 61, 14);
		contentPane.add(lbTelefone);
		
		JLabel lbEmail = new JLabel("E-mal");
		lbEmail.setBounds(22, 137, 46, 14);
		contentPane.add(lbEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 134, 206, 20);
		contentPane.add(textField_2);
		
		JLabel lblMoradorResponsavel = new JLabel("Morador Respons\u00E1vel");
		lblMoradorResponsavel.setBounds(23, 165, 126, 14);
		contentPane.add(lblMoradorResponsavel);
		
		tfMorResp = new JTextField();
		tfMorResp.setColumns(10);
		tfMorResp.setBounds(159, 162, 239, 20);
		contentPane.add(tfMorResp);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIMenu frame = new GUIMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btVoltar.setBounds(10, 9, 74, 23);
		contentPane.add(btVoltar);
	}

}
