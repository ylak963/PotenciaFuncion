package es.studium.PotenciaFuncion;

import java.util.Scanner;

public class PotenciaFuncion {
	public static void main(String[] args)
	{
		int base, exponente;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la base:");
		base = teclado.nextInt();

		System.out.println("Introduce el exponente");
		exponente = teclado.nextInt();

		System.out.println(funcionPotencia(base, exponente));
		teclado.close();

	}
	public static int funcionPotencia(int a , int b)
	{
		int resultado =	1,i;
		for(i=1; i<=b; i++)
		{
			resultado = resultado *a;
		}
		//System.out.println(a+" " +"elevado a "+ b+" " + "vale:"+ resultado);
		return resultado;
	}

}
