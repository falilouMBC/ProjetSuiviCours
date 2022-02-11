package com.projet.UI;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.projet.metier.Metier;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

public class Authentifier extends JFrame {
	
	private JPasswordField pwdField;
	private JTextField loginField;
	private JButton btnConnecter;
	
	public Authentifier() {
		addListeners();
		initConponents();
	}
	

	private void addListeners() {
		
		btnConnecter.addMouseListener(

				new MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent e) {
						String login = loginField.getText();
						char[] pwdArray = pwdField.getPassword();
						String password = String.valueOf(pwdArray);
						boolean statut = Metier.authentifier(login, password);
						if(statut == true) {
							JOptionPane.showMessageDialog(null,"Authentification","Vous etes authentifié",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null,"Authentification","erreur authentification",JOptionPane.INFORMATION_MESSAGE);
						}
					}

				});
	}
	
	public void initConponents()
	{
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		panel.add(lblNewLabel_1);
		
		loginField = new JTextField();
		panel.add(loginField);
		loginField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("password");
		panel.add(lblNewLabel);
		
		pwdField = new JPasswordField(10);
		panel.add(pwdField);
		pwdField.setColumns(10);
		
		JButton btnConnecter = new JButton("Sign up");
		panel.add(btnConnecter);
	}

	
	public void MontreToi() {
		this.setVisible(true);
	}

}
