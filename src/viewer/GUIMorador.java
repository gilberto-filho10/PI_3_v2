package viewer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Morador;
import model.MoradorDAO;
import services.BD;

public class GUIMorador extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfLocalizarM;
	private MoradorDAO dao;
	private Morador m;
	private BD bd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMorador frame = new GUIMorador();
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
	public GUIMorador() {
		dao = new MoradorDAO();
		m = new Morador();
		bd = new BD();
		bd.getConnection();
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTituloM = new JLabel("Moradores");
		lbTituloM.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbTituloM.setBounds(181, 25, 87, 14);
		contentPane.add(lbTituloM);
		
		JLabel lbIdMorador = new JLabel("ID");
		lbIdMorador.setBounds(20, 53, 46, 14);
		contentPane.add(lbIdMorador);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(20, 78, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setBounds(20, 103, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setBounds(20, 132, 46, 14);
		contentPane.add(lbTelefone);
		
		JLabel lbEmail = new JLabel("E-mal");
		lbEmail.setBounds(20, 157, 46, 14);
		contentPane.add(lbEmail);
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setBounds(76, 50, 62, 20);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setBounds(76, 75, 192, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JFormattedTextField txCpf = new JFormattedTextField();
		txCpf.setBounds(76, 100, 108, 20);
		contentPane.add(txCpf);
		
		JFormattedTextField txTelefone = new JFormattedTextField();
		txTelefone.setBounds(76, 129, 108, 20);
		contentPane.add(txTelefone);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(76, 154, 192, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfLocalizarM = new JTextField();
		tfLocalizarM.setBounds(20, 230, 248, 20);
		contentPane.add(tfLocalizarM);
		tfLocalizarM.setColumns(10);
		
		JLabel lbLocalizarM = new JLabel("Buscar");
		lbLocalizarM.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbLocalizarM.setBounds(20, 207, 62, 14);
		contentPane.add(lbLocalizarM);
		
		JButton btLocalizarM = new JButton("Pesquisar");
		btLocalizarM.setBounds(278, 229, 89, 23);
		contentPane.add(btLocalizarM);
		
		JButton tbSalvarM = new JButton("Salvar");
		tbSalvarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfNome.getText() != null && txCpf.getText()!=null) {
					JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
				}
				else {
					JOptionPane.showMessageDialog(null,"Verifique o preenchimento dos dados");
					}
			}
		});
		tbSalvarM.setBounds(181, 185, 87, 23);
		contentPane.add(tbSalvarM);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIMenu frame = new GUIMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btVoltar.setBounds(10, 11, 74, 23);
		contentPane.add(btVoltar);
	}
}
