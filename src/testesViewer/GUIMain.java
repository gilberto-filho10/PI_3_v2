package testesViewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Morador;
import model.MoradorDAO;
import services.BD;

public class GUIMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain frame = new GUIMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		private JButton btNovo;
		private JButton btSalvar;
		private JButton btBuscar;
		private JButton btExcluir;
		private JLabel lbidMorador;
		private JLabel lbNome;
		private JLabel lbCpf;
		private JLabel lbTelefone;
		private JLabel lbEmail;
		private JTextField tfidMorador;
		private JTextField tfNome;
		private JTextField tfCpf;
		private JTextField tfTelefone;
		private JTextField tfEmail;
		private MoradorDAO dao;
		private Morador m;

		private JTextField tfLocalizar;
		private JTable table;
		private DefaultTableModel model;
		private BD bd;
		
		//setPreferredSize(new Dimension (500, 430));
		//setLayout (null);
		
		add(btNovo);
		add(btSalvar);
		add(btBuscar);
		add(btExcluir);
		add(lbidMorador);
		add(lbNome);
		add(lbCpf);
		add(lbTelefone);
		add(lbEmail);
		add(tfidMorador);
		add(tfNome);
		add(tfCpf);
		add(tfTelefone);
		add(tfEmail);
		add(tfLocalizar);
		
		btNovo.setBounds(5,150,75,20);
		btSalvar.setBounds(85,150,80,20);
		btBuscar.setBounds (105,15,75,25);
		btExcluir.setBounds (170,150,90,20);
	
		lbidMorador.setBounds(5,15,45,25);
		lbNome.setBounds(5,45,45,25);
		lbCpf.setBounds(5,45,45,25);
		lbTelefone.setBounds(5,45,45,25);
		lbEmail.setBounds(5,45,45,25);
		tfidMorador.setBounds(55,15,45,25);
		tfNome.setBounds(55,45,200,25);
		tfCpf.setBounds(55,45,200,25);
		tfTelefone.setBounds(55,45,200,25);
		tfEmail.setBounds(55,45,200,25);
		
		/**
		 * Create the frame.
		 */
		public GUIMain() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
		}

	}
