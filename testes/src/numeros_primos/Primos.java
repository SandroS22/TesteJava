package numeros_primos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primos {

	private static int valorEntrada;

	public static void main(String[] args) {
		System.out.print("Insira valor: ");
		Scanner entrada = new Scanner(System.in);
		setValorEntrada(entrada.nextInt());
		entrada.close();
		if (getValorEntrada() <= 1) {
			System.out.println("Valores inferiores ou igual a 1 são inválidos!!!");
		} else {
			System.out.println("Primos Linear");
			System.out.println(primosLinear(getValorEntrada()));
			System.out.println(primosRecursivo(getValorEntrada(), 2));

		}
	}

	private static List<Integer> primosLinear(int valor) {
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < valor; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				primos.add(i);
			}
		}
		return primos;

	}

	private static List<Integer> primosRecursivo(int valor, int divisor) {
		List<Integer> primos = new ArrayList<>();
		// TODO
		return primos;
	}

	public static int getValorEntrada() {
		return valorEntrada;
	}

	public static void setValorEntrada(int valorEntrada) {
		Primos.valorEntrada = valorEntrada;
	}

}
