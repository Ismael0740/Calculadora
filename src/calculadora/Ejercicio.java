package calculadora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio {

	static double contador = 0;

	static boolean decimal = false;

	static JTextField resultado = new JTextField("---------" + contador);

	private static class EscuchadorInterno implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String teclaPulsada = "";

			String comando = e.getActionCommand();
			switch (comando) {
			// DONE
			case "C":
				teclaPulsada = "C";

				contador = 0;
				break;
			case "0":
				teclaPulsada = "0";

				contador = contador + 0;
				break;
			case ".":
				teclaPulsada = ".";

				decimal = true;
				break;
			case "+":
				teclaPulsada = "+";

				break;
			case "=":
				decimal = false;

				teclaPulsada = "=";

				resultado.setText("----------" + contador);
				break;
			case "1":
				teclaPulsada = "1";

				if (decimal == true) {
					contador = contador + 0.1;
				} else {
					contador = contador + 1;
				}
				decimal = false;

				break;
			case "2":
				teclaPulsada = "2";

				if (decimal == true) {
					contador = contador + 0.2;
				} else {
					contador = contador + 2;
				}

				decimal = false;
				break;
			case "3":
				teclaPulsada = "3";

				if (decimal == true) {
					contador = contador + 0.3;
				} else {
					contador = contador + 3;
				}

				decimal = false;
				break;
			case "-":
				teclaPulsada = "-";

				break;
			case "4":
				teclaPulsada = "4";

				if (decimal == true) {
					contador = contador + 0.4;
				} else {
					contador = contador + 4;
				}

				decimal = false;
				break;
			case "5":
				teclaPulsada = "5";

				if (decimal == true) {
					contador = contador + 0.5;
				} else {
					contador = contador + 5;
				}

				decimal = false;
				break;
			case "6":
				teclaPulsada = "6";

				if (decimal == true) {
					contador = contador + 0.6;
				} else {
					contador = contador + 6;
				}

				decimal = false;
				break;
			case "X":
				teclaPulsada = "X";

				break;
			case "/":
				teclaPulsada = "/";

				break;
			case "7":
				teclaPulsada = "7";

				if (decimal == true) {
					contador = contador + 0.7;
				} else {
					contador = contador + 7;
				}

				decimal = false;
				break;
			case "8":
				teclaPulsada = "8";

				if (decimal == true) {
					contador = contador + 0.8;
				} else {
					contador = contador + 8;
				}

				decimal = false;
				break;
			case "9":
				teclaPulsada = "9";

				if (decimal == true) {
					contador = contador + 0.9;
				} else {
					contador = contador + 9;
				}

				decimal = false;
				break;
			case "%":
				teclaPulsada = "%";

				break;
			case "->":
				teclaPulsada = "->";

				break;

			default:
				break;
			}

			System.out.println("Has pulsado la tecla " + teclaPulsada);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setBounds(500, 200, 700, 700);

		JPanel panelCentral = new JPanel();
		JPanel panelSuperior = new JPanel();
		panelSuperior.setPreferredSize(new Dimension(200, 100));

		panelCentral.setLayout(new GridLayout());
		panelSuperior.setLayout(new GridLayout());
		EscuchadorInterno eb = new EscuchadorInterno();

		panelCentral.setLayout(new GridLayout(4, 5, 15, 15));
		panelSuperior.setLayout(new GridLayout(1, 1));

		JButton jbC = new JButton("C");
		JButton jb0 = new JButton("0");
		JButton jbPoint = new JButton(".");
		JButton jbPlus = new JButton("+");
		JButton jbEquals = new JButton("=");
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jbMinus = new JButton("-");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jbX = new JButton("X");
		JButton jbDivide = new JButton("/");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jbPercent = new JButton("%");
		JButton jbArrow = new JButton("->");

		jbC.addActionListener(eb);
		jb0.addActionListener(eb);
		jbPoint.addActionListener(eb);
		jbPlus.addActionListener(eb);
		jbEquals.addActionListener(eb);
		jb1.addActionListener(eb);
		jb2.addActionListener(eb);
		jb3.addActionListener(eb);
		jbMinus.addActionListener(eb);
		jb4.addActionListener(eb);
		jb5.addActionListener(eb);
		jb6.addActionListener(eb);
		jbX.addActionListener(eb);
		jbDivide.addActionListener(eb);
		jb7.addActionListener(eb);
		jb8.addActionListener(eb);
		jb9.addActionListener(eb);
		jbPercent.addActionListener(eb);
		jbArrow.addActionListener(eb);

		panelCentral.add(jb7);

		panelCentral.add(jb8);

		panelCentral.add(jb9);

		panelCentral.add(jbPercent);

		panelCentral.add(jbArrow);

		panelCentral.add(jb4);

		panelCentral.add(jb5);

		panelCentral.add(jb6);

		panelCentral.add(jbX);

		panelCentral.add(jbDivide);

		panelCentral.add(jb1);

		panelCentral.add(jb2);

		panelCentral.add(jb3);

		panelCentral.add(jbMinus);

		panelCentral.add(new JLabel(""));

		panelCentral.add(jbC);

		panelCentral.add(jb0);

		panelCentral.add(jbPoint);

		panelCentral.add(jbPlus);

		panelCentral.add(jbEquals);

		/////////////////////////////// TEXTFIELD//////////////////////////////////////

		panelSuperior.add(resultado);

		frame.add(panelCentral, BorderLayout.CENTER);
		frame.add(panelSuperior, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);

	}

}