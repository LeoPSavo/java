/*Calculadora Gráfica exercicio cap.3 Java How Programming
Leonardo Paulo dos Santos	
13/03/2021*/

import javax.swing.JOptionPane; //pacote gráfico
import java.lang.*; //pacote para tratar as variaveis de String para float

public class Calc
{
	public static void main(String[] args)
	{
		String n1 = JOptionPane.showInputDialog("Entre com o primeiro numero:");
		String n2 = JOptionPane.showInputDialog("Entre com o primeiro numero:");
		 
		 //tratamento das variaveis e realizacao do calculo
		float resultado = (Float.parseFloat(n1) + Float.parseFloat(n2));
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}

