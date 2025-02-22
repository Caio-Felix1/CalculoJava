import java.util.Scanner;

public class CalculoBasico {

    public static void soma(Scanner teclado) {
        int num1, num2, soma;

        System.out.print("Digite o primeiro valor (valor inteiro): ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor (valor inteiro): ");
        num2 = teclado.nextInt();
        teclado.nextLine();

        soma = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);
    }

    public static void subtracao(Scanner teclado) {
        int num1, num2, subtracao;

        System.out.print("Digite o primeiro valor (valor inteiro): ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor (valor inteiro): ");
        num2 = teclado.nextInt();
        teclado.nextLine();

        subtracao = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + subtracao);
    }

    public static void divisao(Scanner teclado) {
        float numerador, denominador, divisao;

        System.out.print("Digite o numerador (valor real): ");
        numerador = teclado.nextFloat();
        do {
            System.out.print("Digite o denominador (valor real): ");
            denominador = teclado.nextFloat();
            if (denominador == 0) {
                System.out.println("Não é possível fazer divisão por zero. Digite outro valor!");
            }
        } while (denominador == 0);
        teclado.nextLine();

        divisao = numerador / denominador;

        System.out.println(numerador + " / " + denominador + " = " + divisao);
    }

    public static void multiplicacao(Scanner teclado) {
        int num1, num2, multiplicacao;

        System.out.print("Digite o primeiro valor (valor inteiro): ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor (valor inteiro): ");
        num2 = teclado.nextInt();
        teclado.nextLine();

        multiplicacao = num1 * num2;

        System.out.println(num1 + " X " + num2 + " = " + multiplicacao);
    }
}
