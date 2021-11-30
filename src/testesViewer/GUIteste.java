package testesViewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class GUIteste extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIteste frame = new GUIteste();
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
	public GUIteste() {
		setBackground(Color.ORANGE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gilberto\\OneDrive - Fatec Centro Paula Souza\\3\u00BA SEMESTRE\\PROGRAMA\u00C7\u00C3O ORIENTADA A OBJ\\PI\\Quick Vision.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(31, 23, 46, 14);
		contentPane.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(63, 20, 161, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setBounds(31, 51, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setBounds(31, 87, 46, 14);
		contentPane.add(lbTelefone);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField();
		ftfTelefone.setBounds(85, 84, 126, 20);
		contentPane.add(ftfTelefone);
		
		JFormattedTextField ftxCpf = new JFormattedTextField();
		ftxCpf.setBounds(63, 48, 137, 20);
		contentPane.add(ftxCpf);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setBounds(31, 123, 46, 14);
		contentPane.add(lbEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(85, 120, 86, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(31, 177, 364, 73);
		contentPane.add(textArea);
	}
}
