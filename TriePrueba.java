import java.awt.EventQueue;
import javax.swing.*;


public class TriePrueba extends JFrame {

	private JTabbedPane contentPane;


	public static void main(String[] args) {
		try {
			TriePrueba frame = new TriePrueba();
			frame.setVisible(true);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	public TriePrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JTabbedPane();
		
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.addTab("Texto", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		contentPane.addTab("Insertar", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		contentPane.addTab("Buscar", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		contentPane.addTab("Reemplazar", null, panel_3, null);
	}

}
