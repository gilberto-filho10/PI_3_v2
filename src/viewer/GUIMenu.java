package viewer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUIMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMenu frame = new GUIMenu();
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
	public GUIMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbtitulo = new JLabel("MENU");
		lbtitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtitulo.setBounds(192, 30, 46, 14);
		contentPane.add(lbtitulo);
		
		JButton btMorador = new JButton("Moradores");
		btMorador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIMorador frame = new GUIMorador();
				frame.setVisible(true);
				dispose();
			}
		});
		btMorador.setBounds(78, 98, 118, 23);
		contentPane.add(btMorador);
		
		JButton btVisitantes = new JButton("Visitantes");
		btVisitantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIVisitante frame = new GUIVisitante();
				frame.setVisible(true);
				dispose();
			}
		});
		btVisitantes.setBounds(78, 132, 118, 23);
		contentPane.add(btVisitantes);
		
		JButton btPrestadores = new JButton("Prestadores");
		btPrestadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIPrestador frame = new GUIPrestador();
				frame.setVisible(true);
				dispose();
			}
		});
		btPrestadores.setBounds(78, 166, 118, 23);
		contentPane.add(btPrestadores);
		
		JButton btVeiculo = new JButton("Ve\u00EDculos");
		btVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIVeiculo frame = new GUIVeiculo();
				frame.setVisible(true);
				dispose();
			}
		});
		btVeiculo.setBounds(240, 98, 111, 23);
		contentPane.add(btVeiculo);
		
		JButton btChamado = new JButton("Chamados");
		btChamado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Em breve!");
			}
		});
		btChamado.setBounds(240, 166, 111, 23);
		contentPane.add(btChamado);
		
		JButton btRelatorio = new JButton("Relat\u00F3rios");
		btRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Em breve!!");
			}
		});
		btRelatorio.setBounds(240, 132, 111, 23);
		contentPane.add(btRelatorio);
	}

}
