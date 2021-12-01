package viewer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

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
	 * Create the frame, com as validações de login e senha.
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
		lbLogin.setBounds(187, 96, 46, 14);
		contentPane.add(lbLogin);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setBounds(187, 130, 46, 14);
		contentPane.add(lbSenha);
		
		psSenha = new JPasswordField();
		psSenha.setBounds(243, 127, 133, 20);
		contentPane.add(psSenha);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(243, 93, 133, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JButton btEntrar = new JButton("Iniciar Sess\u00E3o");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkLogin(tfLogin.getText(), new String (psSenha.getPassword()))) {
					//JOptionPane.showMessageDialog(null,"");
					GUIMenu frame = new GUIMenu();
					frame.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Login ou senha incorreto!");
				}
			}
		});
		btEntrar.setBounds(243, 158, 133, 23);
		contentPane.add(btEntrar);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/Logo2.png")).getImage();
		label.setIcon (new ImageIcon(img));
		label.setBounds(63, 76, 90, 110);
		contentPane.add(label);
		
		JLabel lbBoasVindas = new JLabel("BEM-VINDO!!");
		lbBoasVindas.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbBoasVindas.setBounds(156, 33, 117, 23);
		contentPane.add(lbBoasVindas);
	}
	/**
	 * Método com senha padrão do administrador do sistema.
	 * @param login
	 * @param senha
	 * @return - a GUIMenu do sistema ou uma mensagem de senha inválida.
	 */
	public boolean checkLogin(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}
}
