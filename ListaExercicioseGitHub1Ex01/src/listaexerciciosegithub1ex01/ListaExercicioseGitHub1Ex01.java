package listaexerciciosegithub1ex01;

import java.util.Scanner;

public class ListaExercicioseGitHub1Ex01 {

    public static boolean ehNumeroPerfeito(int numero) {

        if (numero <= 1) {
            return false;
        }

        int somaDivisores = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Insira um número para verificar se é um número perfeito: ");
        int numero = Ler.nextInt();
        if (ehNumeroPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }
}
