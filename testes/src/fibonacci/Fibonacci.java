package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	private static int valorEntrada;

	public static void main(String[] args) {
		System.out.print("Insira valor: ");
		Scanner entrada = new Scanner(System.in);
		setValorEntrada(entrada.nextInt());
		entrada.close();
		if (getValorEntrada() < 0) {
			System.out.println("Valores inferiores a 0 são inválidos!!!");
		} else {
			System.out.println("Fibonacci Linear");
			System.out.printf("fib(%d) = %d\n", getValorEntrada(), fibLinear(getValorEntrada()));
			System.out.println("Fibonacci Recursivo");
			System.out.printf("fib(%d) = %d", getValorEntrada(), fibRecursivo(getValorEntrada()));
		}
	}

	public static int fibLinear(int valor) {
		int contador = 1;
		int temp = 0;
		int valor1 = 0;
		int valor2 = 1;
		do {
			if (valor == 0) {
				return valor;
			} else if (valor == 1) {
				return 1;
			}
			temp = valor1 + valor2;
			valor1 = valor2;
			valor2 = temp;

			contador++;
		} while (contador != valorEntrada);
		return temp;
	}

	public static int fibRecursivo(int valor) {
		if (valor == 0) {
			return valor;
		} else if (valor == 1) {
			return 1;
		} else {
			return fibRecursivo(valor - 1) + fibRecursivo(valor - 2);
		}
	}

	public static int getValorEntrada() {
		return valorEntrada;
	}

	public static void setValorEntrada(int valorEntrada) {
		Fibonacci.valorEntrada = valorEntrada;
	}

}
