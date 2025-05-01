package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Veterinaria.DatosC;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VDatosC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_N;
	private JTextField txt_DNI;
	private JTextField txt_Direccion;
	private JTextField txt_Telefono;
	private JTextField txt_Correo;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VDatosC frame = new VDatosC();
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
	public VDatosC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese Nombre : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 102, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese DNI : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 37, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese Dirección :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 96, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingrese Numero Teléfono : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 127, 167, 14);
		contentPane.add(lblNewLabel_3);
		
		txt_N = new JTextField();
		txt_N.setBounds(174, 9, 167, 20);
		contentPane.add(txt_N);
		txt_N.setColumns(10);
		
		txt_DNI = new JTextField();
		txt_DNI.setBounds(174, 35, 167, 20);
		contentPane.add(txt_DNI);
		txt_DNI.setColumns(10);
		
		txt_Direccion = new JTextField();
		txt_Direccion.setBounds(174, 94, 167, 20);
		contentPane.add(txt_Direccion);
		txt_Direccion.setColumns(10);
		
		txt_Telefono = new JTextField();
		txt_Telefono.setBounds(174, 125, 167, 20);
		contentPane.add(txt_Telefono);
		txt_Telefono.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ingrese Correo :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 71, 114, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txt_Correo = new JTextField();
		txt_Correo.setBounds(174, 66, 167, 20);
		contentPane.add(txt_Correo);
		txt_Correo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 178, 522, 146);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btn_Procesar = new JButton("Procesar");
		btn_Procesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String nombre = txt_N.getText();
				String correo = txt_Correo.getText();
				String Dirección = txt_Direccion.getText();
				int DNI = Integer.parseInt(txt_DNI.getText());
				int telefono = Integer.parseInt(txt_Telefono.getText());
				
				DatosC D = new DatosC (nombre, correo, Dirección);
				DatosC D1 = new DatosC (DNI,telefono);
				resultado(D);
				resultado2(D1);
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null," Error: Ingrese solo números válidos en DNI y Teléfono.");
				}
				
			}
			
			public void Imprimir(String S) {
			      textArea.append(S+"\n");
			}
			
			public void resultado(DatosC D) {
			     Imprimir(" el Nombre del Dueño es : " + D.getNombre());
			     Imprimir(" El correo es: " + D.getCorreo());
			     Imprimir("  La Direccion del Dueño es" + D.getDirección());
			}
			
			public void resultado2(DatosC D1) {
			     
			     Imprimir(" El Dni del Dueño es: " + D1.getDNI());
			     Imprimir(" El Telefono es: " + D1.getTelefono());
			}
			
			
			
		});
		btn_Procesar.setBounds(416, 65, 89, 23);
		contentPane.add(btn_Procesar);
	}
}
