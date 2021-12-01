package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField psSenha;
	private JTextField tfLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin();
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
	public GUILogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gilberto\\OneDrive - Fatec Centro Paula Souza\\3\u00BA SEMESTRE\\PROGRAMA\u00C7\u00C3O ORIENTADA A OBJ\\PI\\Quick Vision.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setBounds(109, 108, 46, 14);
		contentPane.add(lbLogin);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setBounds(109, 142, 46, 14);
		contentPane.add(lbSenha);
		
		psSenha = new JPasswordField();
		psSenha.setBounds(165, 139, 133, 20);
		contentPane.add(psSenha);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(165, 105, 133, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JButton btEntrar = new JButton("Iniciar Sess\u00E3o");
		btEntrar.setBounds(165, 170, 133, 23);
		contentPane.add(btEntrar);
	}
}
