package com.tetris.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameInstruction extends JFrame {

	JPanel panel;
	
	public GameInstruction() {

		
		panel = new JPanel();
		setTitle("Instrukcja obs�ugi");
		setContentPane(new JLabel(new ImageIcon("src/main/resources/TetrisGameManual.png")));
		setLayout(null);
		setSize(1125, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setFocusable(false);
		
	
		Font font = new Font("Arial", Font.PLAIN, 12);
		Font font2 = new Font("Arial Black", Font.PLAIN, 14);
		
		JTextField textfield1 = new JTextField();
		textfield1.setFont(font);
		textfield1.setEditable(false);
		textfield1.setText("    Gr� rozpoczynamy na pustej, prostok�tnej "
				+ "planszy zwanej tetrionem lub matriksem, u�o�onej kr�tszym bokiem w poziomie i maj�cej wymiary 20 wierszy na 10 kolumn.");
		textfield1.setBounds(85,90, 940,20);
		textfield1.setBorder(BorderFactory.createEmptyBorder());
		textfield1.setBackground(new Color(224, 224, 224));
		add(textfield1);
		
		JTextField textfield2 = new JTextField();
		textfield2.setFont(font);
		textfield2.setEditable(false);
		textfield2.setText("W trakcie gry, po�rodku g�rnej kraw�dzi"
				+ " planszy, pojawiaj� si� pojedynczo klocki z�o�one z czterech ma�ych kwadrat�w nazywanych te� blokami. Klocki te ");
		textfield2.setBounds(85,110,940, 20);
		textfield2.setBorder(BorderFactory.createEmptyBorder());
		textfield2.setBackground( new Color(224, 224, 224));
		add(textfield2);
		
		JTextField textfield3 = new JTextField();
		textfield3.setFont(font);
		textfield3.setEditable(false);
		textfield3.setText("(okre�lane mianem �tetrimino przemieszczaj� si� w kierunku dolnej kraw�dzi planszy (je�li nie natrafi� na przeszkod� zn�o�on� z innych klock�w, kt�re odpad�y wcze�niej).");
		textfield3.setBounds(85,130, 940, 20);
		textfield3.setBorder(BorderFactory.createEmptyBorder());
		textfield3.setBackground( new Color(224, 224, 224));
		add(textfield3);
		
		JTextField textfield4 = new JTextField();
		textfield4.setFont(font);
		textfield4.setEditable(false);
		textfield4.setText("Kiedy jedno tetrimino opadnie na samo dno, zostaje unieruchomione, a nast�pny klocek ukazuje si� u g�ry planszy. Gra trwa a� do momentu, w kt�rym klocek nie b�dzie");
		textfield4.setBounds(85,150, 940, 20);
		textfield4.setBorder(BorderFactory.createEmptyBorder());
		textfield4.setBackground( new Color(224, 224, 224));
		add(textfield4);
		
		JTextField textfield5 = new JTextField();
		textfield5.setFont(font);
		textfield5.setEditable(false);
		textfield5.setText("m�g� pojawi� si� na planszy.");
		textfield5.setBounds(85,170, 940, 20);
		textfield5.setBorder(BorderFactory.createEmptyBorder());
		textfield5.setBackground( new Color(224, 224, 224));
		add(textfield5);
		
		JTextField textfield6 = new JTextField();
		textfield6.setFont(font);
		textfield6.setEditable(false);
		textfield6.setText("    G��wnym zadaniem gracza jest uk�adanie tetrimino na planszy (poprzez wykorzystanie rotacji i przesuwanie klock�w w poziomie) w taki spos�b, aby kwadraty sk�adaj�ce");
		textfield6.setBounds(85,190, 940, 20);
		textfield6.setBorder(BorderFactory.createEmptyBorder());
		textfield6.setBackground( new Color(224, 224, 224));
		add(textfield6);
		
		JTextField textfield7 = new JTextField();
		textfield7.setFont(font);
		textfield7.setEditable(false);
		textfield7.setText("si� na nie utworzy�y wiersz na ca�ej szeroko�ci prostok�ta. W takiej sytuacji wiersz ten zostaje usuni�ty, a pozosta�e klocki opadaj� w kierunku dna, tworz�c wi�cej ");
		textfield7.setBounds(85,210, 940, 20);
		textfield7.setBorder(BorderFactory.createEmptyBorder());
		textfield7.setBackground( new Color(224, 224, 224));
		add(textfield7);
		
		JTextField textfield8 = new JTextField();
		textfield8.setFont(font);
		textfield8.setEditable(false);
		textfield8.setText("przestrzeni dla nast�pnych element�w. Po usuni�ciu okre�lonej liczby wierszy pr�dko�� gry wzrasta w zale�no�ci od wybranego poziomu trudno�ci, co w znacz�cy spos�b ");
		textfield8.setBounds(85,230, 940, 20);
		textfield8.setBorder(BorderFactory.createEmptyBorder());
		textfield8.setBackground( new Color(224, 224, 224));
		add(textfield8);
		
		JTextField textfield9 = new JTextField();
		textfield9.setFont(font);
		textfield9.setEditable(false);
		textfield9.setText("utrudnia precyzyjne sterowanie kolejnymi tetrimino. ");
		textfield9.setBounds(85,250, 940, 20);
		textfield9.setBorder(BorderFactory.createEmptyBorder());
		textfield9.setBackground( new Color(224, 224, 224));
		add(textfield9);
		
		JTextField textfield10 = new JTextField();
		textfield10.setFont(font);
		textfield10.setEditable(false);
		textfield10.setText("Mo�liwe jest jednoczesne usuni�cie maksymalnie 4 wierszy � umo�liwia to tetrimino �I�. Sytuacja taka nosi nazw� identyczn� jak gra, czyli �tetris�");
		textfield10.setBounds(85,270, 940, 20);
		textfield10.setBorder(BorderFactory.createEmptyBorder());
		textfield10.setBackground( new Color(224, 224, 224));
		add(textfield10);
		
		
		JTextField textfield11 = new JTextField();
		textfield11.setFont(font2);
		textfield11.setEditable(false);
		textfield11.setText("Opis rozgrywki");
		textfield11.setBounds(85,70, 440,20);
		textfield11.setBorder(BorderFactory.createEmptyBorder());
		textfield11.setBackground(new Color(224, 224, 224));
		add(textfield11);
		
		JTextField textfield12 = new JTextField();
		textfield12.setFont(font2);
		textfield12.setEditable(false);
		textfield12.setText("Rodzaje Tetrimino");
		textfield12.setBounds(85,300, 400,20);
		textfield12.setBorder(BorderFactory.createEmptyBorder());
		textfield12.setBackground(new Color(224, 224, 224));
		add(textfield12);
		
		JTextField textfield13 = new JTextField();
		textfield13.setFont(font);
		textfield13.setEditable(false);
		textfield13.setText("    Na zestaw tetrimino sk�ada si� siedem r�nych (tj. takich kt�re nie s� identyczne po wykonaniu rotacji) klock�w z�o�onych z kwadratowych element�w: ");
		textfield13.setBounds(85,320, 840,20);
		textfield13.setBorder(BorderFactory.createEmptyBorder());
		textfield13.setBackground(new Color(224, 224, 224));
		add(textfield13);
	}
}

