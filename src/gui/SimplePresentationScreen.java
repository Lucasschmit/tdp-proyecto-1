package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lbl_Apellido;
	private JLabel lbl_LU;
	private JLabel lbl_Email;
	private JLabel lbl_Nombre;
	private JLabel lbl_GithubURL;
	private JTextField txt_LU;
	private JTextField txt_Apellido;
	private JTextField txt_Nombre;
	private JTextField txt_Email;
	private JTextField txt_GithubURL;
	private JLabel lbl_FechaGeneracion;
	private JLabel lbl_Imagen;
	private JPanel panel;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabbedPane.addTab("Informaci\u00F3n del alumno", null, tabInformation, "Muestra la informaci\u00F3n declarada por el alumno");
		GridBagLayout gbl_tabInformation = new GridBagLayout();
		gbl_tabInformation.columnWidths = new int[] {107, 293};
		gbl_tabInformation.rowHeights = new int[] {34, 34, 34, 34, 34};
		gbl_tabInformation.columnWeights = new double[]{0.0, 0.0};
		gbl_tabInformation.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		tabInformation.setLayout(gbl_tabInformation);
		
		lbl_LU = new JLabel("LU");
		GridBagConstraints gbc_lbl_LU = new GridBagConstraints();
		gbc_lbl_LU.anchor = GridBagConstraints.WEST;
		gbc_lbl_LU.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_LU.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_LU.gridx = 0;
		gbc_lbl_LU.gridy = 0;
		tabInformation.add(lbl_LU, gbc_lbl_LU);
		
		txt_LU = new JTextField(studentData.getId() + "");
		GridBagConstraints gbc_txt_LU = new GridBagConstraints();
		gbc_txt_LU.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_LU.insets = new Insets(5, 5, 5, 5);
		gbc_txt_LU.gridx = 1;
		gbc_txt_LU.gridy = 0;
		tabInformation.add(txt_LU, gbc_txt_LU);
		txt_LU.setColumns(10);
		
		lbl_Apellido = new JLabel("Apellido");
		GridBagConstraints gbc_lbl_Apellido = new GridBagConstraints();
		gbc_lbl_Apellido.anchor = GridBagConstraints.WEST;
		gbc_lbl_Apellido.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_Apellido.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_Apellido.gridx = 0;
		gbc_lbl_Apellido.gridy = 1;
		tabInformation.add(lbl_Apellido, gbc_lbl_Apellido);
		
		txt_Apellido = new JTextField(studentData.getLastName());
		GridBagConstraints gbc_txt_Apellido = new GridBagConstraints();
		gbc_txt_Apellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_Apellido.insets = new Insets(5, 5, 5, 5);
		gbc_txt_Apellido.gridx = 1;
		gbc_txt_Apellido.gridy = 1;
		tabInformation.add(txt_Apellido, gbc_txt_Apellido);
		txt_Apellido.setColumns(10);
		
		lbl_Nombre = new JLabel("Nombre");
		GridBagConstraints gbc_lbl_Nombre = new GridBagConstraints();
		gbc_lbl_Nombre.anchor = GridBagConstraints.WEST;
		gbc_lbl_Nombre.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_Nombre.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_Nombre.gridx = 0;
		gbc_lbl_Nombre.gridy = 2;
		tabInformation.add(lbl_Nombre, gbc_lbl_Nombre);
		
		txt_Nombre = new JTextField(studentData.getFirstName());
		GridBagConstraints gbc_txt_Nombre = new GridBagConstraints();
		gbc_txt_Nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_Nombre.insets = new Insets(5, 5, 5, 5);
		gbc_txt_Nombre.gridx = 1;
		gbc_txt_Nombre.gridy = 2;
		tabInformation.add(txt_Nombre, gbc_txt_Nombre);
		txt_Nombre.setColumns(10);
		
		lbl_Email = new JLabel("E-mail");
		GridBagConstraints gbc_lbl_Email = new GridBagConstraints();
		gbc_lbl_Email.anchor = GridBagConstraints.WEST;
		gbc_lbl_Email.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_Email.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_Email.gridx = 0;
		gbc_lbl_Email.gridy = 3;
		tabInformation.add(lbl_Email, gbc_lbl_Email);
		
		txt_Email = new JTextField(studentData.getMail());
		GridBagConstraints gbc_txt_Email = new GridBagConstraints();
		gbc_txt_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_Email.insets = new Insets(5, 5, 5, 5);
		gbc_txt_Email.gridx = 1;
		gbc_txt_Email.gridy = 3;
		tabInformation.add(txt_Email, gbc_txt_Email);
		txt_Email.setColumns(10);
		
		lbl_GithubURL = new JLabel("Github URL");
		GridBagConstraints gbc_lbl_GithubURL = new GridBagConstraints();
		gbc_lbl_GithubURL.anchor = GridBagConstraints.WEST;
		gbc_lbl_GithubURL.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_GithubURL.insets = new Insets(5, 5, 5, 5);
		gbc_lbl_GithubURL.gridx = 0;
		gbc_lbl_GithubURL.gridy = 4;
		tabInformation.add(lbl_GithubURL, gbc_lbl_GithubURL);
		
		txt_GithubURL = new JTextField(studentData.getGithubURL());
		GridBagConstraints gbc_txt_GithubURL = new GridBagConstraints();
		gbc_txt_GithubURL.insets = new Insets(5, 5, 5, 5);
		gbc_txt_GithubURL.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_GithubURL.gridx = 1;
		gbc_txt_GithubURL.gridy = 4;
		tabInformation.add(txt_GithubURL, gbc_txt_GithubURL);
		txt_GithubURL.setColumns(10);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		LocalDateTime fecha = LocalDateTime.now();
		String fechaDias = fecha.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		String fechaHora = fecha.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		lbl_FechaGeneracion = new JLabel("Esta ventana fue generada el " + fechaDias + " a las: " + fechaHora);
		contentPane.add(lbl_FechaGeneracion, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0};
		gbl_panel.rowHeights = new int[] {0};
		gbl_panel.columnWeights = new double[]{0.0};
		gbl_panel.rowWeights = new double[]{0.0};
		panel.setLayout(gbl_panel);
		lbl_Imagen = new JLabel();
		lbl_Imagen.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		System.out.println("path: " + studentData.getPathPhoto());
		GridBagConstraints gbc_lbl_Imagen = new GridBagConstraints();
		gbc_lbl_Imagen.fill = GridBagConstraints.BOTH;
		gbc_lbl_Imagen.insets = new Insets(10, 10, 10, 10);
		gbc_lbl_Imagen.gridx = 0;
		gbc_lbl_Imagen.gridy = 0;
		panel.add(lbl_Imagen, gbc_lbl_Imagen);
		lbl_Imagen.setIconTextGap(0);
		lbl_Imagen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_Imagen.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Imagen.setAlignmentX(Component.CENTER_ALIGNMENT);

	}
	
}
