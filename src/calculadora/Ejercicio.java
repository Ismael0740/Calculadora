package calculadora;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio {

	static String contador = "";
	static ArrayList<Integer> modificadores = new ArrayList<Integer>();
	static ArrayList<String> cadena = new ArrayList<String>();

	static JLabel resultado = new JLabel("--------- ");

	private static class EscuchadorInterno implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String comando = e.getActionCommand();
			switch (comando) {
			// DONE
			case "C":
				contador = "";
				cadena.clear();
				break;
			case "0":
				contador = contador + "0";
				break;
			case ".":
				contador = contador + ".";
				break;
			case "+":
				modificadores.add(1);
				cadena.add(contador);
				break;
			case "=":

				resultado.setText("----------" + Calculador(modificadores, cadena));
				break;
			case "1":
				contador = contador + "1";
				break;
			case "2":
				contador = contador + "2";
				break;
			case "3":
				contador = contador + "3";
				break;
			case "-":
				modificadores.add(2);
				cadena.add(contador);
				break;
			case "4":
				contador = contador + "4";
				break;
			case "5":
				contador = contador + "5";
				break;
			case "6":
				contador = contador + "6";
				break;
			case "X":
				modificadores.add(3);
				cadena.add(contador);
				break;
			case "/":
				modificadores.add(4);
				cadena.add(contador);
				break;
			case "7":
				contador = contador + "7";
				break;
			case "8":
				contador = contador + "8";
				break;
			case "9":
				contador = contador + "9";
				break;
			case "%":
				break;
			case "->":
				break;

			default:
				break;
			}
		}

	}

	public static double Calculador(ArrayList<Integer> modificadores, ArrayList<String> cadena) {

		int valor = 0;

		for (int i = 0; i < modificadores.size(); i++) {

			if (modificadores.get(i) == 1) {

				if (i == 0) {
					valor = Integer.parseInt(cadena.get(i)) + Integer.parseInt(cadena.get(i + 1));
				} else {
					valor = valor + Integer.parseInt(cadena.get(i + 1));
				}
			} else if (modificadores.get(i) == 2) {

				if (i == 0) {
					valor = Integer.parseInt(cadena.get(i)) - Integer.parseInt(cadena.get(i + 1));
				} else {
					valor = valor - Integer.parseInt(cadena.get(i + 1));
				}

			} else if (modificadores.get(i) == 3) {

				if (i == 0) {
					valor = Integer.parseInt(cadena.get(i)) * Integer.parseInt(cadena.get(i + 1));
				} else {
					valor = valor * Integer.parseInt(cadena.get(i + 1));
				}

			} else if (modificadores.get(i) == 4) {

				if (i == 0) {
					valor = Integer.parseInt(cadena.get(i)) / Integer.parseInt(cadena.get(i + 1));
				} else {
					valor = valor / Integer.parseInt(cadena.get(i + 1));
				}

			}

		}

		return valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setBounds(500, 200, 700, 700);

		JPanel panelCentral = new JPanel();
		JPanel panelSuperior = new JPanel();

		panelCentral.setLayout(new GridBagLayout());
		panelSuperior.setLayout(new GridBagLayout());
		EscuchadorInterno eb = new EscuchadorInterno();

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

		// Constraints son ajustes modificables que puedes aplicar a la hora de usar el
		// metodo .add para posicionar las piezas del frame

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0; // El área de texto empieza en la columna cero.
		constraints.gridy = 3; // El área de texto empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa dos columnas.
		constraints.gridheight = 1; // El área de texto ocupa dos filas.
		panelCentral.add(jbC, constraints);

		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb0, constraints);

		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbPoint, constraints);

		constraints.gridx = 3;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbPlus, constraints);

		constraints.gridx = 4;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbEquals, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb1, constraints);

		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb2, constraints);

		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb3, constraints);

		constraints.gridx = 3;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbMinus, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb4, constraints);

		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb5, constraints);

		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb6, constraints);

		constraints.gridx = 3;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbX, constraints);

		constraints.gridx = 4;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbDivide, constraints);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb7, constraints);

		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb8, constraints);

		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jb9, constraints);

		constraints.gridx = 3;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbPercent, constraints);

		constraints.gridx = 4;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		panelCentral.add(jbArrow, constraints);

		/////////////////////////////// LABEL//////////////////////////////////////

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 10;
		constraints.gridheight = 1;
		panelSuperior.add(resultado, constraints);

		frame.add(panelCentral, BorderLayout.CENTER);
		frame.add(panelSuperior, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);

	}

}