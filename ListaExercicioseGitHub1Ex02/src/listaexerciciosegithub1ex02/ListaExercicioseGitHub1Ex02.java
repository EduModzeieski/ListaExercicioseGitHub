package listaexerciciosegithub1ex02;

import java.util.Scanner;

public class ListaExercicioseGitHub1Ex02 {

    public static void main(String[] args) {

        System.out.println("Digite uma palara ou uma frase: ");
        Scanner Ler = new Scanner(System.in);
        String original = Ler.nextLine();
        String mod = substituirVogaisPorAsterisco(original);
        System.out.println(mod);

    }

    public static String substituirVogaisPorAsterisco(String input) {

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                resultado.append('*');
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
}
