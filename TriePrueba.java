import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class TriePrueba extends JFrame implements ActionListener{
	private JLabel operaciones;
	private JPanel panel1;
	private JButton enviar,operacionInsertar,operacionBuscar,operacionReemplazar;
	public static void main(String [] args) {
		// sujeto a cambios
		new TriePrueba();
	}
	public TriePrueba() {// sujeto a cambios
		setTitle("Operaciones trie");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,720);
		setLocationRelativeTo(null);
		
		
		createContents();
		setVisible(true);
	}
	public void createContents() {
		panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		operaciones = new JLabel("Operaciones");
		operacionInsertar = new JButton("Insertar elemento");
		operacionBuscar = new JButton("Buscar elemento");
		operacionReemplazar = new JButton("Reemplazar elemento");
		panel1.add(operaciones);
		panel1.add(operacionInsertar);
		panel1.add(operacionBuscar);
		panel1.add(operacionReemplazar);
		add(panel1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
