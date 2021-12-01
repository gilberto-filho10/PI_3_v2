package viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIConsulta extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIConsulta frame = new GUIConsulta();
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
	public GUIConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Opala", "BRA0S11", "1970", "Vermelho"},
				{"", null, null, null, null},
			},
			new String[] {
				"ID", "Modelo", "Placa", "Ano", "Cor"
			}
		));
		table.setBounds(33, 84, 344, 90);
		contentPane.add(table);
		
		JLabel lbResultado = new JLabel("Resultados:");
		lbResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbResultado.setBounds(10, 11, 87, 14);
		contentPane.add(lbResultado);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.setBounds(288, 50, 89, 23);
		contentPane.add(btExcluir);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIMenu frame = new GUIMenu();
				frame.setVisible(true);
				dispose();
			}
			
			
		});
		btVoltar.setBounds(33, 50, 89, 23);
		contentPane.add(btVoltar);
	}
}
