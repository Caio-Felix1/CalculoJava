import java.util.Scanner;

public class CalculoBasico {

    public static void soma(Scanner teclado) {
        int num1, num2, soma;
        String negativo = "";

        System.out.print("Digite o primeiro valor (valor inteiro): ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor (valor inteiro): ");
        num2 = teclado.nextInt();

        System.out.println();
        teclado.nextLine();

        soma = num1 + num2;

        negativo += (num2 < 0)? "(" + num2 + ")": num2;

        System.out.println("Soma: " + num1 + " + " + negativo + " = " + soma);
    }

    public static void subtracao(Scanner teclado) {
        int num1, num2, subtracao;
        String negativo = "";

        System.out.print("Digite o primeiro valor (valor inteiro): ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor (valor inteiro): ");
        num2 = teclado.nextInt();

        System.out.println();
        teclado.nextLine();

        subtracao = num1 - num2;

        negativo += (num2 < 0)? "(" + num2 + ")": num2;

        System.out.println("Subtração: " + num1 + " - " + negativo + " = " + subtracao);
    }

    public static void divisao(Scanner teclado) {
        float numerador, denominador, divisao;
        String negativo = "", divisao_formatada;

        System.out.print("Digite o numerador (valor real): ");
        numerador = teclado.nextFloat();
        do {
            System.out.print("Digite o denominador (valor real): ");
            denominador = teclado.nextFloat();
            if (denominador == 0) {
                System.out.println("Não é possível fazer divisão por zero. Digite outro valor!");
            }
        } while (denominador == 0);

        System.out.println();
        teclado.nextLine();

        divisao = numerador / denominador;
        divisao_formatada = String.format("%.2f", divisao);

        negativo += (denominador < 0)? "(" + denominador + ")": denominador;

        System.out.println("Divisão: " + numerador + " / " + negativo + " = " + divisao_formatada);
    }

    public static void multiplicacao(Scanner teclado) {
        int num1, num2, multiplicacao;
        String negativo = "";

        System.out.print("Digite o primeiro valor (valor inteiro): ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor (valor inteiro): ");
        num2 = teclado.nextInt();

        System.out.println();
        teclado.nextLine();

        multiplicacao = num1 * num2;

        negativo += (num2 < 0)? "(" + num2 + ")": num2;

        System.out.println("Multiplicação: " + num1 + " x " + negativo + " = " + multiplicacao);
    }
}
