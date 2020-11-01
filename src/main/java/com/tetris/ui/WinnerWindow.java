package com.tetris.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WinnerWindow extends JFrame implements ActionListener {

	String userNameString = "";
	JButton okButton;
	JTextField jtextField;
	String[] splitted;
	String[] tabelaGraczyString = new String[91];
	int score = 0;
	String gameLevelHard;
	boolean assignScore = false;

	public WinnerWindow(String gameLevelHard, int score) {
		this.score = score;
		this.gameLevelHard = gameLevelHard;
		setTitle("!!! GRATULACJE WYNIKU !!!");
		setBackground(new Color(224, 224, 224));
		setLayout(null);
		setSize(550, 350);
		setResizable(false);
		setLocationRelativeTo(null);
		setFocusable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblName = new JLabel("Podaj swój nick:");
		lblName.setFont(new Font("Arial", Font.BOLD, 15));
		lblName.setBounds(70, 70, 150, 20);
		lblName.setBorder(BorderFactory.createEmptyBorder());
		lblName.setBackground(new Color(224, 224, 224));
		getContentPane().add(lblName);

		jtextField = new JTextField();
		jtextField.setBounds(210, 70, 150, 20);
		jtextField.setBorder(BorderFactory.createEmptyBorder());
		getContentPane().add(jtextField);

		okButton = new JButton("OK");
		okButton.setBounds(180, 130, 100, 50);
		okButton.addActionListener(this);
		getContentPane().add(okButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == okButton) {
			userNameString = jtextField.getText();
			// score;
			// gameLevelHard

			if (gameLevelHard.equals("Latwy")) {
				for (int i = 3; i <= 30;) {
					
					
					
					//String str = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]";
					//int[] arr = Arrays.stream(str.substring(1, str.length()-1).split(","))
					//    .map(String::trim).mapToInt(Integer::parseInt).toArray();
					//System.out.println(Arrays.toString(arr));
					
					
					//if (score <= Integer.parseInt(tabelaGraczyString[i])) {
					//	i = i + 3;
					//}  if (score >= Integer.parseInt(tabelaGraczyString[i]) && !assignScore) {
					//	tabelaGraczyString[i] = String.valueOf(score);
					//	tabelaGraczyString[i-1] = userNameString;
					//	assignScore = true;
					//}
				}
			}

			if (gameLevelHard.equals("Sredni")) {

			}

			if (gameLevelHard.equals("Trudny")) {

			}
		}

	}

	public void loadUserScoreFromFile() {

		try {
			FileInputStream fstream = new FileInputStream("userhighscore.txt");

			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			while ((strLine = br.readLine()) != null) {

				splitted = strLine.split("#");

				for (int i = 0; i < splitted.length; i++)
					tabelaGraczyString[i] = splitted[i];
			}
			in.close();
			br.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
