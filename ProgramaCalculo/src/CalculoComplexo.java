import java.util.Scanner;

public class CalculoComplexo {

    public static void media(Scanner teclado) {
        float soma = 0, media, num;
        int cont = 0;
        String valor_formatado;

        do {
            System.out.print("Digite um valor (valor real) [0 para parar]: ");
            num = teclado.nextFloat();
            if (num != 0) {
                soma += num;
                cont++;
            }
        } while (num != 0);

        System.out.println();
        teclado.nextLine();

        if (cont != 0) {
            media = soma / cont;

            valor_formatado = String.format("%.2f", media);

            System.out.println("Média: " + soma + " / " + cont + " = " + valor_formatado);
        } else {
            System.out.println("A média não foi calculada.");
        }
    }

    public static void fatorial(Scanner teclado) {
        int num, f = 1;
        String texto = "";

        do {
            System.out.print("Digite o número que você deseja o fatorial (valor inteiro): ");
            num = teclado.nextInt();
            if (num < 0) {
                System.out.println("Não existe fatorial de número negativo. Digite novamente!");
            }
        } while (num < 0);

        System.out.println();
        teclado.nextLine();

        if (num == 0 || num == 1) {
            System.out.println(num + "! = 1");
        } else {
            for (int i = num; i > 1; i--) {
                f *= i;
                texto += i + " x ";
            }
            System.out.println(texto + "1 = " + f);
        }
    }

    public static void bhaskara(Scanner teclado) {
        int a, b, c, delta;
        float x1, x2, raiz;
        String raiz_formatada;

        System.out.println("Δ = B² - 4 x A x C");

        do {
            System.out.print("Digite o valor de A (valor inteiro): ");
            a = teclado.nextInt();
            if (a == 0) {
                System.out.println("O valor de A não pode ser zero, pois isso tornaria a equação quadrática em uma " +
                        "equação linear. Digite novamente!");
            }
        } while (a == 0);

        System.out.print("Digite o valor de B (valor inteiro): ");
        b = teclado.nextInt();
        System.out.print("Digite o valor de C (valor inteiro): ");
        c = teclado.nextInt();

        System.out.println();
        teclado.nextLine();

        delta = (b * b) - 4 * a * c;
        System.out.println("Δ = " + b + "² - 4 x " + a + " x " + c + " = " + delta);

        if (delta > 0) {
            raiz = (float) Math.sqrt(delta);
            raiz_formatada = String.format("%.2f", raiz);

            x1 = ((-b) + raiz) / (2 * a);
            x2 = ((-b) - raiz) / (2 * a);

            System.out.println("Raiz de delta: √" + delta + " = " + raiz_formatada);

            System.out.println("Valor de X1: (-(" + b + ") + " + raiz_formatada + ") / (2 * " +
                    a + ") = " + x1);
            System.out.println("Valor de X2: (-(" + b + ") - " + raiz_formatada + ") / (2 * " +
                    a + ") = " + x2);

        } else if (delta == 0) {
            raiz = (float) Math.sqrt(delta);

            x1 = ((-b) + raiz) / (2 * a);

            System.out.println("Raiz de delta: √0 = 0");

            System.out.println("Valores de X1 e X2: (-(" + b + ") ± 0) / (2 * " + a + ") = " + x1);

        } else {
            System.out.println("Não possui raízes no conjunto dos números reais, pois o valor de delta é negativo.");
        }
    }
}
