package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Veterinaria.DatosMascota;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VDatosM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtD_Mascota;
	private JTextField TxtEspecie;
	private JTextField txtRaza;
	private JTextField textField;
	private ArrayList<DatosMascota> mascotas = new ArrayList<>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VDatosM frame = new VDatosM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VDatosM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escriba Especie de mascota: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 47, 162, 14);
		contentPane.add(lblNewLabel);

		JLabel lblEscribaDatosMascota = new JLabel("Escriba Datos mascota:");
		lblEscribaDatosMascota.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscribaDatosMascota.setBounds(10, 11, 152, 14);
		contentPane.add(lblEscribaDatosMascota);

		JLabel lblEscribaRazaDe = new JLabel("Escriba Raza de mascota:");
		lblEscribaRazaDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscribaRazaDe.setBounds(10, 83, 162, 14);
		contentPane.add(lblEscribaRazaDe);

		txtD_Mascota = new JTextField();
		txtD_Mascota.setBounds(181, 9, 152, 20);
		contentPane.add(txtD_Mascota);
		txtD_Mascota.setColumns(10);

		TxtEspecie = new JTextField();
		TxtEspecie.setBounds(182, 45, 152, 20);
		contentPane.add(TxtEspecie);
		TxtEspecie.setColumns(10);

		txtRaza = new JTextField();
		txtRaza.setBounds(182, 81, 151, 20);
		contentPane.add(txtRaza);
		txtRaza.setColumns(10);

		JLabel lblEscribaEdadDe = new JLabel("Escriba Edad de mascota:");
		lblEscribaEdadDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscribaEdadDe.setBounds(10, 120, 162, 14);
		contentPane.add(lblEscribaEdadDe);

		textField = new JTextField();
		textField.setBounds(181, 118, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 172, 445, 112);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombre = txtD_Mascota.getText();
					String especie = TxtEspecie.getText();
					String raza = txtRaza.getText();
					int edad = Integer.parseInt(textField.getText());

					mascotas.add(new DatosMascota(nombre, especie, raza, edad));

					JOptionPane.showMessageDialog(null, "Mascota agregada correctamente.");

					txtD_Mascota.setText("");
					TxtEspecie.setText("");
					txtRaza.setText("");
					textField.setText("");

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Edad inválida. Ingrese un número.");
				}
			}
		});
		btnAgregar.setBounds(378, 28, 89, 23);
		contentPane.add(btnAgregar);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				for (DatosMascota mascota : mascotas) {
					textArea.append(mascota.getInfo() + "\n");
				}
			}
		});
		btnMostrar.setBounds(378, 62, 89, 23);
		contentPane.add(btnMostrar);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtD_Mascota.setText("");
				TxtEspecie.setText("");
				txtRaza.setText("");
				textField.setText("");
				textArea.setText("");
			}
		});
		btnLimpiar.setBounds(378, 96, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
