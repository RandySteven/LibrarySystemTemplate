import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main extends JFrame{

	//Memanggil panel
	JPanel northPanel, centerPanel, southPanel;
	
	void initiallize() {
		//Menginisialisasi panel
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		//Menambah panel ke dalam frame, meletakan panel sesuai dengan posisi border layout
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		north();
		center();
		south();
	}
	
	void north() {
		JLabel lblTitle = new JLabel("Library System");
		northPanel.add(lblTitle);
		lblTitle.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	//Memanggil komponen untuk isi centerpanel;
	JLabel lblBookName, lblBookWriter, lblBookGenre, lblBookPages;
	JTextField txtBookName, txtBookWriter, txtBookPages;
	JComboBox cmbGenres;
	void center() {
		//Membuat center panel set layout menjadi grid layout dengan 2 column saja
		centerPanel.setLayout(new GridLayout(0, 2));
		
		//Menambah table book
		JTable tblBook = new JTable();
		//Menambah scroll panel table book
		JScrollPane scpTblBook = new JScrollPane();
		
		//Memasukkan tblBook pada scpTblBook dengan tujuan agar tblBook bisa di scrollable
		scpTblBook.getViewport().add(tblBook);
		
		//Menambah scpTblBook pada centerPanel
		centerPanel.add(scpTblBook);

		//Membuat right panel
		JPanel rightPanel = new JPanel();
		
		//Menambah right panel pada center panel
		centerPanel.add(rightPanel);
	
		//Membuat right panel grid layout dengan 4 x 2
		rightPanel.setLayout(new GridLayout(4, 2, 10, 10));
		
		//Menginisialisasi komponen
		lblBookName = new JLabel("Book Name");
		lblBookWriter = new JLabel("Book Writter");
		lblBookGenre = new JLabel("Book Genre");
		lblBookPages = new JLabel("Book Pages");
		txtBookName = new JTextField();
		txtBookWriter = new JTextField();
		txtBookPages = new JTextField();
		
		//Menambah isi pada combo box genre
		cmbGenres = new JComboBox<>();
		cmbGenres.addItem("Sci-Fi");
		cmbGenres.addItem("Romance");
		cmbGenres.addItem("History");
		cmbGenres.addItem("Horror");
		cmbGenres.addItem("Psychological");
		
		//Menambah komponen pada right panel
		rightPanel.add(lblBookName);
		rightPanel.add(txtBookName);
		rightPanel.add(lblBookWriter);
		rightPanel.add(txtBookWriter);
		rightPanel.add(lblBookGenre);
		rightPanel.add(cmbGenres);
		rightPanel.add(lblBookPages);
		rightPanel.add(txtBookPages);
		
	}

	JButton btnAdd, btnUpdate, btnDelete;
	void south() {
		btnAdd = new JButton("Add");
		btnUpdate = new JButton("Update");
		btnDelete = new JButton("Delete");
		
		southPanel.setLayout(new FlowLayout());
		southPanel.add(btnAdd);
		southPanel.add(btnUpdate);
		southPanel.add(btnDelete);
	}
	
	
	public Main() {
		//Mengatur ukuran frame kita agar sesuai dengan layar
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		//Mengset layout frame kita menjadi border layout
		setLayout(new BorderLayout());
		
		//memanggil function initiallize();
		initiallize();

		//Membuat frame kita terlihat
		setVisible(true);
		
		//Membuat frame kita pop up di tenggah
		setLocationRelativeTo(null);
		
		//Menutup program dan men terminate program kita
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main();
	}

}
