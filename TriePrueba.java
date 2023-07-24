import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TriePrueba extends JFrame {

	private JTabbedPane contentPane;


	public static void main(String[] args) {
		try {
			TriePrueba frame = new TriePrueba();
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			frame.setVisible(true);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	public TriePrueba() {
		setTitle("Trie - Operaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JTabbedPane();
		
		setContentPane(contentPane);
		
		// Creando Paneles...
		JPanel panel_insertar = new JPanel();

		panel_insertar.setLayout(null);
		JLabel label_insertar_1 = new JLabel("Insertar Palabra");
		label_insertar_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_insertar_1.setBounds(115, 115, 350, 14);
		
		JLabel label_insertar_2 = new JLabel("Insertar:");
		label_insertar_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_insertar_2.setBounds(116, 165, 89, 14);
		
		JTextField text_insertar = new JTextField();
		text_insertar.setBounds(215, 162, 251, 20);
		text_insertar.setColumns(10);
		
		JButton boton_insertar = new JButton("Insertar");
		boton_insertar.setBounds(245, 228, 89, 23);
		boton_insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		panel_insertar.add(label_insertar_1);
		panel_insertar.add(label_insertar_2);
		panel_insertar.add(text_insertar);
		panel_insertar.add(boton_insertar);

		
		JPanel panel_buscar = new JPanel();

		panel_buscar.setLayout(null);
		JLabel label_buscar_1 = new JLabel("Buscar Palabra");
		label_buscar_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_buscar_1.setBounds(115, 115, 350, 14);
		
		JLabel label_buscar_2 = new JLabel("Buscar:");
		label_buscar_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_buscar_2.setBounds(116, 165, 89, 14);
		
		JTextField text_buscar = new JTextField();
		text_buscar.setBounds(215, 162, 251, 20);
		text_buscar.setColumns(10);
		
		JButton boton_buscar = new JButton("Buscar");
		boton_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		boton_buscar.setBounds(245, 228, 89, 23);
		
		panel_buscar.add(label_buscar_1);
		panel_buscar.add(label_buscar_2);
		panel_buscar.add(text_buscar);
		panel_buscar.add(boton_buscar);
		
		
		JPanel panel_reemplazar = new JPanel();
		
		
		JPanel panel_principal = new JPanel();
		panel_principal.setLayout(null);
		
		JLabel label_principal_1 = new JLabel("Texto actual");
		label_principal_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_principal_1.setBounds(119, 15, 350, 14);
		
		JTextArea textArea = new JTextArea(/* contenido de ejemplo */);
		textArea.setBounds(60, 40, 465, 204);
		
		JLabel label_principal_2 = new JLabel("Operaciones");
		label_principal_2.setBounds(119, 265, 350, 14);
		label_principal_2.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel operaciones = new JPanel(new FlowLayout(FlowLayout.CENTER));
		operaciones.setBounds(119,290,350,33);
		
		JButton operacionInsertar = new JButton("Insertar");
		operacionInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setSelectedComponent(panel_insertar);
			}
		});
		JButton operacionBuscar = new JButton("Buscar");
		operacionBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setSelectedComponent(panel_buscar);
			}
		});
		JButton operacionReemplazar = new JButton("Reemplazar");
		operacionReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setSelectedComponent(panel_reemplazar);
			}
		});
		
		operaciones.add(operacionInsertar);
		operaciones.add(operacionBuscar);
		operaciones.add(operacionReemplazar);
		
		panel_principal.add(label_principal_1);
		panel_principal.add(textArea);
		panel_principal.add(label_principal_2);
		panel_principal.add(operaciones);

		// agregando pestañas al frame
		contentPane.addTab("Texto", null, panel_principal, null);
		contentPane.addTab("Insertar", null, panel_insertar, null);
		contentPane.addTab("Buscar", null, panel_buscar, null);
		contentPane.addTab("Reemplazar", null, panel_reemplazar, null);

	}
}
