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
		JPanel panel_1 = new JPanel();

		
		JPanel panel_2 = new JPanel();

		
		JPanel panel_3 = new JPanel();
		
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		
		JLabel label_1 = new JLabel("Texto actual");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(119, 15, 350, 14);
		
		JTextArea textArea = new JTextArea(/* contenido de ejemplo */);
		textArea.setBounds(60, 40, 465, 204);
		
		JLabel label_2 = new JLabel("Operaciones");
		label_2.setBounds(119, 265, 350, 14);
		label_2.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel operaciones = new JPanel(new FlowLayout(FlowLayout.CENTER));
		operaciones.setBounds(119,290,350,33);
		JButton operacionInsertar = new JButton("Insertar");
		operacionInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setSelectedComponent(panel_1);
			}
		});
		JButton operacionBuscar = new JButton("Buscar");
		operacionBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setSelectedComponent(panel_2);
			}
		});
		JButton operacionReemplazar = new JButton("Reemplazar");
		operacionReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setSelectedComponent(panel_3);
			}
		});
		
		operaciones.add(operacionInsertar);
		operaciones.add(operacionBuscar);
		operaciones.add(operacionReemplazar);
		
		panelPrincipal.add(label_1);
		panelPrincipal.add(textArea);
		panelPrincipal.add(label_2);
		panelPrincipal.add(operaciones);

		contentPane.addTab("Texto", null, panelPrincipal, null);
		contentPane.addTab("Insertar", null, panel_1, null);
		contentPane.addTab("Buscar", null, panel_2, null);
		contentPane.addTab("Reemplazar", null, panel_3, null);

	}
}
