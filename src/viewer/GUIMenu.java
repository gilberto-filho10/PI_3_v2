package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btMorador.setBounds(78, 98, 118, 23);
		contentPane.add(btMorador);
		
		JButton btVisitantes = new JButton("Visitantes");
		btVisitantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btVisitantes.setBounds(78, 132, 118, 23);
		contentPane.add(btVisitantes);
		
		JButton btPrestadores = new JButton("Prestadores");
		btPrestadores.setBounds(78, 166, 118, 23);
		contentPane.add(btPrestadores);
		
		JButton btVeiculo = new JButton("Ve\u00EDculos");
		btVeiculo.setBounds(240, 98, 111, 23);
		contentPane.add(btVeiculo);
		
		JButton btChamado = new JButton("Chamados");
		btChamado.setBounds(240, 166, 111, 23);
		contentPane.add(btChamado);
		
		JButton btRelatorio = new JButton("Relat\u00F3rios");
		btRelatorio.setBounds(240, 132, 111, 23);
		contentPane.add(btRelatorio);
	}

}
