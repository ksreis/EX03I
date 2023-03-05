package View;

import Controller.Soma;

public class Principal {
	public static void main(String[] args) {
    int n = 8;
    double soma = Soma.SSerie(n);
    System.out.println("A soma até " + n + " é: " + soma);
	}
}